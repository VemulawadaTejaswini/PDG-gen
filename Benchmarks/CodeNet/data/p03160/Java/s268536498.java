
import java.util.*;
import java.io.*;
/**
 *
 * @author J
 */
public class Main {
    static int n;
    static long [] heights;
    static long [] dp;
    public static void main(String[] args) {
        // TODO code application logic here
        //this is probably complete, but can't submit until I get an account
        
        //https://atcoder.jp/contests/dp/tasks/dp_b
        InputReader input = new InputReader(System.in);
        n = input.readInt();
        int k = input.readInt();
        heights = new long [n+1];
        dp = new long [n+1];
        for (int i = 1; i <= n; i++) {
            heights[i] = input.readInt();
        }
        Arrays.fill(dp, (int)1E9+7);
        dp[1] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k && i+j<=n; j++) {
                dp[i+j] = Math.min(dp[i] + Math.abs(heights[i]-heights[i+j]), dp[i+j]);
            }
        }
        //fun(1);
        System.out.println(dp[n]);
    }
    public static long fun (int cur) { //start from cur
        //if (dp[cur]!=0) return dp[cur];
        if (cur+1<=n) {
            if (cur+2<=n) {
                return dp[cur] = Math.abs(heights[cur+1]-heights[cur]) + Math.min(fun(cur+1), fun(cur+2));
            }
            return dp[cur] = Math.abs(heights[cur+1]-heights[cur]) + fun(cur+1);
        }
        return 0;
    }
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }
        public int read() {
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } 
                catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }
        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
        public long readLong() {
            return Long.parseLong(readString());
        }
        public String readString() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }
        public String readLine() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isNewLine(c));
            return res.toString();
        }
        public boolean isSpaceChar(int c) {
            if (filter != null) return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
        public boolean isNewLine (int c) {
            if (filter!=null) return filter.isSpaceChar(c);
            return c=='\n' || c=='\r' || c==-1;
        }
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}
