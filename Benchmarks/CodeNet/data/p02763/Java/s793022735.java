import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int Q = sc.nextInt();
        SegmentSum[] alf = new SegmentSum[27];
        for (int i = 0; i < 27; i++) {
            alf[i] = new SegmentSum(N);
        }
        for (int i = 0; i < N; i++) {
            alf[S[i] - 'a'].update(i, 1);
        }
        for (int q = 0; q < Q; q++) {
            if (sc.next().equals("1")) {
                int p = sc.nextInt() - 1;
                char c = sc.next().charAt(0);
                alf[S[p] - 'a'].update(p, 0);
                alf[c - 'a'].update(p, 1);
                S[p] = c;
            } else {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 0;
                int ans = 0;
                for (int i = 0; i < 27; i++) {
                    int sum = alf[i].getSum(a, b);
                    if (sum > 0) {
                        ans++;
                    }
                }
                System.out.println(ans);
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}

class SegmentSum {
    int[] data;
    int size;
    int rawsize;
    int rawindex;

    SegmentSum(int size) {
        this.size = size;
        int n = 1;
        while (n < size)
            n <<= 1;
        rawsize = n;
        rawindex = n - 1;
        n = n * 2 - 1;
        data = new int[n];
    }

    void update(int index, int val) {
        data[rawindex + index] = val;
        innerUpdate((rawindex + index - 1) / 2);
    }

    private void innerUpdate(int index) {
        data[index] = data[index * 2 + 1] + data[index * 2 + 2];
        if (index == 0)
            return;
        innerUpdate((index - 1) / 2);
    }

    int getSum(int left, int right) {
        return innerGetSum(left, right, 0, 0, rawsize);
    }

    private int innerGetSum(int left, int right, int index, int l, int r) {
        if (r <= left || right <= l)
            return 0;
        if (left <= l && r <= right)
            return data[index];
        int lm = innerGetSum(left, right, index * 2 + 1, l, (l + r) / 2);
        int rm = innerGetSum(left, right, index * 2 + 2, (l + r) / 2, r);
        return lm + rm;
    }

    int getAt(int index) {
        return data[rawindex + index];
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public ArrayList<Integer> nextIntList(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++)
            a.add(nextInt());
        return a;
    }

    public ArrayList<Long> nextLongList(int n) {
        ArrayList<Long> a = new ArrayList<Long>(n);
        for (int i = 0; i < n; i++)
            a.add(nextLong());
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }
}