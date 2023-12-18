import java.io.*;
import java.util.*;

public class Main {

    public int distToA(char c) {
      if (c == 'a') {
        return 0;
      }
      return 'z' - c + 1;
    }
    public void solve() throws IOException {
      String s = next();
      int k = nextInt();
      StringBuilder sb = new StringBuilder();
      for (int i = 0 ; i < s.length() ; i ++) {
        char c = s.charAt(i);
        int d = distToA(c);
        if (d <= k) {
          sb.append('a');
          k -= d;
        } else {
          sb.append(c);
        }
      }
      char [] ar = sb.toString().toCharArray();
      if (k > 0) {
        k %= 26;
        int n = s.length();
        ar[n-1] += k;
        if (ar[n-1] > 'z') {
          ar[n-1] -= 26;
        }
      }
      out.println(new String(ar));
    }

    

    
    
    BufferedReader bf;
    StringTokenizer st;
    PrintWriter out;
    
    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) 
            st = new StringTokenizer(bf.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    
    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public Main() throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));      
        solve();
        bf.close();
        out.close();
    }
    
    public static void main(String args[]) throws IOException {
        new Main();
    }
}