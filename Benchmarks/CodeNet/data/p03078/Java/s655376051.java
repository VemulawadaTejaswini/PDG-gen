import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int Z = in.nextInt();
            int K = in.nextInt();
            long[] A = new long[X];
            long[] B = new long[Y];
            long[] C = new long[Z];
            for (int i = 0; i < X; i++) {
                A[i] = in.nextLong();
            }
            for (int i = 0; i < Y; i++) {
                B[i] = in.nextLong();
            }
            for (int i = 0; i < Z; i++) {
                C[i] = in.nextLong();
            }

            ArrayList<Node> list = new ArrayList<>();
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    Node e = new Node();
                    e.sum = A[i] + B[j];
                    list.add(e);
                }
            }
//            Collections.sort(list);
            CollectionsUtils.select(list, 0, list.size(), K);

            ArrayList<Node> list2 = new ArrayList<>();
            int size = Math.min(K, list.size());
            for (int i = 0; i < size; i++) {
                Node node = list.get(i);
                for (int j = 0; j < Z; j++) {
                    Node e = new Node();
                    e.sum = node.sum + C[j];
                    list2.add(e);
                }
            }
//            Collections.sort(list2);
            CollectionsUtils.select(list2, 0, list2.size(), K);
            CollectionsUtils.sort(list2, 0, K - 1);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < K; i++) {
                sb.append(list2.get(i).sum + "\n");
            }
            System.out.print(sb.toString());
            System.out.flush();

        }
    }
}

class Node implements Comparable<Node> {
    long sum;

    @Override
    public int compareTo(Node o) {
        if (sum > o.sum) {
            return -1;
        }
        if (sum < o.sum) {
            return 1;
        }
        return 0;
    }
}

class CollectionsUtils {
    private CollectionsUtils() {
    }

