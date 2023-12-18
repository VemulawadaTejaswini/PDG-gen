import java.util.*;

public final class Main {


    static int N;

    static int M;


   static  int[][] edges;
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        N = s.nextInt();

        M = s.nextInt();



        edges = new int[N+1][N+1];

        for (int i = 0; i <= N; i ++) {

            for (int j = 0; j <= N; j++) {

                edges[i][j] = -1;
            }
        }
        for (int i = 0; i  < M; i++) {

            int a = s.nextInt();

            int b = s.nextInt();

            int w = s.nextInt();

            int r1 = dfs(a,b);


            int k = -1;
            if (r1 != -1) {

                if (r1 != w) {

                    System.out.print("No");

                    return;
                }
            } else if ( (k =dfs(b,a)) > 0 || (k==0 && w != 0)) {

                System.out.print("No");

                return;
            }

            edges[a][b] = w;



        }

        System.out.print("Yes");

    }


    public  static int dfs(int i , int j) {

        if (i == j)  {

            return 0;
        }

        int[] e = edges[i];

        int result = -1;
        for (int k = 1; k <=N; k++) {

            int weight = e[k];

            if (weight != -1 && k != i) {

                int r2 = dfs(k,j);

                if (r2 != -1) result = r2 + weight;
            }
        }

        return result;
    }


}