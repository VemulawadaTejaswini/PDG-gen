import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        long s = sc.nextLong();

        long a=0, b=0,c=0, d=0;
        long gr = 0;
        a = (long)Math.sqrt((double)s);
        if(a == 0) a = 1;
        out: while(true){
            b = s / a;
            while(a*b < s && b < 1000000000) b++;
            long r = (a*b - s);
            gr = r;

            // System.out.println(a + " " + b + " " + r);

            if(r == 0){
                c = 0;
                d = 0;
                break;
            }

            ArrayList<Long> list = new ArrayList<Long>();
            long sr = (long)Math.sqrt((double)r);
            for(int i=2; i<sr; ){
                if(r % i == 0){
                    r /= i;
                    list.add((long)i);
                }else{
                    i++;
                }
            }

            list.add(r);

            c = 1;
            d = 1;
            boolean bl = true;
            int size = list.size();
            for(int i=0; i<size; i++){
                if(bl){
                    c *= list.get(size - 1 - i);
                    bl = false;
                }else{
                    d *= list.get(size - 1 - i);
                    bl = true;
                }
            }

            if(c <= b && d <= a) break;

            // for(c=1; c<b && c < 1000; c++){
            //     System.out.println(r%c);
            //     if(r % c == 0 && c <= d && r / c <= b){
            //         d = r / c;
            //         break out;
            //     }
            // }

            if(a < 1000000000) a++;
        }
        

        // System.out.println(a * b - c * d);

        //DEBUG
        System.out.println("0 0 " + a + " " + c + " " + d + " " + b);
        // System.out.println(gr);

    }


    private static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
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

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
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
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
