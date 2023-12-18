import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
 
    void solve() throws IOException {
        int n = ni();
        int q = ni();
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        for (int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n-1; i++) {
            int a = ni()-1;
            int b = ni()-1;
            graph.get(a).add(b);
        }
        int[] point = new int[n];
        for (int i = 0; i < q; i++) {
            int p = ni()-1;
            int x = ni();
            point[p] += x;
        }
        Deque<Integer> que = new ArrayDeque<>();
        que.add(0);
        while(!que.isEmpty()){
            int node = que.removeFirst();
            for (Integer next : graph.get(node)) {
                point[next] += point[node];
                que.addLast(next);
            }
        }
        for (int i = 0; i < point.length; i++) {
            out.print(point[i]);
            out.print(" ");
        }
    }

 
    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }
 
    int ni() throws IOException {
        return Integer.parseInt(ns());
    }
 
    long nl() throws IOException {
        return Long.parseLong(ns());
    }
 
    double nd() throws IOException {
        return Double.parseDouble(ns());
    }
 
    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }
 
    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }
 
    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }
 
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
 
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.flush();
        out.close();
    }
}