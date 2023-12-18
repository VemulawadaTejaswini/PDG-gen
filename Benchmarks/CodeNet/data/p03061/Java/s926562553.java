import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        new Main().run();
    }

    private void run() {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            init(A);

            int max = 0;
            for (int i = 0; i < N; i++) {
                int a = i - 1 >= 0 ? query(0, i) : 0;
                int c = i + 1 < N ? query(i + 1, N - 0) : 0;
                max = Math.max(max, gcd(a > 0 ? a : c, c > 0 ? c : a));
            }

            System.out.println(max);
        }
    }

    private int[] tree;
    private int n;

    public void init(int[] a) {
        for (n = 1; n < a.length; n *= 2) {
        }
        tree = new int[2 * n - 1];
        for (int i = 0; i < a.length; i++) {
            tree[i + (n - 1)] = a[i];
        }
        for (int i = (n - 1) - 1; i >= 0; i--) {
            tree[i] = gcd(tree[getIndexOfLeftChild(i)], tree[getIndexOfRightChild(i)]);
        }
    }

    private int getIndexOfLeftChild(int current) {
        return 2 * current + 1;
    }

    private int getIndexOfRightChild(int current) {
        return 2 * current + 2;
    }

    public int query(int l, int r) {
        return query(l, r, 0, 0, n);
    }

    private int query(int left, int right, int currentNodeIndex, int leftOfCurrentNodeIndex, int rightOfCurrentNodeIndex) {
        assert leftOfCurrentNodeIndex == getLeft(currentNodeIndex);
        assert rightOfCurrentNodeIndex == getRight(currentNodeIndex);
        if (right <= leftOfCurrentNodeIndex || left >= rightOfCurrentNodeIndex) {
            return 0;
        }
        if (left <= leftOfCurrentNodeIndex && rightOfCurrentNodeIndex <= right) {
            return tree[currentNodeIndex];
        } else {
            int vl = query(left, right, getIndexOfLeftChild(currentNodeIndex), leftOfCurrentNodeIndex, (leftOfCurrentNodeIndex + rightOfCurrentNodeIndex) / 2);
            int vr = query(left, right, getIndexOfRightChild(currentNodeIndex), (leftOfCurrentNodeIndex + rightOfCurrentNodeIndex) / 2, rightOfCurrentNodeIndex);
            return gcd(vl > 0 ? vl : vr, vr > 0 ? vr : vl);
        }
    }

    private int getLeft(int currentNodeIndex) {
        int index = currentNodeIndex + 1;
        int high = Integer.highestOneBit(index);
        int multi = index - high;
        int left = multi * (n / high);
        return left;
    }

    private int getRight(int currentNodeIndex) {
        int index = currentNodeIndex + 1;
        int high = Integer.highestOneBit(index);
        int multi = index - high;
        int right = (multi + 1) * (n / high);
        return right;
    }

    public static final int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
