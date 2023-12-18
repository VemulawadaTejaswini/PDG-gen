import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
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
        TaskC solver = new TaskC();
        solver.solve( 1, in, out );
        out.close();
    }

    static class TaskC {
        public void solve (int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            Map<Integer, Integer> cnt = new HashMap<>();
            for ( int i = 0; i < n; i++ ) {
                int next = in.nextInt();
                if ( cnt.get( next ) == null ) {
                    cnt.put( next, 1 );
                }
                else {
                    cnt.put( next, cnt.get( next ) + 1 );
                }
                if ( cnt.get( next + 1 ) == null ) {
                    cnt.put( next + 1, 1 );
                }
                else {
                    cnt.put( next + 1, cnt.get( next + 1 ) + 1 );
                }
                if ( cnt.get( next - 1 ) == null ) {
                    cnt.put( next - 1, 1 );
                }
                else {
                    cnt.put( next - 1, cnt.get( next - 1 ) + 1 );
                }
            }
            int max = 0;
            Iterator<Integer> keys = cnt.keySet().iterator();
            while ( keys.hasNext() ) {
                int key = keys.next();
                max = Math.max( max, cnt.get( key ) );
            }
            out.println( max );
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

        public boolean isSpaceChar (int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == - 1;
        }

    }
}

