import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt(), K = in.nextInt();
        int[] v = new int[K];
        int[] dif = new int[K];
        int cur = 0, d = 0;
        for (int i = 0; i < K; ++i) {
            v[i] = in.nextInt();
            int r = v[i] - d;
            d = v[i];
            if (i % 2 == 0) {
                cur -= r;
            } else {
                cur += r;
            }
            dif[i] = cur;
        }
        int Q = in.nextInt();
        for (int i = 0; i < Q; ++i) {
            long t = in.nextLong();
            long a = in.nextLong();
            int l = 0, r = K;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (t <= v[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if (l == 0) {
                System.out.println(a - t);
            } else {
                t -= v[l - 1];
                a = Math.max(0, a + dif[l - 1]);
                a -= l % 2 == 0 ? Math.min(v[l] - v[l - 1], t) : -1* Math.min(v[l] - v[l - 1], t);
                System.out.println(a);
            }
        }
    }
}