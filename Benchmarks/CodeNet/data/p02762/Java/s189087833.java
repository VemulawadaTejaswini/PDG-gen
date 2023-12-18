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
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.AbstractMap.SimpleEntry;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        UnionFindTree uf = new UnionFindTree(N);
        List<SimpleEntry<Integer, Integer>> friendlist = new ArrayList<SimpleEntry<Integer, Integer>>(M);
        List<SimpleEntry<Integer, Integer>> blocklist = new ArrayList<SimpleEntry<Integer, Integer>>(K);
        int[] root = new int[N];
        int[] psize = new int[N];
        int[] infriend = new int[N];
        int[] inblock = new int[N];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // g.doubleConnect(a, b);
            uf.union(a - 1, b - 1);
            friendlist.add(new SimpleEntry<Integer, Integer>(Math.min(a, b) - 1, Math.max(a, b) - 1));
        }

        for (int i = 0; i < K; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            blocklist.add(new SimpleEntry<Integer, Integer>(Math.min(c, d) - 1, Math.max(c, d) - 1));
        }

        for (int i = 0; i < N; i++) {
            root[i] = uf.find(i);
            psize[root[i]]++;
        }

        for (SimpleEntry<Integer, Integer> entry : friendlist) {
            if (root[entry.getKey()] == root[entry.getValue()]) {
                infriend[entry.getKey()]++;
                infriend[entry.getValue()]++;
            }
        }

        for (SimpleEntry<Integer, Integer> entry : blocklist) {
            if (root[entry.getKey()] == root[entry.getValue()]) {
                inblock[entry.getKey()]++;
                inblock[entry.getValue()]++;
            }
        }

        String ans = "";

        for (int i = 0; i < N; i++) {
            int val = psize[root[i]] - infriend[i] - inblock[i] - 1;
            System.out.print(val + " ");
            ans += val + " ";
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        new Main();
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

class UnionFindTree {
    int[] parent;
    int[] rank;

    public UnionFindTree(int size) {
        this.parent = new int[size + 1];
        this.rank = new int[size + 1];
        for (int i = 0; i <= size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot;
        } else if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (xRoot != yRoot) {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }

    public int find(int i) {
        if (i != parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}