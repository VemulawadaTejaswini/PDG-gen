import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long[] a=new long[3*n];
        for(int i=0;i<3*n;i++){
            a[i]=fsc.nextLong();
        }
        fsc.close();
        long[] fmax=new long[n+1];
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(a[i]);
            fmax[0]+=a[i];
        }
        for(int i=n;i<2*n;i++){
            if(a[i]>pq.peek()){
                fmax[i-n+1]=fmax[i-n]+a[i]-pq.poll();
                pq.add(a[i]);
            }
            else fmax[i-n+1]=fmax[i-n];
        }
        long[] bmin=new long[n+1];
        PriorityQueue<Long> revpq=new PriorityQueue<>((u, v)->u<v?1:u>v?-1:0);
        for(int i=2*n;i<3*n;i++){
            revpq.add(a[i]);
            bmin[n]+=a[i];
        }
        for(int i=2*n-1;i>=n;i--){
            if(a[i]<revpq.peek()){
                bmin[i-n]=bmin[i-n+1]+a[i]-revpq.poll();
                revpq.add(a[i]);
            }
            else bmin[i-n]=bmin[i-n+1];
        }
        long max=Long.MIN_VALUE;
        for(int i=0;i<=n;i++){
            max=Math.max(max, fmax[i]-bmin[i]);
        }
        System.out.println(max);
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
