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
        int n=ni(),k=ni();
        long ans=0;
        int[]A=new int[n];
        for (int x=0;x<n;x++) A[x]=ni()%k;
        
        for (int x=0;x<n;x++) {
            int sum=0;
            for (int y=x;y<n;y++) {
                sum=(sum+A[y])%k;
                if (sum==y-x+1) ans++;
            }
        }
        System.out.println(ans);
    }
    
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}