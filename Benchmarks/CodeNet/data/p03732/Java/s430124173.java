import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long w=fsc.nextLong();
        long w0=0;
        PriorityQueue<Long>[] pq=new PriorityQueue[4];
        for(int i=0;i<4;i++){
            pq[i]=new PriorityQueue<>((u, v)->u<v?1:u>v?-1:0);
        }
        for(int i=0;i<n;i++){
            long wi=fsc.nextLong();
            long vi=fsc.nextLong();
            if(i==0){
                w0=wi;
            }
            pq[(int)(wi-w0)].add(vi);
        }
        fsc.close();
        int[] len=new int[4];
        for(int i=0;i<4;i++){
            len[i]=pq[i].size();
        }
        long[][] sorted=new long[4][n+1];
        for(int i=0;i<4;i++){
            for(int j=1;j<=len[i];j++){
                sorted[i][j]=sorted[i][j-1]+pq[i].poll();
            }
        }
        long max=0;
        for(int k=0;k<=n;k++){
            for(int a=0;a<=Math.min(k, len[0]);a++){
                for(int b=0;b<=Math.min(k-a, len[1]);b++){
                    for(int c=0;c<=Math.min(k-a-b, len[2]);c++){
                        int d=k-a-b-c;
                        if(d>len[3]) continue;
                        if(w0*k+b+2*c+3*d>w) continue;
                        max=Math.max(max, sorted[0][a]+sorted[1][b]+sorted[2][c]+sorted[3][d]);
                        //System.out.println(k+" "+a+" "+b+" "+c+" "+d);
                    }
                }
            }
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
