import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] g = new int[h][w];
        for(int i=0; i<h; i++) {
            char[] c = sc.next().toCharArray();
            for(int j=0; j<w; j++) {
                g[i][j] = c[j]-'0';
            }
        }


        int[] res = new int[1];
        res[0] = 1000000;
        int[] a = new int[h];
        dfs(a, g, h, w, k, res, 1, 0);

        System.out.println(res[0]);
    }


    static void dfs(int[] a, int[][]g,  int h, int w, int k, int[] res, int d, int last) {
        if(d == h) {
            int[] sum = new int[last+1];
            boolean reset = true;
            int cut = 0;
            for(int i=0; i<w; i++) {
                for(int j=0; j<h; j++) {
                    if(g[j][i] == 1) sum[a[j]] += 1;
                }
                for(int l=0; l<=last; l++) {
                    if(sum[l] > k) {
                        if(reset) return;
                        Arrays.fill(sum, 0);
                        for(int j=0; j<h; j++) {
                            if(g[j][i] == 1) sum[a[j]] += 1;
                        }
                        cut++;
                    }
                }
                reset = false;
            }
            res[0] = Math.min(res[0], cut + last);
            return;
        }
        a[d] = last;
        dfs(a, g, h, w, k, res, d+1, last);
        a[d] = last + 1;
        dfs(a, g, h, w, k, res, d+1, last+1);
    }
}