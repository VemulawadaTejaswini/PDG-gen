import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long[][] lr=new long[n][2];
        for(int i=0;i<n;i++){
            long x=fsc.nextLong();
            long l=fsc.nextLong();
            lr[i][0]=x-l;
            lr[i][1]=x+l;
        }
        fsc.close();
        Arrays.sort(lr, (u, v)->u[0]>v[0]?1:u[0]<v[0]?-1:0);
        int ans=n;
        long prer=Long.MIN_VALUE;
        for(int i=0;i<n;){
            int pass=i, fail=n;
            while(fail-pass>1){
                int mid=pass+(fail-pass)/2;
                if(lr[mid][0]<lr[i][1]) pass=mid;
                else fail=mid;
            }
            long rmin;
            if(prer<lr[i][0]){
                rmin=prer;
                ans-=pass-i;
            } else{
                rmin=lr[i][1];
                ans-=pass-i+1;
            }
            for(int j=i;j<=pass;j++){
                if(lr[j][1]<rmin){
                    rmin=lr[j][1];
                }
            }
            prer=rmin;
            i=pass+1;
        }
        System.out.println(ans);
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
