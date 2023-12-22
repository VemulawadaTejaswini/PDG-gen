
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(scan.next());
        }

        boolean[] isPeak = new boolean[n];
        Arrays.fill(isPeak, true);

        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(scan.next());
            int b = Integer.parseInt(scan.next());
            a--;
            b--;

            if (h[a] > h[b]) {
                isPeak[b] = false;
            } else if (h[a] < h[b]) {
                isPeak[a] = false;
            } else {
                isPeak[a] = false;
                isPeak[b] = false;
            }
        }
        scan.close();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (isPeak[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
