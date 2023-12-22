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
    
    int n;
    int[]A;
    HashSet<Integer>[]B;
  
    void solve() throws IOException {
        n=ni();
        int q=ni();
        A=new int[n+1];
        B=new HashSet[Integer.highestOneBit(n)*4];
        
        for (int i=1;i<=n;i++) A[i]=ni();
        build(1,1,n);
        
        for (int i=0;i<q;i++) {
            int x=ni(),y=ni();
            if (x==y) { out.println(1); continue; }
            HashSet z=query(1,1,n,x,y);
            out.println(z.size());
        }
        out.flush();
    }
    
    HashSet<Integer> query(int u,int p,int q,int x,int y) {
        if (p==x && q==y) return B[u];
        
        int m=(p+q)/2;
        if (x>m) return query(u*2+1,m+1,q,x,y);
        if (y<=m) return query(u*2,p,m,x,y);
        
        HashSet<Integer> r=query(u*2,p,m,x,m);
        HashSet<Integer> r2=query(u*2+1,m+1,q,m+1,y);
        for (Integer v:r2) r.add(v);
        return r;
    }
    
    void build(int u,int p,int q) {
        B[u]=new HashSet();
        if (p==q) {
            B[u].add(A[p]);
            return;
        }
        
        int m=(p+q)/2;
        build(u*2,p,m);
        build(u*2+1,m+1,q);
        
        for (Integer v:B[u*2]) B[u].add(v);
        for (Integer v:B[u*2+1]) B[u].add(v);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}