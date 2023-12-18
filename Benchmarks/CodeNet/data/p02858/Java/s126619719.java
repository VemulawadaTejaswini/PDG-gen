import java.util.*;
import java.io.*;

class Main{
    static long MOD=1000000007;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        long h=fsc.nextLong(), w=fsc.nextLong(), t=fsc.nextLong();
        fsc.close();
        if(t%h==0 && t%w==0){
            System.out.println(pow3(h*w));
            return;
        }
        if(t%h==0){
            long r=euclideanGCD(w, t);
            long base=(pow(2, r)+1)%MOD;
            long ans=pow(base, (h*w)/r);
            System.out.println(ans);
            return;
        }
        if(t%w==0){
            long r=euclideanGCD(h, t);
            long base=(pow(2, r)+1)%MOD;
            long ans=pow(base, (h*w)/r);
            System.out.println(ans);
            return;
        }
        long u=euclideanGCD(w, t);
        long v=euclideanGCD(h, t);
        long ans=pow(3, u*v);
        System.out.println(ans);
    }
    static long pow(long base, long index){
        if(index==0) return 1;
        if(index==1) return base;
        return (pow(base, index/2)*pow(base, index-index/2))%MOD;
    }
    public static long euclideanGCD(long a, long b) {
        if(a < b) return euclideanGCD(b, a);
        long r=a%b;
        while (r!=0) {
          a = b;
          b = r;
          r=a%b;
        }
        return b;
    }
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte(){
            if(ptr<buflen) return true;
            else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen<=0) return false;
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
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }
                else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}