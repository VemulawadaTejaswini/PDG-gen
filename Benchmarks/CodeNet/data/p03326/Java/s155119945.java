import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), m = sc.nextInt();
        long[][] d = new long[n][3];
        for (int i = 0; i < n; i++) {
            d[i][0] = sc.nextLong();
            d[i][1] = sc.nextLong();
            d[i][2] = sc.nextLong();
        }
        long ans[] = new long[6];
        for (int i = 0; i < 6; i++) {
            long sumK = 0, sumO = 0, sumN = 0;
            final int ii = i;
            if (i < 3) {
                Arrays.sort(d, Comparator.comparingLong(a -> a[ii]));
            } else {
                Arrays.sort(d, Comparator.comparingLong(a -> -a[ii - 3]));
            }
            for (int j = 0; j < m; j++) {
                sumK += d[j][0];
                sumO += d[j][1];
                sumN += d[j][2];
            }
            ans[i] = Math.abs(sumK) + Math.abs(sumO) + Math.abs(sumN);
        }
        Arrays.sort(ans);
        System.out.println(ans[5]);
    }
}