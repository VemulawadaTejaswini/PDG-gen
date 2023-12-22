
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static class SegmentTree {

        int[] tree;
        int n, rawLen;

        public SegmentTree(int rawLen) {
            n = 1;
            while (n < rawLen) {
                n <<= 1;
            }
            tree = new int[2 * n - 1];
            this.rawLen = rawLen;
            Arrays.fill(tree, Integer.MAX_VALUE);
        }

        public int query(int left, int right) {
            return query(0, 0, n - 1, left, right);
        }

        public void update(int idx, int newValue) {
            idx += n - 1;
            tree[idx] = newValue;
            while (idx > 0) {
                idx = (idx - 1) / 2;
                tree[idx] = Math.min(tree[idx * 2 + 1], tree[idx * 2 + 2]);
            }
        }

        /**
         * Invariant: rangeBegin <= left <= right <= rangeEnd
         */
        private int query(int idx, int rangeBegin, int rangeEnd, int left, int right) {
            int leftResult = Integer.MAX_VALUE;
            int rightResult = Integer.MAX_VALUE;
            if (rangeBegin == rangeEnd) {
                return tree[idx];
            }
            int rangeMid = (rangeBegin + rangeEnd) / 2;
            if (left <= rangeMid) {
                leftResult = query(idx * 2 + 1, rangeBegin, rangeMid, left, Math.min(right, rangeMid));
            }
            if (rangeMid + 1 <= right) {
                rightResult = query(idx * 2 + 2, rangeMid + 1, rangeEnd, Math.max(left, rangeMid + 1), right);
            }

            return Math.min(leftResult, rightResult);

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SegmentTree segTree = new SegmentTree(n);
        int q = scanner.nextInt();
        while (q-- > 0) {
            int cmd = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (cmd == 0) { // update
                segTree.update(x, y);
            } else { // query
                System.out.println(segTree.query(x, y));
            }
        }
    }
}