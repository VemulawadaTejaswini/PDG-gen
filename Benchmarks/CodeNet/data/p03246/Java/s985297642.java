//Sample format for atcoder

import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main{

    public static void main(String args[]) {
        InputReader sc = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt(), arr[] = new int[n], maxCount = 0, ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        maxCount = 1;
        map.put(arr[0], 1);

        for(int i=2; i<n; i+=2){
            int val = 1;

            if(map.containsKey(arr[i]))
                val += map.get(arr[i]);

            if(val > maxCount)
                maxCount = val;

            map.put(arr[i], val);
        }

        ans += (n/2)-maxCount;

        maxCount = 1;
        map.clear();
        map.put(arr[1], 1);

        for(int i=3; i<n; i+=2){
            int val = 1;

            if(map.containsKey(arr[i]))
                val += map.get(arr[i]);

            if(val > maxCount)
                maxCount = val;

            map.put(arr[i], val);
        }

        ans += (n/2)-maxCount;

        pw.println(ans);

        pw.flush();
        pw.close();
    }

    static class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;

        InputReader(InputStream stream) {
            this.stream = stream;
        }

        int snext() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        int nextInt() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        long nextLong() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        String readString() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String nextLine() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public interface SpaceCharFilter {
            boolean isSpaceChar(int ch);
        }
    }
}