import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] h = new long[n+1];
        boolean[] good = new boolean[n+1];

        for (int i = 1; i <= n; i++) {
            h[i] = sc.nextLong();
            good[i] = true;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (h[a] < h[b]) {
                good[a] = false;
            } else if (h[a] > h[b]) {
                good[b] = false;
            } else {
                good[a] = false;
                good[b] = false;
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (good[i]) ans++;
        }
        System.out.println(ans);

    }
}
