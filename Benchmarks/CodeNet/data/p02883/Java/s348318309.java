import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long k=fsc.nextLong();
        int[] a=new int[n];
        int[] f=new int[n];
        for(int i=0;i<n;i++) a[i]=fsc.nextInt();
        for(int i=0;i<n;i++) f[i]=fsc.nextInt();
        fsc.close();
        Arrays.sort(a);
        Arrays.sort(f);
        for(int i=0;i<n/2;i++){
            int tmp=f[i];
            f[i]=f[n-i-1]; f[n-i-1]=tmp;
        }
        long[][] af=new long[n][2];
        for(int i=0;i<n;i++){
            af[i][0]=(long)a[i]*(long)f[i];
            af[i][1]=f[i];
        }
        long l=0, r=Long.MAX_VALUE, m=(l+r)/2;
        while(r-l>1){
            long num=0;
            for(int i=0;i<n;i++) if(af[i][0]>m) num+=(long)Math.ceil((double)(af[i][0]-m)/(double)af[i][1]);
            if(num>k) l=m;
            else r=m;
            if(r-l==1){
                num=0;
                for(int i=0;i<n;i++) num+=(long)Math.ceil((double)af[i][0]/(double)af[i][1]);
                System.out.println(num<=k?0:r);
            }
            m=l+(r-l)/2;
        }
    }
    public static boolean isOK(long[] array, int index, long key) {
        if (array[index] >= key) return true;
        return false;
    }
    public static int binarySearch(long[] array, long key){
        int left = 0;
        int right = array.length-1;
        while (right - left > 1) {
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