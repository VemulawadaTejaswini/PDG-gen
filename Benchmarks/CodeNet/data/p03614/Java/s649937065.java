import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhilash Mandaliya
 */
public class Main {
    public static void main (String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader( inputStream );
        PrintWriter out = new PrintWriter( outputStream );
        TaskD solver = new TaskD();
        solver.solve( 1, in, out );
        out.close();
    }

    static class TaskD {
        public void solve (int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] nums = in.nextIntArray( n );
            int cnt = 0;
            for ( int i = 1; i < n; i++ ) {
                if ( i + 1 == nums[i] || i == nums[i - 1] ) {
                    cnt++;
                    int temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                }
            }
            out.println( cnt );
        }

    }

    static class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar;
        private int snumChars;

        public InputReader (InputStream st) {
            this.stream = st;
        }

        public int read () {
            if ( snumChars == - 1 )
                throw new InputMismatchException();
            if ( curChar >= snumChars ) {
                curChar = 0;
                try {
                    snumChars = stream.read( buf );
                } catch ( IOException e ) {
                    throw new InputMismatchException();
                }
                if ( snumChars <= 0 )
                    return - 1;
            }
            return buf[curChar++];
        }

        public int nextInt () {
            int c = read();
            while ( isSpaceChar( c ) ) {
                c = read();
            }
            int sgn = 1;
            if ( c == '-' ) {
                sgn = - 1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while ( ! isSpaceChar( c ) );
            return res * sgn;
        }

        public int[] nextIntArray (int n) {
            int a[] = new int[n];
            for ( int i = 0; i < n; i++ ) {
                a[i] = nextInt();
            }
            return a;
        }

        public boolean isSpaceChar (int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == - 1;
        }

    }
}