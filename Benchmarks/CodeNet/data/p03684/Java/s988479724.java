import java.util.*;
import java.io.*;
public class Main {
    class Town implements Comparable<Town>{
        int i, v;
        public Town(int i, int v) {
            this.i = i; this.v = v;
        }
        public int compareTo(Town t) {
            return v - t.v;
        }
    }
    class Node {
        Node p = this;
        int sz = 1;
        public Node() {}
        Node find() {
            if(p != this) p = p.find();
            return p;
        }
    }
    boolean Union(Node x, Node y) {
        Node xR = x.find(), yR = y.find();
        if(xR == yR) return false;
        if(xR.sz > yR.sz) {
            yR.p = xR;
            xR.sz += yR.sz;
        } else {
            xR.p = yR;
            yR.sz += xR.sz;
        }
        return true;
    }
    class Edge implements Comparable<Edge> {
        Node u, v;
        int cost;
        public Edge(Node u, Node v, int c) {
            this.u = u; this.v = v; cost = c;
        }
        public int compareTo(Edge e) {
            return cost - e.cost;
        }
    }
    void solve(BufferedReader in) throws Exception {
        int N = toInt(in.readLine());
        Node[] nodes = new Node[N];
        for(int i = 0; i<N; i++) nodes[i] = new Node();
        Town[] t1 = new Town[N], t2 = new Town[N];
        for(int i = 0; i<N; i++) {
            int[] xx = toInts(in.readLine());
            t1[i] = new Town(i, xx[0]);
            t2[i] = new Town(i, xx[1]);
        }
        Arrays.sort(t1);
        Arrays.sort(t2);
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        for(int i = 0; i<N-1; i++) {
            pq.add(new Edge(nodes[t1[i].i], nodes[t1[i+1].i], t1[i+1].v - t1[i].v));
            pq.add(new Edge(nodes[t2[i].i], nodes[t2[i+1].i], t2[i+1].v - t2[i].v));
        }
        long c = 0;
        int p = 1;
        while(p<N) {
            Edge e = pq.poll();
            if(Union(e.u, e.v) ) {
                c += e.cost;
                p++;
            }
        }
        System.out.println(c);
    }
    int toInt(String s) {return Integer.parseInt(s);}
    int[] toInts(String s) {
        String[] a = s.split(" ");
        int[] o = new int[a.length];
        for(int i = 0; i<a.length; i++) o[i] = toInt(a[i]);
        return o;
    }
    void e(Object o) {
        System.err.println(o);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        (new Main()).solve(in);
    }
}
