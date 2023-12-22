import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static final FS sc = new FS();  // 封装输入类
    static final PrintWriter pw = new PrintWriter(System.out);
    static List<Set<Integer>> t;
    static int n;
    public static void main(String[] args) {
        n = sc.nextInt();
        t = new ArrayList<>();
        for(int i = 0;i < 4 * n;i++) {
            t.add(new HashSet<>());
        }
        int q = sc.nextInt();
        int[] a = sc.nextArray(n);
        build(a, 1, 0, n - 1);
        while (q-- > 0) {
            int l = sc.nextInt(), r = sc.nextInt();
            pw.println(sum(1, 1, n, l, r).size());
        }
        pw.flush();
    }

    static void build(int[]a, int p, int tl, int tr) {
        if (tl == tr) {
            t.get(p).add(a[tl]);
            return;
        }
        int tm = (tl + tr) / 2;
        build(a, p * 2, tl, tm);
        build(a, p * 2 + 1, tm + 1, tr);
        t.get(p).addAll(t.get(p * 2));
        t.get(p).addAll(t.get(p * 2 + 1));
    }

    static Set<Integer> sum(int p, int tl, int tr, int l, int r) {
        if (l > r) {
            return new HashSet<>();
        }
        if (l == tl && r == tr) {
            return t.get(p);
        }
        int tm = (tl + tr) /2;
        Set<Integer> left = sum(p * 2, tl, tm, l, Math.min(r, tm));
        Set<Integer> right = sum(p * 2 + 1, tm + 1, tr, Math.max(l, tm + 1), r);
        Set<Integer> res = new HashSet<>();
        res.addAll(left);
        res.addAll(right);
        return res;
    }

    static class FS {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while(!st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch(Exception ignored) {}
            }
            return st.nextToken();
        }
        int[] nextArray(int n) {
            int[] a = new int[n];
            for(int i = 0;i < n;i++) {
                a[i] = nextInt();
            }
            return a;
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}