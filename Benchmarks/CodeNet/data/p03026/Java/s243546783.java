import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) {
        int N = ni();
        
        Node[] nodes = new Node[N+1];
        Edge[] edges = new Edge[N-1];
        for (int i = 0; i <= N; i++) {
            nodes[i] = new Node(i, 0);
        }
        for (int i = 1; i < N; i++) {
            int ai = ni();
            int bi = ni();
            nodes[ai].count++;
            nodes[bi].count++;
            edges[i-1] = new Edge(nodes[ai], nodes[bi]);
        }
        Arrays.sort(nodes);
        
        long[] c = nlongs(N, 1);
        Arrays.sort(c);
        
        long[] value = new long[N+1];
        for (int i = 0; i <= N; i++) {
            int id = nodes[i].id;
            value[id] = c[i];
        }
        
        long score = 0;
        for (int i = 0; i < N-1; i++) {
            Node n1 = edges[i].n1;
            Node n2 = edges[i].n2;
            score += Math.min(value[n1.id], value[n2.id]);
        }
        so.println(score);
        
        for (int i = 1; i <= N; i++) {
            so.print(value[i] + (i == N ? "" : " "));
        }
    }
    
    public static class Edge {
        public Node n1;
        public Node n2;
        public Edge(Node n1, Node n2) {
            this.n1 = n1;
            this.n2 = n2;
        }
        @Override
        public String toString() {
            return "Node1: " + n1 + ", Node2: " + n2;
        }
    }
    
    public static class Node implements Comparable<Node>{
        public int id;
        public int count;
        public Node(int id, int count) {
            this.id = id;
            this.count = count;
        }
        
        @Override
        public int compareTo(Node that) {
            return this.count - that.count;
        } 
        
        @Override
        public String toString() {
            return "[id = " + id + ", count = " + count + "]";
        }
    }

    private static int ni() {
        return sc.nextInt();
    }

    private static long nl() {
        return sc.nextLong();
    }

    private static String ns() {
        return sc.next();
    }

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0);
    }

    private static long[] nlongs(int n, int padding) {
        long[] a = new long[padding + n];
        for (int i = 0; i < n; i++)
            a[padding + i] = ni();
        return a;
    }
}
