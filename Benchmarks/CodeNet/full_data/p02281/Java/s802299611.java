import java.io.*;
import java.util.*;

//height 違う
public class Main{
    static int count =0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
     
        //Prepare
        str = br.readLine();
        int n = Integer.parseInt(str);

        Nodes[] nodes = new Nodes[n];
        for(int i=0;i<n;i++){
            str = br.readLine();
            String[] tmpA = str.split("\\s");
            for(int j=0;j<n;j++){
                if(j == Integer.parseInt(tmpA[0])){
                    nodes[j] = new Nodes(Integer.parseInt(tmpA[0]),Integer.parseInt(tmpA[1]),Integer.parseInt(tmpA[2]));
                }
            }
        }

        //Looking for P 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i != j){
                    if(nodes[i].DL == nodes[j].N || nodes[i].DR == nodes[j].N){
                        nodes[j].P = i;
                    }
                }
            }

        }
        //Type & degree & height & depth
        int PN =0;
        for(int i=0;i<n;i++){
            if(nodes[i].P == -1){
                nodes[i].Type = "root";
                PN =i;
            }else if(nodes[i].DL ==-1 && nodes[i].DR == -1){
                nodes[i].Type = "leaf";
            }else{
                nodes[i].Type = "internal node";
            }

            int cou = 0;
            if(nodes[i].DL != -1){
                cou++;
            }
            if(nodes[i].DR !=-1){
                cou++;
            }
            nodes[i].Deg = cou;


            nodes[i].H = getHeight(nodes,nodes[i].DL,nodes[i].DR,0);
            nodes[i].Dep = getDep(nodes,i,0);

            for(int j=0;j<n;j++){
                if(i != j){
                    if(nodes[i].P == nodes[j].P){
                        nodes[i].S = nodes[j].N;
                        nodes[j].S = nodes[i].N;
                    }
                }
            }
        }
        
        //preorder
        System.out.println("Preorder");
        ArrayList<Integer> q = new ArrayList<Integer>();
        int root =0;
        for(int i=0;i<n;i++){
            if(nodes[i].P ==-1){
                root = i;
                Preorder(nodes,root,q);
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(" ");
            System.out.print(q.get(i));
        }
        System.out.print("\n");
        
        //Inorder
        System.out.println("Inorder");
        q.clear();
       Inorder(nodes,root,q);
       for(int i=0;i<n;i++){
        System.out.print(" ");
        System.out.print(q.get(i));
    }
    System.out.print("\n");


       //Postorder
       System.out.println("Postorder");
       q.clear();
      Postorder(nodes,root,q);
        for(int i=0;i<n;i++){
            System.out.print(" ");
            System.out.print(q.get(i));
        }
        System.out.print("\n");


        
    }

    //leaf まで潜っていく。左と右それぞれに進む。　進んだ数＝height　で右と左の大きい方が答え
    public static int getHeight(Nodes[] nodes,int DL,int DR,int Height){
        int HL = 0;
        int HR = 0;

        if(DL ==-1 && DR ==-1){
            
            return Height;

        }else{
            
            if(DL != -1){
            HL = Height + 1;
            HL = getHeight(nodes,nodes[DL].DL,nodes[DL].DR,HL);
            }

            if(DR != -1){
                HR = Height + 1;
                HR = getHeight(nodes,nodes[DR].DL,nodes[DR].DR,HR);
            }
            
            return Math.max(HL,HR);
        }
    }

    public static int getDep(Nodes[] nodes,int i,int d){
        if(nodes[i].P != -1){
            d++;
            return getDep(nodes,nodes[i].P,d);
        }else{
            return d;
        }
    }

    //全体的にやりなおし
    public static void Preorder(Nodes[] nodes,int i,ArrayList<Integer> q){
        //まず左に潜るだけ潜る。右しかなければ右に行く。どちらも無ければ前に戻って右にいく。
        //もし全部の数字がDequeにあれば終わり。
        if(nodes.length == q.size()){
            return;
        }else if(i != -1){
            q.add(i);
            Preorder(nodes,nodes[i].DL,q);
            Preorder(nodes,nodes[i].DR,q);
        }else{
            return;
            }
    }

    //左端発見
    public static int FL(Nodes[] nodes,int num){
        //rootから始まる
        int Lef = nodes[num].DL;
        int Rei = nodes[num].DR;
        if(Lef ==-1 && Rei ==-1){
            return num;
        }else if(Lef != -1){
            return FL(nodes,Lef);
        }else{
            return FL(nodes,Rei);
        }
    }


    public static void Inorder(Nodes[] nodes,int i,ArrayList<Integer> q){
        //root start
        if(nodes.length == q.size()){
            return;
        }else if(i != -1){
            Inorder(nodes,nodes[i].DL,q);
            q.add(i);
            Inorder(nodes,nodes[i].DR,q);
        }else{
            return;
            }
    }

public static void Postorder(Nodes[] nodes,int i,ArrayList<Integer> q){
    //root start
    if(nodes.length == q.size()){
        return;
    }else if(i != -1){
        Postorder(nodes,nodes[i].DL,q);
        Postorder(nodes,nodes[i].DR,q);
        q.add(i);
    }else{
        return;
        }
}
}

class Nodes{
    int N;//Node
    int P;//親ノード
    int S;//sibling
    int DL;//left child
    int DR;//右の子
    int Deg;
    int Dep;//depth
    int H;//height
    String Type;
    
    Nodes(int a,int b,int c){
        this.N =a;
        this.DL = b;
        this.DR = c;
        this.P =-1;
        this.S = -1;
        this.Deg = -1;
        this.Dep = 0;
        this.Type = "leaf";
    }
}
