import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        final long INF = 1L << 50;

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        long[] c = new long[m];
        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt() - 1;
            b[i] = scanner.nextInt() - 1;
            c[i] = -scanner.nextInt();
        }
        long[] dist = new long[n];
        Arrays.fill(dist, 1, dist.length, INF);

        for (int i = 1; i < n; i++)
            for (int j = 0; j < m; j++)
                if (dist[a[j]] != INF)
                    dist[b[j]] = Math.min(dist[b[j]], dist[a[j]] + c[j]);

        long ans = -dist[n - 1];
        boolean[] neg = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dist[a[j]] == INF) {
                    continue;
                }
                if (dist[b[j]] > dist[a[j]] + c[j]) {
                    dist[b[j]] = dist[a[j]] + c[j];
                    neg[b[j]] = true;
                }
                if (neg[a[j]]) {
                    neg[b[j]] = true;
                }
            }
        }

        System.out.println(neg[n - 1] ? "inf" : ans);
    }
}