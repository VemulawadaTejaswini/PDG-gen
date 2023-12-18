import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] k = {{1,1,1},{1,1,-1},{1,-1,1},{-1,1,1},{-1,-1,1},{-1,1,-1},{1,-1,-1},{-1,-1,-1}};
        long[] x = new long[n];
        long[] y = new long[n];
        long[] z = new long[n];
        long[][] sum = new long[8][n];
        for(int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
            for(int v = 0; v < 8; v++) {
                sum[v][i] = x[i]*k[v][0]+y[i]*k[v][1]+z[i]*k[v][2];
            }
        }
        long ans = 0;
        for(int v = 0; v < 8; v++){
            Arrays.sort(sum[v]);
            long ans1 = 0, ans2 = 0;
            for (int i = 0, c = n - 1; i < m; i++, c--) {
                ans1 += sum[v][i];
                ans2 += sum[v][c];
            }
            ans = Math.max(ans, Math.max(Math.abs(ans1), Math.abs(ans2)));
        }
        System.out.println(ans);
    }
}
