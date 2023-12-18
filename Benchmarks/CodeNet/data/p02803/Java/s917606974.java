import java.util.*;
 
public class Main {

    private static final int INF = 1_000_000_000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] S = new char[H][W];
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                S[i][j]= s.charAt(j);
            }
        }

        int[] ii = new int[H*W];
        int[] jj = new int[H*W];
        int ti = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                ii[ti] = i;
                jj[ti] = j;
                ti++;
            }
        }

        int[][] dist = new int[H*W][H*W];
        for (int p = 0; p < H*W; p++) {
            for (int q = 0; q < H*W; q++) {
                if (p == q)  {
                    dist[p][q] = 0;
                } else {
                    dist[p][q] = INF;
                    dist[q][p] = INF;
                }
            }
        }

        // up, down, left, right
        int[] vi = new int[] { -1, 1, 0, 0 };
        int[] vj = new int[] { 0, 0, -1, 1 };
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (S[i][j] == '#') {
                    continue;
                }
                for (int v = 0; v < 4; v++) {
                    int iii = i+vi[v];
                    int jjj = j+vj[v];
                    if (0 <= iii && iii < H && 0 <= jjj && jjj < W
                        && S[iii][jjj] == '.') {
                        int src = i*W + j;
                        int dst = iii*W + jjj;
                        dist[src][dst] = 1;
                        dist[dst][src] = 1;
                    }
                }
            }
        }

        for (int k = 0; k < H*W; k++) {
            for (int p = 0; p < H*W; p++) {
                for (int q = 0; q < H*W; q++) {
                    if (dist[p][q] != -1 && dist[p][k] != -1 && dist[k][q] != -1) {
                        dist[p][q] = Math.min(dist[p][q], dist[p][k]+dist[k][q]);
                    }
                }
            }
        }

        /*
        for (int i = 0; i < H*W; i++) {
            System.out.print(ii[i]+" ");
        }
            System.out.println();
        for (int i = 0; i < H*W; i++) {
            System.out.print(jj[i]+" ");
        }
            System.out.println();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(S[i][j]);
            }
            System.out.println();
        }
        */

        int ans = 0;

        for (int p = 0; p < H*W; p++) {
            for (int q = 0; q < H*W; q++) {
                if (dist[p][q] != INF) {
                    ans = Math.max(ans, dist[p][q]);
                }
            }
        }


        System.out.println(ans);
    }
}
