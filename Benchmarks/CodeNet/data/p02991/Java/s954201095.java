
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        int N = nint();
        int M = nint();
        Pair[] us = new Pair[M*3];
        Pair[] vs = new Pair[M*3];
        for (int i = 0; i < M; i++) {
            int ui = nint();
            int vi = nint();
            for (int j = 0; j < 3; j++) {
                Pair u = new Pair(j, ui);
                Pair v = new Pair((j+1) % 3, vi);
                us[i*3 + j] = u;
                vs[i*3 + j] = v;
            }
        }
        
        Map<Pair, Set<Pair>> g = g(us, vs);
        
        int S = nint();
        int T = nint();
        
        int[][] cost = new int[3][N+1];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(cost[i], INF);
        }
        
        Pair start = new Pair(0, S);
        cost[0][S] = 0;
        
        Deque<Pair> d = new ArrayDeque<>();
        d.add(start);
        
        while (!d.isEmpty()) {
            Pair top = d.poll();
            Set<Pair> nexts = g.get(top);
            if (nexts == null) continue;
            
            for (Pair n : nexts) {
                int newCost = cost[top.lev][top.num] + 1;
                if (newCost < cost[n.lev][n.num]) {
                    cost[n.lev][n.num] = newCost;
                    d.add(n);
                }
            }
        }
        
        System.out.println(cost[0][T] == INF ? -1 : cost[0][T] / 3);
    }
    public static class Pair {
        int lev;
        int num;
        public Pair(int lev, int num) {
            super();
            this.lev = lev;
            this.num = num;
        }
        
        @Override
        public boolean equals(Object obj) {
            Pair that = (Pair) obj;
            return that.num == this.num && that.lev == this.lev;
        }
        
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + num;
            result = prime * result + lev;
            return result;
        }
        
        @Override
        public String toString() {
            return "Pair[" + num + ", " + lev + "]";
        }
    }
    
    public static Map<Pair, Set<Pair>> g(Pair[] nodes1, Pair[] nodes2) {
        Map<Pair, Set<Pair>> graph = new HashMap<>();
        
        for (int i = 0; i < nodes1.length; i++) {
            Pair u = nodes1[i];
            Pair v = nodes2[i];
            
            Set<Pair> uc = graph.get(u);
            if (uc == null) {
                uc = new HashSet<>();
            }
            uc.add(v);
            graph.put(u, uc);
        }
        return graph;
    }

    private static int nint() {
        return sc.nextInt();
    }

    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static double ndouble() {
        return sc.nextDouble();
    }
    
    private static double[] ndoubles(int n) {
        return ndoubles(n, 0, 0);
    }
    
    private static double[] ndoubles(int n, int padL, int padR) {
        double[] d = new double[n + padL + padR];
        for (int i = 0; i < n; i++) {
            d[padL + i] = ndouble();
        }
        return d;
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
    }

    private static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }
    
    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0, 0);
    }

    private static char[][] nchars2(int h, int w, int padLU, int padRD) {
        char[][] a2 = new char[h + padLU + padRD][w + padLU + padRD];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, w);
        return a2;
    }
    
    static long max(long... longs) {
        return Arrays.stream(longs).max().getAsLong();
    }
    
    static long min(long... longs) {
        return Arrays.stream(longs).min().getAsLong();
    }
}
