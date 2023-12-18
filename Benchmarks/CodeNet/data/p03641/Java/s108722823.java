
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static class SegmentTree {
        int n;
        long []data;
        long DEFAULT_VALUE = Long.MAX_VALUE;

        // when father is k, left son is 2 * k + 1, right son is 2 * k + 2.

        public SegmentTree(long[] num) {
            n = 1;
            while (n < num.length) {
                n *= 2;
            }
            data = new long[2 * n];
            for (int i = 0; i < num.length; ++i) {
                update(i, num[i]);
            }

        }

        // update original array[index] to newValue
        void update(int index, long newValue) {
            index += n - 1;
            data[index] = newValue;
            while (index > 0) {
                index = (index - 1) / 2;
                data[index] = Math.min(data[index * 2 + 1], data[index * 2 + 2]);
            }
        }

        // query min value in [a, b)
        // k is the index of tree node in data
        // [l, r) is the interval that represent by current node k.
        // to get min value in [a, b), call from outside: query(a, b, 0, 0, n);
        long query(int a, int b, int k, int l, int r) {
            // current node k 's interval is outside of query interval[a, b)
            if (r <= a || l >= b) {
                return DEFAULT_VALUE;
            }
            // current node k is subset of query interval[a, b)
            if (a <= l && r <= b) {
                return data[k];
            }
            // current node k is contains part of query interval [a, b)
            long leftSon = query(a, b, 2 * k + 1, l, (l + r) / 2);
            long rightSon = query(a, b, 2 * k + 2, (l + r) / 2, r);
            return Math.min(leftSon, rightSon);
        }


    }
    public static class Interval implements Comparable<Interval> {
        int l;
        int r;
        long value;
        public Interval(int l, int r, long value) {
            this.l = l;
            this.r = r;
            this.value = value;
        }

        @Override
        public int compareTo(Interval o) {
            if (this.value == o.value) {
                return 0;
            } else if (this.value > o.value) {
                return 1;
            } else {
                return -1;
            }
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] num = new long[n];
        long [] oddNum = new long[n];
        long [] evenNum = new long[n];
        Map<Long, Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            num[i] = scanner.nextLong();
            oddNum[i] = Long.MAX_VALUE;
            evenNum[i] = Long.MAX_VALUE;
            valueToIndex.put(num[i], i);
        }
        for (int i = 1; i < n; i += 2) {
            oddNum[i] = num[i];
        }
        for (int i = 0; i < n; i += 2) {
            evenNum[i] = num[i];
        }

        final SegmentTree oddTree = new SegmentTree(oddNum);
        final SegmentTree evenTree = new SegmentTree(evenNum);
        PriorityQueue<Interval> intervals = new PriorityQueue<>();
        long first = evenTree.query(0, n, 0, 0, evenTree.n);
        intervals.add(new Interval(0, n, first));
        long [] ans = new long[n];
        for (int i = 0; i < n; ++i) {
            Interval currentInterval = intervals.poll();
            ans[i] = currentInterval.value;
            int left = currentInterval.l;
            int right = currentInterval.r;
            int pickedLeftIndex = valueToIndex.get(currentInterval.value);

            long pickedRightValue;
            int pickedRightIndex;
            if (pickedLeftIndex % 2 == 1) {
               pickedRightValue = evenTree.query(pickedLeftIndex + 1, right, 0, 0, evenTree.n);
            } else {
                pickedRightValue = oddTree.query(pickedLeftIndex + 1, right, 0, 0, oddTree.n);
            }
            pickedRightIndex = valueToIndex.get(pickedRightValue);
            ans[++i] = pickedRightValue;
            // the interval cut into:
            // [left, pickedLeftIndex)
            // [pickedLeftIndex + 1, pickedRightIndex)
            // [pickedRightIndex + 1, right)

            long leftValue1 = getLeftValueForCurrentInterval(left, pickedLeftIndex, evenTree, oddTree);
            intervals.add(new Interval(left, pickedLeftIndex, leftValue1));

            long leftValue2 = getLeftValueForCurrentInterval(pickedLeftIndex + 1, pickedRightIndex, evenTree, oddTree);
            intervals.add(new Interval(pickedLeftIndex + 1, pickedRightIndex, leftValue2));

            long leftValue3 = getLeftValueForCurrentInterval(pickedRightIndex + 1, right, evenTree, oddTree);
            intervals.add(new Interval(pickedRightIndex + 1, right, leftValue3));

        }
        for (int i = 0; i < n; ++i) {
            System.out.print(ans[i] + " ");
        }

    }

    public static long getLeftValueForCurrentInterval(int l, int r, SegmentTree evenTree, SegmentTree oddTree) {
        SegmentTree segmentTree;
        if (l % 2 == 0) {
            segmentTree = evenTree;
        } else {
            segmentTree = oddTree;
        }
        return segmentTree.query(l, r, 0, 0, evenTree.n);
    }
}
