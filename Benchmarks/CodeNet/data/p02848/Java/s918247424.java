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
        String s=next();
        for (int x=0;x<s.length();x++) {
            int b=s.charAt(x)+n;
            if (b>90) b=b-26;
            out.print((char)b);
        }
        out.println();
        out.flush();
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}