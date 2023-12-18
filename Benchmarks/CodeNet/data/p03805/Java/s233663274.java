import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScannerC fs = new FastScannerC();
        PrintWriter out = new PrintWriter(System.out);

        int n = fs.nextInt(), m = fs.nextInt();
        adj = new ArrayList[n];
        for(int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            int a = fs.nextInt()-1, b = fs.nextInt()-1;
            adj[a].add(b);
            adj[b].add(a);
        }
        cnt = 0;
        boolean[] V = new boolean[n];
        V[0] = true;
        dfs(0, V, 1);
        out.println(cnt);
        out.close();
    }

    static int cnt;
    static ArrayList<Integer>[] adj;
    static void dfs(int at, boolean[] V, int seen) {
        boolean no = true;
        for(Integer i : adj[at]) {
            if(!V[i]) {
                V[i] = true;
                no = false;
                dfs(i, V, seen + 1);
                V[i] = false;
            }
        }
        if(no) {
            if(seen == V.length) {
                cnt++;
            }
        }
    }
}

class FastScannerC {
    BufferedReader br;
    StringTokenizer st;

    public FastScannerC() {
        try	{
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        } catch (Exception e){e.printStackTrace();}
    }

    public String next() {
        if (st.hasMoreTokens())	return st.nextToken();
        try {st = new StringTokenizer(br.readLine());}
        catch (Exception e) {e.printStackTrace();}
        return st.nextToken();
    }

    public int nextInt() {return Integer.parseInt(next());}

    public long nextLong() {return Long.parseLong(next());}

    public double nextDouble() {return Double.parseDouble(next());}

    public String nextLine() {
        String line = "";
        try {line = br.readLine();}
        catch (Exception e) {e.printStackTrace();}
        return line;
    }

    public Integer[] nextIntegerArray(int n) {
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; i++) a[i] = nextInt();
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = nextInt();
        return a;
    }

    public char[] nextCharArray() {
        return nextLine().toCharArray();
    }
}