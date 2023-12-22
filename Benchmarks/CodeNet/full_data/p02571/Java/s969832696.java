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
        String t=next();
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<=s.length()-t.length();i++) {
            int na=0;
            for (int j=0;j<t.length();j++) {
                if (s.charAt(i+j)!=t.charAt(j)) na++;
            }
            //System.out.println(i+" "+na);
            ans=Math.min(ans,na);
        }
        //out.flush();
        System.out.println(ans);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}