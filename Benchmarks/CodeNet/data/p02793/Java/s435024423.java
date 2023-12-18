import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int MAX = 1000009;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int[] a = sc.nextIntArray(N);
        List<Integer> prime = primeList((int) Math.sqrt(MAX));
        int[] lcm = new int[MAX];
        ArrayList<HashMap<Integer, Integer>> all = new ArrayList<HashMap<Integer, Integer>>();
        for (int i = 0; i < N; i++) {
            HashMap<Integer, Integer> map = fastPrimeFactor(a[i], prime);
            all.add(map);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                lcm[entry.getKey()] = Math.max(lcm[entry.getKey()], entry.getValue());
            }
        }
        for (int i = 0; i < N; i++) {
            HashMap<Integer, Integer> map = all.get(i);
            long pls = 1;
            for (int k = 1; k <= (int) Math.sqrt(MAX); k++) {
                int v = lcm[k];
                if (v == 0)
                    continue;
                int d = v - map.getOrDefault(k, 0);
                pls *= pow(k, d);
                pls %= MOD;
            }
            ans += pls;
            ans %= MOD;
        }
        System.out.println(ans);
    }

    public static long pow(long x, long n) {
        long sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                sum = sum * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return sum;
    }

    private static List<Integer> primeList(int max) {
        final List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        for (int i = 3; i <= max; i += 2) {
            for (int wari : list) {
                if (i % wari == 0)
                    break;
                if (wari * wari > i) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }

    public static final HashMap<Integer, Integer> fastPrimeFactor(int n, List<Integer> prime) {
        final HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int c2 = 0;
        while (n != 1 && n % 2 == 0) {
            c2++;
            n >>>= 1;
        }
        if (c2 != 0)
            map.put(2, c2);

        for (int num : prime) {
            int cnt = 0;
            while (n % num == 0) {
                cnt++;
                n /= num;
            }
            if (cnt != 0)
                map.put(num, cnt);
            if (num * num > n)
                break;
        }

        if (n != 1) {
            map.put(n, 1);
        }
        return map;
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
