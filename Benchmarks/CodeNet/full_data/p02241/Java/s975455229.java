
import java.util.Scanner;
public class Main {
    static final int INF = Integer.MAX_VALUE;
    static final int WHITE = 0;
    static final int GRAY  = 1;
    static final int BLACK = 2;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] g = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int in = sc.nextInt();
                g[i][j] = in == -1 ? INF : in;
            }
        }
        
        System.out.println(prim(g, n));
    }
    
    // g[u][v]にuからvへの辺の重みが記録されている。
    static int prim(int[][] g, int n) {
        int u;
        int minV;
        int[] d = new int[n];     // 「T (T: MSTに属する頂点の集合) に属する頂点」と「V-T (V: グラフの全頂点) に属する頂点」をつなぐ辺の中で、重みが最小の辺の重み
        int[] p = new int[n];     // MSTにおける、頂点vの親
        int[] color = new int[n]; // vの訪問状態
        
        for (int i = 0; i < n; i++) {
            d[i] = INF;
            p[i] = -1;
            color[i] = WHITE;
        }
        
        d[0] = 0;
        
        while(true) {
            minV = INF;
            u = -1;
            for (int i = 0; i < n; i++) {
                if (minV > d[i] && color[i] != BLACK) {
                    u = i;
                    minV = d[i];
                }
            }
            if (u == -1) break;
            color[u] = BLACK;
            for (int v = 0; v < n; v++) {
                if (color[v] != BLACK && g[u][v] != INF) {
                    if (d[v] > g[u][v]) {
                        d[v] = g[u][v];
                        p[v] = u;
                        color[v] = GRAY;
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] != -1) sum += g[i][p[i]];
        }
        return sum;
    }
}

