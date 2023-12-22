import java.util.Scanner;

public class MST {
    public static final int WHITE = 0;
    public static final int GRAY = 1;
    public static final int BLACK = 2;
    public static final int INF = Integer.MAX_VALUE;


    public MST() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] G = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int w = sc.nextInt();
                G[i][j] = (w == -1) ? INF : w;
            }
        }
        int res = prim(n, G);
        System.out.println(res);


    }

    private static int prim(int n, int[][] G) {
        int u;
        int minv;
        int[] d = new int[n];
        int[] p = new int[n];
        int[] color = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = INF;
            p[i] = -1;
            color[i] = WHITE;
        }

        d[0] = 0;

        while (true) {
            minv = INF;
            u = -1;
            for (int i = 0; i < n; i++) {
                if (d[i] < minv && color[i] != BLACK) {
                    u = i;
                    minv = d[i];
                }
            }
            if(u==-1){
                break;
            }
            color[u]=BLACK;

            for(int v=0;v<n;v++){
                if(color[v] != BLACK && G[u][v] != INF){
                    if(d[v] > G[u][v]) {
                        d[v] = G[u][v];
                        p[v] = u;
                        color[v] = GRAY;
                    }
                }
            }
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(p[i] != -1){
                sum += G[i][p[i]];
            }
        }
        return sum;
    }
}

