import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private static class Node {
        List<Integer> nodeList = new ArrayList<>();
        int no;
        public Node(int no) {
            this.no = no;
        }
        public String toString() {
            return "[" + no + ":" + nodeList + "]";
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
            Node nodeA = nodes.get(a);
            Node nodeB = nodes.get(b);
            nodeA.nodeList.add(nodeB.no);
            nodeB.nodeList.add(nodeA.no);
        }

        List<Integer> path = new ArrayList<>();
        Node start = null;
        for (Node node : nodes.values()) {
            start = node;
            break;
        }
        boolean flg = true;
        do {
            flg = false;
            path.add(start.no);
            for (int node : start.nodeList) {
                if (!path.contains(node)) {
                    flg = true;
                    start = nodes.get(node);
                    break;
                }
            }
        } while (flg);
        _out.println(path.size());
        StringBuilder sb = new StringBuilder();
        for (int node : path) {
            sb.append(" ").append(node);
        }
        _out.println(sb.substring(1));
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