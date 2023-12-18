import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        boolean[] good = new boolean[n];
        Arrays.fill(good, true);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (h[a - 1] == h[b - 1]) {
                good[a - 1] = false;
                good[b - 1] = false;
            } else if (h[a - 1] < h[b - 1]) {
                good[a - 1] = false;
            } else {
                good[b - 1] = false;
            }
        }

        int ans = 0;

        for (boolean b : good) {
            if (b) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
