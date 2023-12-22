import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    static PrintWriter out;
    static Reader in;
    public static void main(String[] args) throws IOException {
        //out = new PrintWriter(new File("out.txt"));
        //PrintWriter out = new PrintWriter(System.out);
        //in = new Reader(new FileInputStream("in.txt"));
        //Reader in = new Reader();
        input_output();
        Main solver = new Main();
        solver.solve();
        out.flush();
        out.close();
 
    }
 
    static int INF = (int)2e9+5;
    static int maxn = (int)2e6+5;
    static int mod=(int)1e9+7 ;
    static int n, m, t, q, k;
    
    void solve() throws IOException{
        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt();

        String s;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            s = in.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = (s.charAt(j) == '.') ? 0: 1;
            }
        }

        int nmax = 1, mmax = 1;
        for (int i = 0; i < n; i++) nmax *=2;
        for (int i = 0; i < m; i++) mmax *=2;

        int sum = 0, ans = 0;
        int[][] tmp = new int[n][m];
        for (int i = 0; i < nmax; i++) {
            for (int j = 0; j < mmax; j++) {

                for (int x = 0; x < n; x++) 
                    for (int y = 0; y < m; y++) 
                        tmp[x][y] = arr[x][y];

                for (int x = 0; x < n; x++) {
                    if (((1<<x)&i) != 0) {
                        for (int y = 0; y < m; y++) tmp[x][y] = 0;
                    }
                }
                for (int x = 0; x < m; x++) {
                    if (((1<<x)&j) != 0) {
                            for (int y = 0; y < n; y++) tmp[y][x] = 0;
                    }
                }  

                sum = 0;

                for (int x = 0; x < n; x++) 
                    for (int y = 0; y < m; y++) 
                        sum += tmp[x][y];
                if (sum == k) ans++;
            }
        }

        out.println(ans);




    }
 
    //<>

    static class Reader {
 
        private InputStream mIs;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
    
        public Reader() {
            this(System.in);
        }
    
        public Reader(InputStream is) {
            mIs = is;
        }
    
        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
    
        }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = mIs.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }
    
        public String nextLine() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }
    
        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }
    
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
    
        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
    
        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
    
        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    
        public boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
 
    }
    static void input_output() throws IOException {
        File f = new File("in.txt");
        if(f.exists() && !f.isDirectory()) { 
            in = new Reader(new FileInputStream("in.txt"));
        } else in = new Reader();
        f = new File("out.txt");
        if(f.exists() && !f.isDirectory()) {
            out = new PrintWriter(new File("out.txt"));
        } else out = new PrintWriter(System.out);
    }
}