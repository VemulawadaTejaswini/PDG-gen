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
  
    static long m=998244353;
  
    void solve() throws IOException {
        int n=ni();
        int[]A=new int[n];
        int[]B=new int[n];
        int[]C=new int[n];
        long[]P=new long[n];
        long[]Q=new long[n];
        long[]R=new long[n];
        A[0]=ni(); B[0]=ni(); C[0]=ni();
        P[0]=A[0]; Q[0]=B[0]; R[0]=C[0];
        for (int x=1;x<n;x++) {
            A[x]=ni(); B[x]=ni(); C[x]=ni();
            P[x]=A[x]+Math.max(Q[x-1],R[x-1]);
            Q[x]=B[x]+Math.max(P[x-1],R[x-1]);
            R[x]=C[x]+Math.max(P[x-1],Q[x-1]);
        }
        long ans=Math.max(P[n-1],Q[n-1]);
        ans=Math.max(ans,R[n-1]);
        System.out.println(ans);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}