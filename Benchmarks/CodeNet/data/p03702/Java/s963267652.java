import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        int N = sc.nextInt();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long[] h = new long[N];
        for (int i = 0; i < N; i++) h[i] = sc.nextLong();
        int low = 0;
        int high = (int)1e9;

        while (low < high - 1) {
            int mid = low+high >> 1;
            System.out.println(mid);
            if (check(mid, h, A, B)) {
                high = mid;
            }
            else {
                low = mid;
            }
        }
        System.out.println(high);
    }

    boolean check(int T, long[] h, long A, long B) {
        long d = 0;
        for (long hh : h) {
            if (hh > B * T) {
                d += (hh - B * T + A - B - 1) / (A - B);
            }
        }
        return d <= T;
    }
}