import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String s = sc.next();
        String t = sc.next();

        TreeSet<Integer>[] pos = new TreeSet[26];
        for(int i=0; i<26; i++) pos[i] = new TreeSet<Integer>();

        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i) - 'a';
            // System.out.println(c);
            pos[c].add(i);
        }


        int mpos = -1;
        long loop = 1;
        int len = s.length();
        out: for(int i=0; i<t.length();){
            int c = t.charAt(i) - 'a';
            if(pos[c].size() == 0){
                System.out.println(-1);
                return;
            }
            int mmlen = mpos - len * (loop-1);
            
            // int ppos = Collections.binarySearch(pos[c], mmlen);
            Integer ppos = pos[c].higher(mmlen);
            if(ppos == null){
                loop++;
                continue out;
            }

            // int ppos = Collections.binarySearch(pos[c], (mpos+1) % len);

            // if(ppos > 0) ppos--;            
            // if(ppos < 0) ppos = (ppos+1) * -1;
            // if(ppos >= pos[c].size()){
            //     loop++;
            //     continue out;
            // }

            int tpos = ppos + (loop-1) * len;
            if(tpos > mpos){
                mpos = tpos;
                i++;
                continue out;
            }
        
            // for(int j=ppos; j<pos[c].size(); j++){
            //     int tpos = pos[c].get(j) + (loop-1) * len;
            //     if(tpos > mpos){
            //         mpos = tpos;
            //         i++;
            //         continue out;
            //     }
            // }
            loop++;
        }

        System.out.println(mpos+1);
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
