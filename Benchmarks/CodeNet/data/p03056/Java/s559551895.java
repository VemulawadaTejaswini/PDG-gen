
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) {
        Solver s = new Solver();
        s.solve();
    }
}

class Solver {
    Reader in = new Reader ();
    Writer out = new Writer ();
    final int logn = 17;
    char [][] s = new char [200][200];
    int n, m;
    int lr [][][][] = new int [2][200][200][200]; 
    int ud [][][][] = new int [2][200][200][200];
    int rowCon[][] = new int [200][200];
    int colCon[][] = new int [200][200];

    void solve () {
        n = in.nextInt();
        m = in.nextInt();
        
        for(int i = 0; i < n; i++) {
            char txt[] = in.next().toCharArray();
            for(int j = 0; j < m; j++) {
                s[i][j] = txt[j];
            }
        }
        // need to calc x = 0

        int c = 0;
        int ans = -1;

        for(int i = 0; i < n; i++) {
            for(int j = m-1; j >= 0; j--) {
                rowCon[i][j] = 1;
                if(j + 1 < m && s[i][j] == s[i][j + 1]) {
                    rowCon[i][j] += rowCon[i][j + 1];
                }
            }
        }
        for(int j = 0; j < m; j++) {
            for(int i = n-1; i >= 0; i--) {
                colCon[i][j] = 1;
                if(i + 1 < n && s[i][j] == s[i + 1][j]) {
                    colCon[i][j] += colCon[i + 1][j];
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                lr[c][i][j][j] = colCon[i][j];
                for(int k = j + 1; k < m; k++) {
                    if(s[i][k] == s[i][k - 1]) {
                        lr[c][i][j][k] = Math.min(lr[c][i][j][k - 1], colCon[i][k]); 
                    } else {
                        lr[c][i][j][k] = 0;
                    }
                }
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                ud[c][i][j][j] = rowCon[i][j];
                for(int k = j + 1; k < n; k++) {
                    if(s[k][i] == s[k - 1][i]) {
                        ud[c][i][j][k] = Math.min(ud[c][i][j][k - 1], rowCon[k][i]);
                    } else {
                        ud[c][i][j][k] = 0;
                    }
                }
            }
        }
        for(int x = 1; x <= logn; x++) {
            if(lr[c][0][0][m-1] == n) {
                ans = x-1;
                break;
            }
            c ^= 1;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    int now = n - 1;
                    for(int k = j; k < m; k++) {
                        int shift = lr[c ^ 1][i][j][k];
                        lr[c][i][j][k] = shift + lr[c ^ 1][i + shift][j][k];
                        while(now >= i && 
                            ud[c ^ 1][j][i][now] + ud[c ^ 1][j + ud[c ^ 1][j][i][now]][i][now] < (k - j + 1)) {
                            --now;
                        }
                        lr[c][i][j][k] = Math.max(lr[c][i][j][k], now - i + 1);
                    }
                }   
            }
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    int now = m - 1;
                    for(int k = j; k < n; k++) {
                        int shift = ud[c ^ 1][i][j][k];
                        ud[c][i][j][k] = shift + ud[c ^ 1][i + shift][j][k];
                        while(now >= i &&
                            lr[c ^ 1][j][i][now] + lr[c ^ 1][j + lr[c ^ 1][j][i][now]][i][now] < (k - j + 1)) {
                            --now;
                        }
                        ud[c][i][j][k] = Math.max(ud[c][i][j][k], now - i + 1);
                    }
                }
            }
            if(lr[c][0][0][m-1] == n) {
                ans = x;
                break;
            }
        }    
        System.out.println(ans);
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
class Pair implements Comparator <Pair> {
    int first;
    int second;
    Pair  (int a, int b) {
        this.first = a;
        this.second = b;
    }
    Pair (Pair a) {
        this.first = a.first;
        this.second = a.second;
    }
    Pair () {}
    public String toString () {
        return "[" + first + ", " + second + "]";
    }
    public int compare (Pair a, Pair b) {
        if(a.first == b.first) {
            return a.second - b.second;
        } else {
            return a.first - b.first;
        }
    }
}
