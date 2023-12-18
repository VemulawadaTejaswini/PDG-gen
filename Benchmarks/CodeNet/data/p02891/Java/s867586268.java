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
        String s=next();
        long k=ni();
        long n=s.length();
        
        if (n==1) { System.out.println(k/2); return; }
        
        int p=1;
        long ans=0;
        while (p<n) {
            if (s.charAt(p)==s.charAt(p-1)) { ans++; p+=2; }
            else p++;
        }
        
        ans=ans*k;
        if (p==n && s.charAt(0)==s.charAt((int)n-1)) ans=ans+k-1;
        
        System.out.println(ans);
        
        
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}