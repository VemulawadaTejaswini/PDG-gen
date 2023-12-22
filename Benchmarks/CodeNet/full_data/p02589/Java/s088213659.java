import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final double eps = 1e-9;
    static long mod = 1000000007;

    void solve() {
        int n = in.nextInt();
        String[] s = new String[n];
        String[] s1 = new String[n];
        boolean[][] has = new boolean[n][26];
        List<List<Integer>> map = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            map.add(new ArrayList<>());
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            String t = in.next();
            c[i] = t.charAt(0) - 'a';
            t = new StringBuilder(t).reverse().toString();
            s[i] = t;
            for (char ch : s[i].toCharArray()) {
                has[i][ch - 'a'] = true;
            }
            s1[i] = s[i].substring(0, s[i].length() - 1);
            map.get(c[i]).add(i);
        }
        long ans = 0;
        Trie trie = new Trie(n);
        for (int j = 0; j < n; j++) {
            trie.insert(s[j]);
        }
        for (int i = 0; i < 26; i++) {
            List<Integer> list = map.get(i);
            if (list.isEmpty()) {
                continue;
            }
            for (Integer j : list) {
                ans += trie.searchPrefix(s1[j], c[j]);
            }
        }
        ans -= n;
        out.println(ans);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Trie {
    static class Node {
        int[] next;
        int[] has;
        int c;
        int common;

        Node(int c) {
            this.c = c;
            this.has = new int[26];
            next = new int[26];
            Arrays.fill(next, -1);
        }
        @Override
        public String toString() {
            return "{" + "c=" + (char)(c+'a') + ", common=" + common + ", " + Arrays.toString(has) + '}';
        }
    }

    List<Node> nodes;

    Trie(int n) {
        nodes = new ArrayList<>();
        nodes.add(new Node(0));
    }

    void insert(String word) {
        int[] rem = new int[26];
        int has = 0;
        for (char ch : word.toCharArray()) {
            if (rem[ch - 'a'] == 0) {
                has |= 1 << (ch - 'a');
            }
            rem[ch - 'a']++;
        }
        int nodeId = 0;
        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            int nextId = nodes.get(nodeId).next[c];
            if (nextId == -1) {
                nodes.get(nodeId).next[c] = nodes.size();
                nextId = nodes.size();
                nodes.add(new Node(c));
            }
            for (int j = 0; j < 26; j++) {
                if (((has >> j) & 1) == 1) {
                    nodes.get(nodeId).has[j]++;
                }
            }
            nodes.get(nodeId).common++;
            nodeId = nextId;
            rem[c]--;
            if (rem[c] == 0) {
                has ^= 1 << c;
            }
        }
        for (int j = 0; j < 26; j++) {
            if (((has >> j) & 1) == 1) {
                nodes.get(nodeId).has[j]++;
            }
        }
        nodes.get(nodeId).common++;
    }

    int searchPrefix(String word, int ch) {
        int nodeId = 0;
        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            int nextId = nodes.get(nodeId).next[c];
            if (nextId == -1) {
                return 0;
            }
            nodeId = nextId;
        }
        return nodes.get(nodeId).has[ch];
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }

    List<List<Integer>> nextEdges(int n, int m) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = nextInt() - 1;
            int v = nextInt() - 1;
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(char[] s) {
        out.println(String.valueOf(s));
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
