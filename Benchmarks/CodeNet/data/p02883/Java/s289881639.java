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
        // long[][] af=new int[n][2];
        // for(int i=0;i<n;i++){
        //     af[i][0]=a[i]*f[n-i-1];
        //     af[i][1]=i;
        // }
        // Arrays.sort(af,(x,y)->{return x[0]<y[0]?1:x[0]>y[0]?-1:0;});

        long[] accumRev=new long[n];
        for(int i=n-1;i>=0;i--){
            if(i==n-1) accumRev[i]=a[i];
            else accumRev[i]=accumRev[i+1]+a[i];
        }
        for(int i=1;i<=n;i++){
            if(i==n) continue;
            else accumRev[n-i]=accumRev[n-i]-a[n-i-1]*i;
        }
        int left=binarySearch(accumRev, k);
        for(int i=left;i<n;i++){
            if(left==0) a[i]=0;
            else a[i]=a[left-1];
        }
        for(int i=0;i<accumRev[left]-k;i++){
            a[n-i-1]++;
        }
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=a[n-i-1]*f[i];
        }
        ans/=n;
        System.out.println(ans);
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