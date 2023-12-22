import java.io.*;
import java.util.*;

public class Main {
    static int[] enter;
    static int visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        Node[] ary = new Node[n];
        for( int i = 0; i < n; i++ ) ary[i] = new Node(i);
        while(m-->0) {
            tmp = br.readLine().split(" ");
            int u = Integer.parseInt(tmp[0])-1;
            int v = Integer.parseInt(tmp[1])-1;
            ary[u].adj.add(ary[v]);
            ary[v].adj.add(ary[u]);
        }
        enter = new int[n];
        Arrays.fill(enter,-1);
        visited = 1;
        Queue<Node> q = new LinkedList<>();
        q.add(ary[0]);
        enter[0] = 0;
        while(!q.isEmpty()) {
            Node curr = q.remove();
            for( Node node : curr.adj ) {
                if( enter[node.i] == -1 ) {
                    q.add(node);
                    enter[node.i] = curr.i+1;
                    visited++;
                }
            }
        }
        System.out.println(visited);
        if( visited == n ) {
            pw.println("Yes");
            for( int i = 1; i < n; i++ ) {
                pw.println(enter[i]);
            }
        } else {
            pw.println("No");
        }
        pw.close();
    }
    static class Node {
        int i;
        ArrayList<Node> adj = new ArrayList<>();
        public Node(int i) {
            this.i = i;
        }
    }
}