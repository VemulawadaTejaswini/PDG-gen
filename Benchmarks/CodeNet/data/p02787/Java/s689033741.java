
import java.util.*;
import java.io.*;

class Main {
    public static void main(String [] args) {
        Solver s = new Solver();
        s.solve();
    }
}

class Solver {
    Reader in = new Reader ();
    Writer out = new Writer ();
    void solve () {
        int h = in.nextInt();
        int n = in.nextInt();
        int [] a = new int [n + 1];
        int [] b = new int [n + 1];
        for(int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        int [][] dp = new int [n + 1][h + 1];
        int inf = 1000000000;
        for(int i = 1; i <= h; i++) {
            dp[0][i] = inf;
        }
        dp[0][0] = 0;
        for(int i = 1; i <= n; i++) {
            dp[i][0] = 0;
            for(int j = 1; j <= h; j++) {
                dp[i][j] = dp[i - 1][j];
                if(a[i] <= j) dp[i][j] = Math.min(dp[i][j], dp[i][j - a[i]] + b[i]);
                else dp[i][j] = Math.min(dp[i][j], b[i]);
            }
        }
        System.out.println(dp[n][h]);
    }
}

class Reader {
    private StringTokenizer a;
    private BufferedReader b;
    Reader () {
        a = null;
        try {
            b = new BufferedReader (new InputStreamReader (System.in)); // for file IO, replace this with new FileReader ("in.txt")
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String next () {
        while(a == null || !a.hasMoreTokens()) {
            try {
                a = new StringTokenizer (b.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return a.nextToken();
    }
    public int nextInt() {
        return Integer.parseInt(this.next());
    }
    public long nextLong () {
        return Long.parseLong(this.next());
    }
    public double nextDouble () {
        return Double.parseDouble(this.next());
    }
    public String nextLine() {
        try {
            return b.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
class Writer {
    private PrintWriter a;
    private StringBuffer b;
    Writer () {
        try {
            a = new PrintWriter (System.out); // for file IO, replace this with new FileWriter ("out.txt")
        } catch (Exception e) {
            e.printStackTrace();
        }
        b = new StringBuffer ("");
    }
    public void write (Object s) {
        b.append(s);
    }
    public void writeln(Object s) {
        b.append(s).append('\n');
    }
    public void flush () {
        a.print(b);
        a.flush();
        a.close();
    }
}
