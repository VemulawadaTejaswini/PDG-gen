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
  
    void solve() throws IOException {
        int n=ni();
        int[]A=new int[n+1];
        int[]B=new int[n+1];
        int[]C=new int[n+1];
        
        for (int x=1;x<=n;x++) {
            int a=ni();
            A[x]=a+Math.max(B[x-1],C[x-1]);
            a=ni();
            B[x]=a+Math.max(A[x-1],C[x-1]);
            a=ni();
            C[x]=a+Math.max(A[x-1],B[x-1]);
        }
        
        int ans=A[n];
        ans=Math.max(ans,B[n]);
        ans=Math.max(ans,C[n]);
        System.out.println(ans);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}