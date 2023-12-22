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
        int h=ni(),w=ni();
        long[]A=new long[w+1];
        A[0]=-1;
        
        for (int i=0;i<h;i++) {
            int u=ni(),v=ni();
            long ans=Long.MAX_VALUE;
            for (int j=1;j<=w;j++) {
                if (j>=u && j<=v && A[j-1]==-1) { A[j]=-1; continue; }
                if (j>=u && j<=v) { A[j]=A[j-1]+1; continue; }
                if (A[j-1]==-1) {
                    if (A[j]==-1) continue;
                    A[j]++;
                    ans=Math.min(ans,A[j]);
                    continue;
                }
                if (A[j]==-1) {
                    A[j]=A[j-1]+1;
                    continue;
                }
                A[j]=Math.min(A[j-1]+1,A[j]+1);
                ans=Math.min(ans,A[j]);
            }
            //for (int j=0;j<=w;j++) out.print(A[j]+" ");
            //out.println();
            if (ans==Long.MAX_VALUE) out.println(-1);
            else out.println(ans);
        }
        
        out.flush();
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}