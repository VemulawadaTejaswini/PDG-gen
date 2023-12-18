import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int x = Integer.parseInt(str[2]);
        int[] c = new int[n];
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            c[i] = Integer.parseInt(str[0]);
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(str[j+1]);
            }
        }

        long ans = Long.MAX_VALUE;

       loop1: for (int i = 0; i < Math.pow(2,n); i++) {
            boolean ok = true;
            long res = 0;
           loop2: for (int k = 0; k < m; k++) {
                long sum = 0;
                for (int j = 0; j < n; j++) {
                    if ((1&i >> j) == 1) {
                        res += c[j];
                        sum += a[j][k];
                    }
                    // System.out.println(sum);
                }
                if (sum < x) {
                    ok = false;
                    break loop2;
                }
                // System.out.println();
            }
            // System.out.println(res/m);
            if (ok) {
                ans = Math.min(ans,res/m);
            }
        }

        if (ans == Long.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
