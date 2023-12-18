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
        long n=nl(),a=nl(),b=nl();
        long d=Math.abs(a-b);
        if (d%2==0) System.out.print(d/2);
        else {
            long ans1=a+(b-a-1)/2;
            long ans2=n-b+1+(b-a-1)/2;
            System.out.println(Math.min(ans1,ans2));
        }
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}