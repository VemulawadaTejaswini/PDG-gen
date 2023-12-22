import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        SegTree segTree = new SegTree(n);
        for (int i = 0; i < q; i++) {
            int com = in.nextInt();
            int x = in.nextInt() - 1;
            int y = in.nextInt();
            if (com == 0) {
                long cur = segTree.query(x, x + 1);
                segTree.update(x, cur + y);
            } else {
                y--;
                System.out.println(segTree.query(x, y + 1));
            }
        }
    }
}

class SegTree {

    private int N;
    private long[] seg;

    public SegTree(int M) {
        N = Integer.highestOneBit(M) * 2;
        seg = new long[N * 2];
        Arrays.fill(seg, 0);
    }

    public void update(int k, long value) {
        seg[k += N - 1] = value;
        while (k > 0) {
            k = (k - 1) / 2;
            seg[k] = seg[k * 2 + 1] + seg[k * 2 + 2];
        }
    }

    //[a, b)
    public long query(int a, int b) {
        return query(a, b, 0, 0, N);
    }

    long query(int a, int b, int k, int l, int r) {
        if (r <= a || b <= l) {
            return 0;
        }
        if (a <= l && r <= b) {
            return seg[k];
        }
        long x = query(a, b, k * 2 + 1, l, (l + r) / 2);
        long y = query(a, b, k * 2 + 2, (l + r) / 2, r);
        return x + y;
    }
}