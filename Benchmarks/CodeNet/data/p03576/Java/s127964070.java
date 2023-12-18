import java.util.*;
import java.io.*;

public class ABC075{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt(), k=fsc.nextInt();
        long x[]=new long[n], y[]=new long[n];
        boolean pattern[]=new boolean[n];
        for(int i=0;i<n;i++){
            x[i]=fsc.nextLong();
            y[i]=fsc.nextLong();
            if(i<k) pattern[i]=true;
        }
        fsc.close();
        long xmax,xmin,ymax,ymin;
        long ans=Long.MAX_VALUE;
        boolean loop=true;
        while(loop){
            xmax=Long.MIN_VALUE;xmin=Long.MAX_VALUE;ymax=Long.MIN_VALUE;ymin=Long.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(pattern[i]){
                    xmax=Math.max(xmax,x[i]);
                    xmin=Math.min(xmin,x[i]);
                    ymax=Math.max(ymax,y[i]);
                    ymin=Math.min(ymin,y[i]);
                }
            }
            ans=Math.min((xmax-xmin)*(ymax-ymin), ans);
            boolean exTrue=false;
            for(int i=0;i<n;i++){
                if(i==n-k && !exTrue){
                    loop=false;
                    break;
                }
                if(pattern[i]) exTrue=true;
                if(exTrue && !pattern[i]){
                    pattern[i]=true;
                    pattern[i-1]=false;
                    for(int j=0;j<i-1;j++) pattern[j]=true;
                    break;
                }
            }
            System.out.println(ans);
        }
    }

    static class FastScanner {
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
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}