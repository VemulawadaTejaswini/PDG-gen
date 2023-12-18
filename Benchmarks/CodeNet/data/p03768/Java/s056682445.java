import java.util.*;

public class Main {
    //ワーシャルフロイド???
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int INF = 300000;
        int[][] V = new int[N][N];

        //init
        for(int i=0;i<N;i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    V[i][j]=0;
                }else{
                    V[i][j]=INF;
                }
            }
        }

        int[] colors = new int[N];

        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a--;
            b--;
            V[a][b] = 1;
            V[b][a] = 1;
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++) {
                    V[i][j] = Math.min(V[i][j], V[i][k] + V[k][j]);
                }
            }
        }

        int Q = sc.nextInt();

        for(int i=0;i<Q;i++){
            int v = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            v--;


            colors[v]=c;
            for(int j=0;j<N;j++){
               if(d >= V[v][j]){
                   colors[j]=c;
               }
            }
        }

        for(int i :colors){
            System.out.println(i);
        }
    }
}


