import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    private void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] rs = new int[n];
        for (int i = 0; i < n; i++) {
            rs[i] = sc.nextInt();
        }

        double[] pos = new double[n];
        pos[0] = rs[0];
        for (int i = 1; i < n; i++) {
            double minLeft = rs[i];
            for (int j = 0; j < i; j++) {
                double dl = 2 * Math.sqrt(rs[i] * rs[j]);
                // System.out.println("dl " + j + "," + i + " = " + dl);
                minLeft = Math.max(minLeft, pos[j] + dl);
            }
            pos[i] = minLeft;
        }
        // System.out.println(Arrays.toString(pos));
        double ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, pos[i] + rs[i]);
        }
        System.out.println(ans);
    }

}