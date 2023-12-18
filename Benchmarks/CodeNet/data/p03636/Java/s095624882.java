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
        TaskB solver = new TaskB();
        solver.solve( 1, in, out );
        out.close();
    }

    static class TaskB {
        public void solve (int testNumber, InputReader in, PrintWriter out) {
            String str = in.readString();
            out.println( ( str.charAt( 0 ) ) + "" + ( ( str.length() - 2 ) ) + "" + ( str.charAt( str.length() - 1 ) ) );
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

        public String readString () {
            int c = read();
            while ( isSpaceChar( c ) ) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint( c );
                c = read();
            } while ( ! isSpaceChar( c ) );
            return res.toString();
        }

        public boolean isSpaceChar (int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == - 1;
        }

    }
}

