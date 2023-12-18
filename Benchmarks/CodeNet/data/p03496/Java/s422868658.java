import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int[] a=new int[n];
        int m=0;
        int max=Integer.MIN_VALUE;
        int xindx=-1;
        int nindx=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a[i]=fsc.nextInt();
            if(max<a[i]){
                max=a[i];
                xindx=i;
            }
            if(min>a[i]){
                min=a[i];
                nindx=i;
            }
        }
        fsc.close();
        StringBuilder sb=new StringBuilder();
        if(min>=0){
            for(int i=0;i<n-1;i++){
                if(a[i]>a[i+1]){
                    a[i+1]+=a[i];
                    sb.append((i+1)).append(" ").append((i+2)).append("\n");
                    m++;
                }
            }
        } else if(max>0){
            if(max>=Math.abs(min)){
                for(int i=0;i<n;i++){
                    if(a[i]<0){
                        a[i]+=max;
                        sb.append((xindx+1)).append(" ").append((i+1)).append("\n");
                    }
                }
                for(int i=0;i<n-1;i++){
                    if(a[i]>a[i+1]){
                        a[i+1]+=a[i];
                        sb.append((i+1)).append(" ").append((i+2)).append("\n");
                        m++;
                    }
                }
            } else{
                for(int i=0;i<n;i++){
                    if(a[i]>0){
                        a[i]+=min;
                        sb.append((nindx+1)).append(" ").append((i+1)).append("\n");
                    }
                }
                for(int i=n-1;i>0;i--){
                    if(a[i]<a[i-1]){
                        a[i-1]+=a[i];
                        sb.append((i+1)).append(" ").append(i).append("\n");
                        m++;
                    }
                }
            }
        } else{
            for(int i=n-1;i>0;i--){
                if(a[i]<a[i-1]){
                    a[i-1]+=a[i];
                    sb.append(i).append(" ").append((i+1)).append("\n");
                    m++;
                }
            }
        }
        System.out.println(m);
        System.out.print(sb);
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
