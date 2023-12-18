import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] g = new boolean[n][n];
        int[] fo = new int[n];
        double[] p = new double[n];
        double[] l = new double[n];
        for(int i=0; i<m; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            g[s][t] = true;
            fo[s]++;
        }
        p[0] = 1d;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(g[i][j]) {
                    p[j] += p[i] / fo[i];
                }
            }
        }
        for(int i=n-2; i>=0; i--) {
            l[i] = 1;
            for(int j=i+1; j<n; j++) {
                if(g[i][j]) {
                    l[i] += l[j] / fo[i];
                }
            }
        }

        double res = l[0];

        for(int i=0; i<n; i++) {
            if(fo[i] < 2) continue;
            double max = 0;
            int maxj = 0;
            for(int j=i+1; j<n; j++) {
                if(g[i][j]) {
                    max = Math.max(max, l[j]);
                    if(l[j] == max) {
                        maxj = j;
                    }
                }
            }
            double l1 = 1;
            for(int j=i+1; j<n; j++) {
                if(g[i][j] && j != maxj) {
                    l1 += l[j] / (fo[i] - 1);
                }
            }
            double d = l[i] - l1;
            double l0 = l[0] - d * p[i];
            res = Math.min(res, l0);
        }

        System.out.println(res);
    }


}
