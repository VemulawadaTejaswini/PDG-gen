import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int p = sc.nextInt();
        String s = sc.next();
        HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
        // data.put(0, 1);
        long ans = 0;

        for (int i = 0; i < n; i++) {
            int m = (s.charAt(i) - '0') % p;
            HashMap<Integer, Integer> work = new HashMap<Integer, Integer>();

            for(Integer key : data.keySet()){
                int mm1 = (key * 10 + m) % p;
                int mm2 = data.get(key);
                work.merge(mm1, mm2, (v1, v2) -> {return v1 + v2;});
                // if(work.containsKey(mm1)){
                //     work.put(mm1, work.get(mm1) + mm2);
                // }else{
                //     work.put(mm1, mm2);
                // }
            }
            work.merge(m, 1, (v1, v2) -> {return v1 + v2;});
            // if(work.containsKey(m)){
            //     work.put(m, work.get(m) + 1);
            // }else{
            //     work.put(m, 1);
            // }
            if(work.containsKey(0)){
                ans += work.get(0);
            }
            data = work;
        }

        System.out.println(ans);

    }

    
    static long modinv(long a, long m){
        long b = m, u = 1, v = 0;
        while(b > 0){
            long t = a / b;
            a -= t * b;
            long tmp = a;
            a = b;
            b = tmp;
            u -= t * v;
            tmp = u;
            u = v;
            v = tmp;
        }
        u %= m;
        if (u < 0) u += m;
        return u;
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

