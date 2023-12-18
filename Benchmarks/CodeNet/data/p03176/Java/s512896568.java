import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] h = new int[N][2];
        long[] a = new long[N];

        for (int i = 0; i < N; i++) {
            h[i][0] = sc.nextInt();
            h[i][1] = i;
        }

        Arrays.sort(h, (x, y) -> (x[0] - y[0]));

        for (int i = 0; i < N; i++) {
            a[i] = (long) sc.nextInt();
        }
        SegmentTree st = new SegmentTree(N);
        for (int i = 0; i < N; i++) {
            int index = h[i][1];
            st.update(index, st.getMax(index) + a[index]);
        }
        System.out.println(st.getResult());
    }
}

class SegmentTree {
    private long[] maxSegmentTree;
    private int n;
    private int N;

    public SegmentTree(int N) {
        this.N = N;
        this.n = (Integer.highestOneBit(N) << 1);

        this.maxSegmentTree = new long[2 * n];
        /*
        for (int i = n; i < 2 * n; i++) {
            maxSegmentTree[i] = arr[i - n];
        }
        for (int i = n - 1; i > 0; i--) {
            maxSegmentTree[i] = Math.max(maxSegmentTree[2 * i], maxSegmentTree[2 * i + 1]);
        }
        */
    }

    public void update(int i, long val) {
        i += n;
        maxSegmentTree[i] = val;

        while (i > 1) {
            i /= 2;
            maxSegmentTree[i] = Math.max(maxSegmentTree[2 * i], maxSegmentTree[2 * i + 1]);
        }
    }

    public long getMax(int index) {
        int l = n;
        index += n;
        long max = 0;


        while (l < index) {
            if ((index & 1) == 0) {
                max = Math.max(max, maxSegmentTree[index]);
                index--;
            }
            index >>= 1;
            l >>= 1;
        }

        if (l == index) max = Math.max(max, maxSegmentTree[l]);

        return max;
    }

    public long getResult() {
        return maxSegmentTree[n + N - 1];
    }
}
