import java.util.Scanner;

public class Main {
    int n, k;
    long[] as;
    long[] qs;
    public static void main(String[] args) {
        Main p = new Main();
        p.read();
        p.solve();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        as = new long[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextLong();
        }
        k = sc.nextInt();
        qs = new long[k];
        for (int i = 0; i < k; i++) {
            qs[i] = sc.nextLong();
        }
    }

    void solve() {
        long ans = 0;
        for (long query: qs) {
            int l = 0;
            int r = n;
            while (l != r) {
                int mid = l + (r - l) / 2;
                if (as[mid] == query) {
                    ans++;
                    break;
                }
                if (as[mid] > query) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
        }
        System.out.println(ans);
    }
}