import java.util.Arrays;
import java.util.List;
import java.util.function.LongPredicate;
import java.util.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.io.*;
import java.io.BufferedOutputStream;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner();
        try (final FastWriter writer = new FastWriter()) {
            int N = scanner.nextInt(), K = scanner.nextInt();
            long zero = 0;
            ArrayList<Long> negative = new ArrayList<>(), positive = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                long a = scanner.nextLong();
                if (a == 0) zero++;
                else if (a > 0) positive.add(a);
                else negative.add(-a);
            }
            negative.sort(Long::compareTo);
            positive.sort(Long::compareTo);
            long[] n = negative.stream().mapToLong(l -> l).toArray();
            long[] p = positive.stream().mapToLong(l -> l).toArray();
            long left = -(1L << 60), right = 1L << 60;
            while (right - left > 1) {
                long mid = (left + right) / 2;
                long cnt = 0;
                for (long i : n) {
                    cnt += p.length - BinarySearch.lowerBound(p, j -> -i * j <= mid);
                }
                if (mid >= 0) cnt += zero * (N - zero) + zero * (zero - 1) / 2;
                for (int i = 0; i < p.length; i++) {
                    int finalI = i;
                    int j = BinarySearch.lowerBound(p, k -> k * p[finalI] > mid) - 1;
                    if (j > i) cnt += j - i;
                }
                for (int i = 0; i < n.length; i++) {
                    int finalI = i;
                    int j = BinarySearch.lowerBound(n, k -> k * n[finalI] > mid) - 1;
                    if (j > i) cnt += j - i;
                }
                if (cnt >= K) right = mid;
                else left = mid;
            }
            writer.println(right);
        }
    }
}

class BinarySearch {
    // Like std::lower_bound() in C++.
    public static <T> int lowerBound(final T[] arr, final Predicate<T> func) {
        int left = -1, right = arr.length;
        while (right - left > 1) {
            final int mid = (left + right) / 2;
            if (func.test(arr[mid])) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    public static int lowerBound(final long[] arr, final LongPredicate func) {
        int left = -1, right = arr.length;
        while (right - left > 1) {
            final int mid = (left + right) / 2;
            if (func.test(arr[mid])) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
}

class FastScanner {
    private final BufferedReader br;
    private StringTokenizer st;

    public FastScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

class FastWriter extends PrintWriter {
    public FastWriter() {
        super(new BufferedOutputStream(System.out));
    }

    public static void main(final String[] args) {
        try (final FastWriter w = new FastWriter()) {
            w.println(32);
        }
    }
}