    public static final <T> void shuffle(ArrayList<T> list, Random rng) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int j = (int) ((i + 1) * rng.nextDouble());
            CollectionsUtils.swap(list, i, j);
        }
    }

    public static final <T> void shuffle(ArrayList<T> list, XorShift rng) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int j = (int) ((i + 1) * rng.nextDouble());
            CollectionsUtils.swap(list, i, j);
        }
    }

    public static final <T> void select0(ArrayList<T> a, int l, int r, int k, Comparator<T> comparator) {
        while (l < r) {
            int i = CollectionsUtils.partition3(a, l, r, comparator);
            if (i >= k)
                r = i - 1;
            if (i <= k)
                l = i + 1;
        }
    }

    public static final <T> void select(ArrayList<T> a, int startInclusive, int endExclusive, int k, Comparator<T> comparator) {
        select0(a, startInclusive, endExclusive - 1, k, comparator);
    }

    public static final <T extends Comparable<T>> void select0(ArrayList<T> a, int l, int r, int k) {
        while (l < r) {
            int i = CollectionsUtils.partition3(a, l, r);
            if (i >= k)
                r = i - 1;
            if (i <= k)
                l = i + 1;
        }
    }

    public static final <T extends Comparable<T>> void select(ArrayList<T> a, int startInclusive, int endExclusive, int k) {
        select0(a, startInclusive, endExclusive - 1, k);
    }

    public static final <T> void swap(ArrayList<T> a, int i, int j) {
        T swap = a.set(i, a.get(j));
        a.set(j, swap);
    }

    public static final <T> void sort3(ArrayList<T> a, int i, int j, int k, Comparator<T> comparator) {
        if (comparator.compare(a.get(i), a.get(j)) > 0) {
            swap(a, i, j);
        }
        if (comparator.compare(a.get(i), a.get(k)) > 0) {
            swap(a, i, k);
        }
        if (comparator.compare(a.get(j), a.get(k)) > 0) {
            swap(a, j, k);
        }
    }

    public static final <T extends Comparable<T>> void sort3(ArrayList<T> a, int i, int j, int k) {
        if (a.get(i).compareTo(a.get(j)) > 0) {
            swap(a, i, j);
        }
        if (a.get(i).compareTo(a.get(k)) > 0) {
            swap(a, i, k);
        }
        if (a.get(j).compareTo(a.get(k)) > 0) {
            swap(a, j, k);
        }
    }

    public static final <T> int partition3(ArrayList<T> a, int l, int r, Comparator<T> comparator) {
        int center = (l + r) >>> 1;
        sort3(a, l, center, r, comparator);
        swap(a, center, r - 1);
        if (r - l < 3) {
            return l;
        }
        int r1 = r - 1;
        T v = a.get(r1);
        int i = l - 1;
        int j = r1;
        for (;;) {
            for (; comparator.compare(a.get(++i), v) < 0;) {
            }
            for (; comparator.compare(a.get(--j), v) > 0;) {
            }
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, i, r1);
        return i;
    }

    public static final <T extends Comparable<T>> int partition3(ArrayList<T> a, int l, int r) {
        int center = (l + r) >>> 1;
        sort3(a, l, center, r);
        swap(a, center, r - 1);
        if (r - l < 3) {
            return l;
        }
        int r1 = r - 1;
        T v = a.get(r1);
        int i = l - 1;
        int j = r1;
        for (;;) {
            for (; a.get(++i).compareTo(v) < 0;) {
            }
            for (; a.get(--j).compareTo(v) > 0;) {
            }
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, i, r1);
        return i;
    }

    public static final <T extends Comparable<T>> int partition(ArrayList<T> a, int l, int r) {
        int i = l - 1, j = r;
        T v = a.get(r);
        for (;;) {
            while (a.get(++i).compareTo(v) < 0)
                ;
            while (v.compareTo(a.get(--j)) < 0)
                if (j == l)
                    break;
            if (i >= j)
                break;
            swap(a, i, j);
        }
        swap(a, i, r);
        return i;
    }

    public static final <T> void sort(ArrayList<T> a, int lInclusive, int rInclusive, Comparator<T> comparator) {
        if (lInclusive >= rInclusive) {
            return;
        }
        int k = partition3(a, lInclusive, rInclusive, comparator);
        sort(a, lInclusive, k - 1, comparator);
        sort(a, k + 1, rInclusive, comparator);
    }

    public static final <T extends Comparable<T>> void sort(ArrayList<T> a, int lInclusive, int rInclusive) {
        if (lInclusive >= rInclusive) {
            return;
        }
        int k = partition3(a, lInclusive, rInclusive);
        sort(a, lInclusive, k - 1);
        sort(a, k + 1, rInclusive);
    }

    public static final <T> ArrayList<T> reverse(ArrayList<T> list) {
        for (int l = 0, r = list.size() - 1; l < r; l++, r--) {
            list.set(r, list.set(l, list.get(r)));
        }
        return list;
    }

    public static final <T> ArrayList<T> newReverse(ArrayList<T> list) {
        ArrayList<T> res = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            res.add(list.get(i));
        }
        return res;
    }

}

class XorShift {
    private static final double toDouble = 1.0 / 2147483648.0;
    private int w = 88675123;
    private int x = 123456789;
    private int y = 362436069;
    private int z = 521288629;
    private int count = 0;

    public XorShift() {
        x = (int) System.nanoTime();
    }

    public XorShift(long l) {
        x = (int) l;
    }

    public int getCount() {
        return count;
    }

    public double nextDouble() {
        return (nextInt() & Integer.MAX_VALUE) * toDouble;
    }

    public int nextInt() {
        count++;
        final int t = x ^ (x << 11);
        x = y;
        y = z;
        z = w;
        w = w ^ (w >>> 19) ^ (t ^ (t >>> 8));
        return w;
    }

    public int nextInt(int n) {
        return (int) (n * nextDouble());
    }

    public long nextLong() {
        long a = nextInt();
        long b = nextInt();
        return (a << 32) ^ b;
    }

}
