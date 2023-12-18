
import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        long m = fs.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
        }
        Arrays.sort(a);
        long[] sum = new long[n+1];
        for(int i=0;i<n;i++)sum[i+1] = sum[i] + a[i];
        int lb = 0;
        int rb = 200001;
        int v;
        while(rb-lb>1){
            long count = 0;
            v = (rb+lb)/2;
            for(int i=0;i<n;i++){
                count+=n-lower_bound(a,v-a[i]);
            }
            if(count >=m){
                lb = v;
            }else{
                rb = v;
            }
        }
        //この時点でlbが条件を満たす値
        long count = 0;
        long val = 0;
        for(int i=0;i<n;i++){
            int idx = lower_bound(a,lb-a[i]);
            val+=(sum[n]-sum[idx]);
            val+=a[i]*(n-idx);
            count+=n-idx;
        }
        //M回を超過した分は減らす
        System.out.println(val-(count-m)*lb);
    }
    public static int lower_bound(int[] a,int k){
        int lb = -1;
        int rb = a.length;
        int mid;
        while(Math.abs(rb-lb)>1){
            mid = (rb+lb)/2;
            if(a[mid] >=k){
                rb = mid;
            }else{
                lb = mid;
            }
        }
        return rb;
    }

    static class FastScanner {
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
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
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
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}