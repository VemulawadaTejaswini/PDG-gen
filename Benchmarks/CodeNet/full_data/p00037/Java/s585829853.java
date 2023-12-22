
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static void run(){
        int[][] move = {{-1,0},{0,1},{1,0},{0,-1}};
        char[] ch = {'U','R','D','L'};
        Scanner sc = new Scanner(System.in);
        boolean[][] e = new boolean[25][25];
        int h = 0, t = 0;
        for(int x=0;x<9;x++){
            char[] s = sc.next().toCharArray();
            for(int j=0;j<s.length;j++){
                if(s[j]=='0')continue;
                if(t==0)e[h*5+j][h*5+j+1] = e[h*5+j+1][h*5+j] = true;
                else e[h*5+j][(h+1)*5+j] = e[(h+1)*5+j][h*5+j] = true;
            }
            if(t==1)h++;
            t=(t+1)%2;
        }
        int i=0, j=0, d=1;
        StringBuilder sb = new StringBuilder();
        boolean con = true;
        while(con){
            for(int k=3;k<=6;k++){
                int nd = (d+k)%4;
                int ni = i+move[nd][0];
                int nj = j+move[nd][1];
                if(0<=ni&&ni<5&&0<=nj&&nj<5&&e[i*5+j][ni*5+nj]){
                    sb.append(ch[nd]);
                    i = ni; j = nj; d = nd;
                    if(i==0&&j==0)con = false;
                    break;
                }
            }
        }
        System.out.println(sb);
    }
    
    static int horW[]=new int[20],verW[]=new int[20];
    public static void main(String[] args)  {
        run(); if(horW[0]==0)return;
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        ArrayList<Character>walk=new ArrayList<Character>();
        while((line=br.readLine())!=null){
            for(int i=0;i<4;i++) horW[i]=Integer.parseInt(line.charAt(i)+"");
            for(int i=0;i<4;i++){
                
                line=br.readLine();
                for(int j=0;j<5;j++)verW[5*i+j]=Integer.parseInt(line.charAt(j)+"");
                line=br.readLine();
                for(int j=0;j<4;j++)horW[4*(i+1)+j]=Integer.parseInt(line.charAt(j)+"");
                
            }
            break;
        }
            //System.out.println("hW"+Arrays.toString(horW));
            //System.out.println("vW"+Arrays.toString(verW));
        walk.add('R');
        walkon(walk,1,0);
        for(char ch : walk) System.out.print(ch+"");
            System.out.println("");
              
        }catch(Exception e){}
    }
    static void walkon(ArrayList<Character>walk,int x, int y){
        char preD=walk.get(walk.size()-1);char nextD='1';int nX=x,nY=y;
        int uW = (y==0)? 0:verW[(y-1)*5+x]; int dW = (y==4)? 0: verW[y*5+x];
        int rW = (x==4)? 0:horW[x+4*y]; int lW =(x==0)? 0: horW[x-1+4*y];
        switch(preD){
            case 'R':
                if(uW==1){nextD='U';nY--;}
                else if(rW==1){nextD='R';nX++;}else if(dW==1){nextD='D';nY++;}
                break;
            case 'U':
                if(lW==1){nextD='L';nX--;}else if(uW==1){nextD='U';nY--;}
                else if(rW==1){nextD='R';nX++;}
                break;
            case 'L':
                if(dW==1){nextD='D';nY++;}else if(lW==1){nextD='L';nX--;}
                else if(uW==1){nextD='U';nY--;}break;
            case 'D':
                if(rW==1){nextD='R';nX++;}else if(dW==1){nextD='D';nY++;}
                else if(lW==1){nextD='L';nX--;}break;
        }
        walk.add(nextD);
        if(nX==0&&nY==0)return ;
        else walkon(walk,nX,nY);
    }
}