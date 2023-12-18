
    import javax.xml.crypto.Data;
    import java.math.BigDecimal;
    import java.util.*;
    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            //入力
            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FastScanner sc = new FastScanner();
            char[] S = sc.next().toCharArray();
            int a = Integer.parseInt("" + S[0]);
            int b = Integer.parseInt("" + S[1]);
            int c = Integer.parseInt("" + S[2]);
            int d = Integer.parseInt("" + S[3]);

            //出力
            if (a + b + c + d == 7) System.out.printf("%d+%d+%d+%d=7\n", a, b, c, d);
            else if (a + b + c - d == 7) System.out.printf("%d+%d+%d-%d=7\n", a, b, c, d);
            else if (a + b - c + d == 7) System.out.printf("%d+%d-%d+%d=7\n", a, b, c, d);
            else if (a + b - c - d == 7) System.out.printf("%d+%d-%d-%d=7\n", a, b, c, d);
            else if (a - b + c + d == 7) System.out.printf("%d-%d+%d+%d=7\n", a, b, c, d);
            else if (a - b + c - d == 7) System.out.printf("%d-%d+%d-%d=7\n", a, b, c, d);
            else if (a - b - c + d == 7) System.out.printf("%d-%d-%d+%d=7\n", a, b, c, d);
            else if (a - b - c - d == 7) System.out.printf("%d-%d-%d-%d=7\n", a, b, c, d);

        }

    }


    class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            }else{
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }else if(b == -1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
    }
