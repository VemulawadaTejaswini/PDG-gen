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
        int k=ni();
        int[]A=new int[n];
        for (int i=0;i<n;i++) A[i]=ni();
        
        int left=0;
        int right=1000000000;
        
        while (right-left>1) {
            int av=(right+left)/2;
            int ta=0;
            for (int i=0;i<n;i++) {
                //if (A[i]<=av) continue;
                ta=ta+(A[i]-1)/av;
            }
            if (ta>k) left=av;
            else right=av;
        }
        System.out.println(right);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}