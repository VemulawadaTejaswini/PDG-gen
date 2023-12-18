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
        int n=ni(),k=ni();
        int[]A=new int[n];
        long[]B=new long[n];
        A[0]=ni();
        for (int x=1;x<n;x++) {
            A[x]=ni();
            int lb=Math.max(0,x-k);
            B[x]=Integer.MAX_VALUE;
            for (int y=lb;y<x;y++) B[x]=Math.min(B[x], B[y]+Math.abs(A[x]-A[y]));
        }
        System.out.println(B[n-1]);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}