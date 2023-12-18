import java.util.*;
import java.io.*;

public class Main{
    static int k;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int x=fsc.nextInt(), y=fsc.nextInt(), z=fsc.nextInt();
        k=fsc.nextInt();
        long[] a=new long[x], b=new long[y], c=new long[z];
        for(int i=0;i<x;i++) a[i]=fsc.nextLong();
        for(int i=0;i<y;i++) b[i]=fsc.nextLong();
        for(int i=0;i<z;i++) c[i]=fsc.nextLong();
        fsc.close();
        Arrays.sort(a); Arrays.sort(b); Arrays.sort(c);
        long[] ab=sumMerge(a, b);
        long[] cop=new long[ab.length];
        for(int i=0;i<ab.length;i++) cop[i]=ab[ab.length-i-1];
        long[] ans=sumMerge(cop, c);
        for(int i=0;i<k;i++) System.out.println(ans[i]);
    }
    static long[] sumMerge(long[] u, long[] v){
        long[][] ret=new long[u.length][v.length];
        for(int ui=0;ui<u.length;ui++) for(int vi=0;vi<v.length;vi++) ret[u.length-1-ui][v.length-1-vi]=u[ui]+v[vi];
        long[] s=ret[0], t;
        for(int i=1;i<u.length;i++){
            t=ret[i];
            s=merge(s,t);
        }
        return s;
    }
    static long[] merge(long[] u, long[] v){
        int length=Math.min(k,u.length+v.length);
        int i=0, j=0;
        long[] ret=new long[length];
        long ui, vj;
        for(int k=0;k<length;k++){
            ui=i<u.length?u[i]:Long.MIN_VALUE;
            vj=j<v.length?v[j]:Long.MIN_VALUE;
            if(ui>vj){
                ret[k]=ui;
                i++;
            }
            else{
                ret[k]=vj;
                j++;
            }
        }
        return ret;
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