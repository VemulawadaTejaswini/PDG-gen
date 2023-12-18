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
        SegmentTree st = new SegmentTree(new long[N]);
        for (int i = 0; i < N; i++) {
            //int height = h[i][0];
            int index = h[i][1];
            st.update(index, st.getMax(0, index - 1) + a[index]);
        }
        System.out.println(st.getItem(2 * N - 1));
    }
}

class SegmentTree {
    private long[] maxSegmentTree;
    private int n;

    public SegmentTree(long[] arr) {
        n = arr.length;
        maxSegmentTree = new long[2 * n];
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

    public long getMax(int left, int right) {
        left += n;
        right += n;
        long max = 0;

        while (left < right) {
            if ((left & 1) == 1) {
                max = Math.max(max, maxSegmentTree[left]);
                left++;
            }

            if ((right & 1) == 0) {
                max = Math.max(max, maxSegmentTree[right]);
                right--;
            }

            left >>= 1;
            right >>= 1;
        }

        if (left == right) max = Math.max(max, maxSegmentTree[left]);

        return max;
    }

    public long getItem(int index) {
        return maxSegmentTree[index];
    }
}
