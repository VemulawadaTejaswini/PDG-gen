import java.io.*;
import java.util.*;


public class Main{
    static int count =0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
     
        str = br.readLine();
        int n = Integer.parseInt(str);

        Nodes[] line = new Nodes[n];
        
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            line[i] = new Nodes();
            str = br.readLine();
            String[] tmp = str.split("\\s");

            int[] row = new int[tmp.length];//rowは節点の数字
            for(int j=0;j<tmp.length;j++){
                row[j] = Integer.parseInt(tmp[j]);
            }
            
            //Fisrt:determin ID
            line[i].ID=row[0];

            //Second:detrmin Ck
            if(row[1] != 0){
                line[i].Ck = new int[row[1]];
                for(int j=0;j<row[1];j++){
                    line[i].Ck[j] = row[2+j];
                }
            }
        }

        //Third :determin P ここがオカシイ！！
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i != j && line[j].Ck != null ){
                    for(int k=0;k<line[j].Ck.length;k++){
                        if(line[i].ID == line[j].Ck[k]){
                            line[i].P = line[j].ID;

                        }
                    }
                }
            }
        }
/*
        for(int i=0;i<n;i++){
            System.out.print(line[i].ID);
            System.out.print(" ,");
            System.out.print(line[i].P);
            System.out.print(" ,");
            if(line[i].Ck != null){
                for(int j=0;j<line[i].Ck.length;j++){
                    System.out.print(line[i].Ck[j]);
                    System.out.print(" ,");
                }
            }
            System.out.print("\n");
        }
*/


        //Forth:determin D & Type ,restart from here
        for(int i=0;i<n;i++){
            line[i].D = FindD(line,line[i].P,0);

            if(line[i].P == -1){
                line[i].Type = "root";
            }else if(line[i].Ck == null){
                line[i].Type = "leaf";
            }else{
                line[i].Type = "internal node";
            }
        
            ans.append("node ");
            ans.append(line[i].ID);
            ans.append(": parent = ");
            ans.append(line[i].P);
            ans.append(", depth = ");
            ans.append(line[i].D);
            ans.append(", ");
            ans.append(line[i].Type);
            ans.append(", [");
            if(line[i].Ck != null){
                for(int j=0;j<line[i].Ck.length;j++){
                    ans.append(line[i].Ck[j]);
                    if(j != line[i].Ck.length-1){
                        ans.append(",");
                    }else{
                        ans.append("]\n");
                        }
                    }
                }
            }else{
                ans.append("]\n");
            }
        }
        
        System.out.print(ans.toString());
    }
    public static int FindD(Nodes[] line,int P,int depth){//depth = 0で入力
        if(P != -1){
            depth++;
            depth = FindD(line,line[P].P,depth);
        }
        return depth;
    }

}

class Nodes{
    int ID;//node
    int P;//親ノード
    int D;//depth
    String Type;//root,internal node,leaf
    int[] Ck;//節点
    Nodes(){
        this.ID = -1;
        this.P =-1;
        this.D =0;
        this.Type = "leaf";
    }
}
