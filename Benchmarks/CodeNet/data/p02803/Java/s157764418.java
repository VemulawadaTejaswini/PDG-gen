import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] g = new boolean[h][w];

        int x = 0;
        int y = 0;
        for(int i=0; i<h; i++) {
            char[] c = sc.next().toCharArray();
            for(int j=0; j<w; j++) {
                g[i][j] = c[j] == '.';
                if(g[i][j]) {
                    x = i;
                    y = j;
                }
            }
        }
        int n = h * w;
        int[][] d = new int[n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(d[i], 100);
            d[i][i] = 0;
        }
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                if(j<w-1) {
                    if(g[i][j] && g[i][j+1]) {
                        d[toi(w, i, j)][toi(w, i, j+1)] = 1;
                        d[toi(w, i, j+1)][toi(w, i, j)] = 1;
                    }
                }
                if(i<h-1) {
                    if(g[i][j] && g[i+1][j]) {
                        d[toi(w, i, j)][toi(w, i+1, j)] = 1;
                        d[toi(w, i+1, j)][toi(w, i, j)] = 1;
                    }
                }
            }
        }
        for(int k=0; k<n; k++) {
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k]+d[k][j]);
                }
            }
        }
        int res = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(d[i][j]<100) {
                    res = Math.max(res, d[i][j]);
                }
            }
        }
        System.out.println(res);


    }

    static int toi(int w, int x, int y) {
        return w * x + y;
    }
}
