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
        for (int x=0;x<=n;x++) A[x]=ni();
        long ans=0;
        for (int x=0;x<n;x++) {
            int p=ni();
            if (A[x]>=p) { ans+=p; continue; }
            p-=A[x];
            ans+=A[x];
            if (A[x+1]>=p) {
                ans+=p;
                A[x+1]-=p;
            }
            else {
                ans+=A[x+1];
                A[x+1]=0;
            }
        }
        System.out.println(ans);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}