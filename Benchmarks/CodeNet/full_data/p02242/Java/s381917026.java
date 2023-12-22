import java.util.*;
import java.io.*;

public class Main{
    static int INFTY = Integer.MAX_VALUE;
        
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
    //    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    try{
    //        int n = Integer.parseInt(br.readLine());

            //「最小経路木V」に頂点を一つずつ入れていく
            int[] color = new int[n];   //0:未探索, -1:探索中(周辺), +1:最小経路木に追加済
            int[][] M = new int[n][n];
            int[] d = new int[n];       //Vからの最短距離
            int[] p =new int[n];       //親(一意に定まる)を記録
            //初期化
            for (int i=0;i<n;i++){
                d[i]=INFTY;
                for (int j=0;j<n;j++){
                    M[i][j]=INFTY;
                }
            }
            p[0] =-1;
            d[0]=0;

            for(int i=0;i<n;i++){
                sc.nextInt();   //ノードIDはいったん捨てる
                int m=sc.nextInt();
                for (int j=0;j<m;j++){
                    int s = sc.nextInt();   //隣接ノード
                    int t = sc.nextInt();   //重さ
                    M[i][s]=t;

                }
            }

            int u=0;        //Vに追加する頂点
            while(true){
                int mincost=INFTY;
                for(int i=0;i<n;i++){
                    if (color[i]!=1 && d[i]<mincost){
                        mincost=d[i];
                        u=i;                            //Vから一番近い頂点を選択
                    }
                }
                if (mincost==INFTY){                    //すべて探索済みだったら終了
                    break;
                }
                color[u]=1;                             //uを探索済みにする

                for(int i=0;i<n;i++){
                    if(color[i]!=1&&M[u][i]!=INFTY){       //uと結ばれている頂点について、d[]が更新できるなら更新し、親をuとする
                        if(d[u]+M[u][i]<d[i]){              //新規にVに追加されたuを経由して最小経路が作れるならd[]を更新
                            d[i]=d[u]+M[u][i];
                            p[i]=u;
                            //color[i]=-1;　            ←本には載ってたけどこれいらなくない？
                        }
                    }
                }
            }
            for(int i=0;i<n;i++){
                System.out.println(i+" "+d[i]);
            }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        
    }
    
}


    
