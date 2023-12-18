import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	PrintWriter out = new PrintWriter(System.out);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok = new StringTokenizer("");
    String next() throws IOException {
        if (!tok.hasMoreTokens()) { tok = new StringTokenizer(in.readLine()); }
        return tok.nextToken();
    }
    int ni() throws IOException { return Integer.parseInt(next()); }
    long nl() throws IOException { return Long.parseLong(next()); }
  
    static int n;
    static ArrayList<Integer>[]A;
    static int[]B;
    
    void solve() throws IOException {
        n=ni();
        A=new ArrayList[n+1];
        for (int x=1;x<=n;x++) A[x]=new ArrayList();
        for (int x=1;x<n;x++) {
            int u=ni(),v=ni();
            A[u].add(v);
            A[u].add(x);
            A[v].add(u);
            A[v].add(x);
        }
        int m=0;
        for (int x=1;x<=n;x++) m=Math.max(m,A[x].size()/2);
        out.println(m);
        
        B=new int[n];
        dfs (1,0,-1);
        
        for (int x=1;x<n;x++) out.println(B[x]);
        out.flush();
    }
    
    void dfs(int v,int p,int d) {
        int c=1;
        if (c==d) c++;
        
        for (int x=0;x<A[v].size();x+=2) {
            int u=A[v].get(x);
            int e=A[v].get(x+1);
            if (u==p) continue;
            B[e]=c;
            dfs(u,v,c);
            c++;
            if (c==d) c++;
        }
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}