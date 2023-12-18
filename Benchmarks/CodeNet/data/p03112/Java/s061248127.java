import java.util.*;
import java.io.*;

public class Main{
    static long MIN=-100000000000000l;
    static long MAX= 100000000000000l;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int a=fsc.nextInt(), b=fsc.nextInt(), q=fsc.nextInt();
        long[] s=new long[a+2], t=new long[b+2];
        for(int i=0;i<a+2;i++){
            if(i==0) s[i]=MIN;
            else if(i==a+1) s[i]=MAX;
            else s[i]=fsc.nextLong();
        }
        for(int j=0;j<b+2;j++){
            if(j==0) t[j]=MIN;
            else if(j==b+1) t[j]=MAX;
            else t[j]=fsc.nextLong();
        }
        PrintWriter pw=new PrintWriter(System.out);
        StringBuilder sb=new StringBuilder("");
        long x;
        for(int k=0;k<q;k++){
            x=fsc.nextLong();
            int sl=binarySearch(s, x);
            int tl=binarySearch(t, x);
            long opt=MAX;
            opt=Math.min(opt,Math.max(s[sl+1],t[tl+1])-x);
            opt=Math.min(opt,x-Math.min(s[sl],t[tl]));
            opt=Math.min(opt,2*(x-s[sl])+t[tl+1]-x);
            opt=Math.min(opt,2*(x-t[tl])+s[sl+1]-x);
            opt=Math.min(opt,2*(s[sl+1]-x)+x-t[tl]);
            opt=Math.min(opt,2*(t[tl+1]-x)+x-s[sl]);
            sb.append(opt+"\n");
        }
        fsc.close();
        pw.print(sb);
        pw.flush();
    }

    public static boolean isOK(long[] array, int index, long key) {
        if (array[index]<=key) return true;
        return false;
    }
    public static int binarySearch(long[] array, long key){
        int left = 0;
        int right = array.length+1;
        while (right-left>1){
            int mid = left + (right - left) / 2;

            if (isOK(array, mid, key)) left = mid;
            else right = mid;
        }
        return left;
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