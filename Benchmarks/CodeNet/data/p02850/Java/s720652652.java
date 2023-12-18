
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static final Scanner sc    = new Scanner(System.in);
    static final int     MOD   = (int) 1E9 + 7;
    static final long    INF_L = (long) 4E18;
    
    public static void main(String[] args) {
        int N = nint();
        Map<Integer, Node> nodes = new HashMap<>();
        Set<Edge> edges = new TreeSet<>(Comparator.comparingInt(Edge::getVal));
        
        for (int i = 1; i <= N; i++) {
            nodes.put(i, new Node(i, new ArrayList<>()));
        }
        
        for (int i = 1; i <= N - 1; i++) {
            Node n1 = nodes.get(nint());
            Node n2 = nodes.get(nint());
            Edge e = new Edge(i, n1, n2, -1);
            edges.add(e);
            n1.edges.add(e);
            n2.edges.add(e);
        }
        
        int numColor = nodes.values().stream().mapToInt(n -> n.edges.size()).max().getAsInt();
        
        boolean[] visitedN = new boolean[N+1];
        boolean[] visitedE = new boolean[N-1+1];
        
        Queue<Node> q = new ArrayDeque<>();
        q.add(nodes.get(1));
        visitedN[1] = true;
        
        while (!q.isEmpty()) {
            Node cur = q.poll();
            List<Edge> next = cur.edges;
            for (Edge e: next) {
                if (visitedE[e.val]) {
                    continue;
                }
                visitedE[e.val] = true;
                e.color = (cur.maxColor + 1) % numColor;
                if (e.color == 0) e.color = numColor;
                
                cur.maxColor++;
                if (!visitedN[e.N1.val]) {
                    q.add(e.N1);
                    e.N1.maxColor = (int) max(e.N1.maxColor, e.color);
                    visitedN[e.N1.val] = true;
                }
                if (!visitedN[e.N2.val]) {
                    q.add(e.N2);
                    e.N2.maxColor = (int) max(e.N2.maxColor, e.color);
                    visitedN[e.N2.val] = true;
                }
            }
        }
        
        System.out.println(numColor);
        for (Edge e : edges) {
            System.out.println(e.color);
        }
    }
    
    static class Edge {
        int val;
        Node N1;
        Node N2;
        int color;
        int getVal() {return this.val;}
        
        public Edge(int val, Node n1, Node n2, int color) {
            super();
            this.val = val;
            N1 = n1;
            N2 = n2;
            this.color = color;
        }
        @Override
        public String toString() {
            return "EDGE val = " + val + ", n1 = " + N1.val + ", n2 = " + N2.val + ", color = " + color;
        }
    }
    
    static class Node {
        int val;
        int maxColor;
        List<Edge> edges;
        public Node(int val, List<Edge> edges) {
            super();
            this.val = val;
            this.edges = edges;
        }
        
        @Override
        public String toString() {
            return "NODE val = " + val + ", edges.size = " + edges.size();
        }
    }

    @Deprecated
    static int nint() {
        return sc.nextInt();
    }

    @Deprecated
    static int[] nints(int N) {
        return nints(0, N, 0);
    }

    @Deprecated
    private static int[] nints(int padL, int N, int padR) {
        int[] a = new int[padL + N + padR];
        for (int i = 0; i < N; i++)
            a[padL + i] = nint();
        return a;
    }

    static long nlong() {
        return sc.nextLong();
    }

    static long[] nlongs(int N) {
        return nlongs(0, N, 0);
    }

    static long[] nlongs(int padL, int N, int padR) {
        long[] a = new long[padL + N + padR];
        for (int i = 0; i < N; i++)
            a[padL + i] = nlong();
        return a;
    }

    static double ndouble() {
        return sc.nextDouble();
    }

    static double[] ndoubles(int N) {
        return ndoubles(0, N, 0);
    }

    static double[] ndoubles(int padL, int N, int padR) {
        double[] d = new double[N + padL + padR];
        for (int i = 0; i < N; i++) {
            d[padL + i] = ndouble();
        }
        return d;
    }

    static String nstr() {
        return sc.next();
    }

    static char[] nchars() {
        return sc.next().toCharArray();
    }

    static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }

    static char[][] nchars2(int H, int W) {
        return nchars2(H, W, 0, 0);
    }

    static char[][] nchars2(int H, int W, int padLU, int padRD) {
        char[][] a2 = new char[H + padLU + padRD][W + padLU + padRD];
        for (int i = 0; i < H; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, W);
        return a2;
    }

    static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }

    static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }

    static long abs(long a) {
        return Math.abs(a);
    }
}
