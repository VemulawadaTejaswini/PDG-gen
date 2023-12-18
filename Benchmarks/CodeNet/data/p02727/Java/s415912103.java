
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static class Value {
        int type;
        int value;
        Value(int type, int value) {
            this.type = type;
            this.value = value;
        }

        public int getType() {
            return type;
        }

        public int getValue() {
            return value;
        }
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        PriorityQueue<Value> pq = new PriorityQueue<>(Comparator.comparing(Value::getValue).reversed());

        for(int i = 0 ; i < A; i++) {
            pq.add(new Value(0, scan.nextInt()));
        }
        for(int i = 0 ; i < B; i++) {
            pq.add(new Value(1, scan.nextInt()));
        }
        for(int i = 0 ; i < C; i++) {
            pq.add(new Value(2, scan.nextInt()));
        }

        long ans = 0;
        long ac = 0;
        long bc = 0;
        long cc = 0;
        for(; ac+bc+cc < X+Y;) {
            Value v = pq.remove();
            switch (v.getType()) {
                case 0:
                    if(ac < X){
                        ans += v.getValue();
                        ac++;
                    }
                    break;

                case 1:
                    if(bc < Y){
                        ans += v.getValue();
                        bc++;
                    }
                    break;

                case 2:
                    ans += v.getValue();
                    cc++;
                    break;
            }
        }

        os.println(ans);

    }

    private static class Scanner {

        private final InputStream is;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        Scanner(InputStream is) {
            this.is = is;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = is.read(buffer);
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
            if (hasNextByte()) {
                return buffer[ptr++];
            } else {
                return -1;
            }
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
                ptr++;
            }
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
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
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
                throw new NumberFormatException();
            }
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}