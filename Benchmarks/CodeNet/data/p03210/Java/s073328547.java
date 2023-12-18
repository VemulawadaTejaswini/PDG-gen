import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    private static PrintWriter out;
    private static FastScanner in;

  	private static void solve(){
        int n = in.nextInt();
        if(n == 3 || n == 5 || n == 7)
            out.println("Yes");
        else
            out.println("No");
    }


	public static void main(String[] args){
        out = new PrintWriter(System.out);
        in = new FastScanner(System.in);
        solve();
        out.flush();
    }


    private static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer, bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if(bufLength == -1)
                throw new InputMismatchException();
            if (bufPointer >= bufLength) {
                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isPrintableChar(int c) {
            return (c >= 33 && c <= 126);
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(!isPrintableChar(b))
                b = readByte();
            while(isPrintableChar(b)){
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong(){
            long n = 0;

            int b = readByte();
            while(isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while(b >= '0' && b <= '9'){
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt(){
            int n = 0;

            int b = readByte();
            while(isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while(b >= '0' && b <= '9'){
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }


}
