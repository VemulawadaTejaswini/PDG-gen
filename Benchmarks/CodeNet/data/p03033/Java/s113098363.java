import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

class Main {
    static final PrintWriter out = new PrintWriter(System.out);
    static final Scanner sc = new Scanner(System.in);
        
    static SqrtDecomposition rmq;
    static int n, q;
    static final int[] s = new int[200005];
    static final int[] t = new int[200005];
    static final int[] x = new int[200005];
    static final int[] d = new int[200005];

    public static void main(String[] args) {

        n = sc.nextInt();
        q = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            d[i] = sc.nextInt();
        }
        d[q] = Integer.MAX_VALUE;
        
        rmq = new SqrtDecomposition(q + 1);
        for (int i = 0; i < n; i++) {
            int l;
            int r;

            l = binSearch(s[i] - x[i]);
            r = binSearch(t[i] - x[i]);

            rmq.update(l, r, x[i]);
        }

        for (int i = 0; i < q; i++) {
            long x = rmq.rangeMin(i, i + 1);

            if (x == 1l << 50l) {
                out.println(-1);
            }
            else {
                out.println(rmq.rangeMin(i, i + 1));
            }
        }

        out.flush();
    }

    public static int binSearch(int terget) {
        int valid = q;
        int invalid = -1;

        while (valid - invalid > 1) {
            int mid = (invalid + valid) / 2;

            if (d[mid] < terget) {
                invalid = mid;
            }
            else {
                valid = mid;
            }
        }

        return valid;
    }
}

class SqrtDecomposition {
    long[] lazy;
    long[] bucket;
    long[] raw_data;
    final long e = 1l << 50l;

    int N;
    int sqrtN;
    int K;

    public SqrtDecomposition(int n) {
        N = n;
        sqrtN = 1;
        while (sqrtN * sqrtN < N) {
            sqrtN++;
        }

        K = (N + sqrtN - 1) / sqrtN;

        lazy = new long[K];
        bucket = new long[K];
        raw_data = new long[N];

        Arrays.fill(lazy, e);
        Arrays.fill(bucket, e);
        Arrays.fill(raw_data, e);
    }

    public void update(int l, int r, long d) {

        for (int k = 0; k < K; k++) {
            int bl = k * sqrtN;
            int br = (k + 1) * sqrtN;

            if (br <= l || r <= bl) {
                continue;
            }
            else if (l <= bl && br <= r) {
                lazy[k] = Math.min(lazy[k], d);
            }
            else {
                
                long x = e;
                for (int i = bl; i < br; i++) {
                    if (l <= i && i < r) {
                        raw_data[i] = Math.min(raw_data[i], d);
                    }
                    x = Math.min(x, raw_data[i]);
                }
                bucket[k] = x;
            }
        }
    }

    public long rangeMin(int l, int r) {
        long x = e;

        for (int k = 0; k < K; k++) {
            int bl = k * sqrtN;
            int br = (k + 1) * sqrtN;

            if (br <= l || r <= bl) {
                continue;
            }
            else if (l <= bl && br <= r) {
                x = Math.min(x, Math.min(bucket[k], lazy[k]));
            }
            else {
                eval(k);
                for (int i = Math.max(bl, l); i < Math.min(br, r); i++) {
                    x = Math.min(raw_data[i], x);
                }
            }
        }

        return x;
    }

    protected void eval(int k)
    {
        int l = k * sqrtN;
        int r = (k + 1) * sqrtN;
        long x = e;

        for (int i = l; i < Math.min(N, r); i++) {
            raw_data[i] = Math.min(raw_data[i], lazy[k]);
            x = Math.min(raw_data[i], x);
        }

        bucket[k] = x;
        lazy[k] = e;
    }
}
