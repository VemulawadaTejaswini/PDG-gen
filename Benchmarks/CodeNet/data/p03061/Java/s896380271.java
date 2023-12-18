import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            Integer[] A = new Integer[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            SegmentTreeUseFunction<Integer> tree = new SegmentTreeUseFunction<>();
            tree.init(A, Integer.valueOf(0), (a, b) -> gcd(a.intValue(), b.intValue()));

            int max = 0;
            for (int i = 0; i < N; i++) {
                int a = i - 1 >= 0 ? tree.query(0, i).intValue() : 0;
                int c = i + 1 < N ? tree.query(i + 1, N - 0).intValue() : 0;
                max = Math.max(max, gcd(a > 0 ? a : c, c > 0 ? c : a));
            }

            System.out.println(max);
        }
    }

    public static final int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}

class SegmentTreeUseFunction<T> {

    private T[] values;
    private int n;
    private T defaultValue;
    private BiFunction<T, T, T> function;

    public void init(T[] a, T defaultValue, BiFunction<T, T, T> function) {
        this.defaultValue = defaultValue;
        this.function = function;

        n = 1;
        for (; n < a.length;) {
            n <<= 1;
        }

        values = (T[]) new Object[(n << 1) - 1];
        Arrays.fill(values, defaultValue);
        for (int i = 0; i < a.length; i++) {
            values[i + (n - 1)] = a[i];
        }
        for (int i = (n - 1) - 1; i >= 0; i--) {
            values[i] = function.apply(values[getIndexOfLeftChild(i)], values[getIndexOfRightChild(i)]);
        }
    }

    public void update(int index, T value) {
        int current = index + n - 1;
        values[current] = value;
        for (; current > 0;) {
            current = getIndexOfParent(current);
            values[current] = function.apply(values[getIndexOfLeftChild(current)], values[getIndexOfRightChild(current)]);
        }
    }

    private int getIndexOfParent(int current) {
        return (current - 1) >>> 1;
    }

    private int getIndexOfLeftChild(int current) {
        return (current << 1) + 1;
    }

    private int getIndexOfRightChild(int current) {
        return (current << 1) + 2;
    }

    public T query(int l, int r) {
        return query(l, r, 0, 0, n);
    }

    private T query(int left, int right, int currentNodeIndex, int leftOfCurrentNodeIndex, int rightOfCurrentNodeIndex) {
        assert leftOfCurrentNodeIndex == getLeft(currentNodeIndex);
        assert rightOfCurrentNodeIndex == getRight(currentNodeIndex);
        if (right <= leftOfCurrentNodeIndex || left >= rightOfCurrentNodeIndex) {
            return defaultValue;
        }

        if (left <= leftOfCurrentNodeIndex && rightOfCurrentNodeIndex <= right) {
            return values[currentNodeIndex];
        }

        T vl = query(left, right, getIndexOfLeftChild(currentNodeIndex), leftOfCurrentNodeIndex, (leftOfCurrentNodeIndex + rightOfCurrentNodeIndex) >>> 1);
        T vr = query(left, right, getIndexOfRightChild(currentNodeIndex), (leftOfCurrentNodeIndex + rightOfCurrentNodeIndex) >>> 1, rightOfCurrentNodeIndex);

        return function.apply(vl, vr);

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

}
