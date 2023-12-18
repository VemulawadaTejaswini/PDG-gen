import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private static class Node {
        int no;
        List<Node> list = new ArrayList<>();
        int color;
        public Node(int no) {
            this.no = no;
        }
    }
    private void solve(Scanner sc) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, Node> nodes = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            nodes.put(i + 1, new Node(i + 1));
        }
        for (int i = 0; i < M; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodes.get(a).list.add(nodes.get(b));
            nodes.get(b).list.add(nodes.get(a));
        }
        int Q = sc.nextInt();
        for (int i = 0; i < Q; ++i) {
            int v = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            nodes.get(v).color = c;
            paint(nodes.get(v), d, c, new HashSet<>());
        }

        for (int i = 0; i < N; ++i) {
            _out.println(nodes.get(i + 1).color);
        }
    }
    private void paint(Node node, int d, int c, Set<Node> set) {
        if (d <= 0) {
            return;
        }
        if (set.contains(node)) {
            return;
        }
        set.add(node);
        for (Node n : node.list) {
            n.color = c;
            paint(n, d - 1, c, set);
        }
    }
    private static BigInteger C(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        for (long i = r; i > 1; --i) {
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }
    private static BigInteger P(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        new Main().solve(sc);
        _out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            _err.println((G - S) + "ms");
        }
        _err.flush();
    }
}