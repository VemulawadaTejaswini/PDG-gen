
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static PrintWriter out;
    static Scanner scanner;
    void solve() {
        int nn = scanner.nextInt();
        seg_init(nn);
        int q = scanner.nextInt();
        while (q-- > 0) {
            int com = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (com == 0) {
                update(x, y);
            } else {
                out.println(query(x, y + 1, 0, 0, n));
            }
        }
    }

    int n, q;
    int seg[];

    void seg_init(int nn) {
        n = 1;
        while (n < nn) {
            n <<= 1;
        }
        seg = new int[n * 2 - 1];
        Arrays.fill(seg, Integer.MAX_VALUE);
    }

    int query(int a, int b, int k, int l, int r) {
        if (a <= l && r <= b) {
            return seg[k];
        }
        if (r <= a || b <= l) {
            return Integer.MAX_VALUE;
        }
        int vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
        int vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
        return Math.min(vl, vr);
    }

    void update(int i, int x) {
        i += n - 1;
        seg[i] = x;
        while (i > 0) {
            i = (i - 1) / 2;
            seg[i] = Math.min(seg[i * 2 + 1], seg[i * 2 + 2]);
        }
    }

    public static void main(String[] args) throws Exception {
        scanner = new Scanner(System.in);

        out = new PrintWriter(System.out);
        new Main().solve();
        out.flush();
    }

}