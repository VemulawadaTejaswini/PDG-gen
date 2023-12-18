import java.util.*;
import java.io.*;

class Main{

    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int a=fsc.nextInt(), b=fsc.nextInt(), c=fsc.nextInt();
        int[] l=new int[n];
        for(int i=0;i<n;i++) l[i]=fsc.nextInt();
        fsc.close();
        int[] ac=new int[1<<n];
        int[] bc=new int[1<<n];
        int[] cc=new int[1<<n];
        for(int i=1;i<(1<<n);i++){
            ac[i]=(Integer.bitCount(i)-1)*10;
            bc[i]=(Integer.bitCount(i)-1)*10;
            cc[i]=(Integer.bitCount(i)-1)*10;
            int s=0;
            for(int bit=0;bit<n;bit++) if(((1<<bit)&i)!=0) s+=l[bit];
            ac[i]+=Math.abs(a-s);
            bc[i]+=Math.abs(b-s);
            cc[i]+=Math.abs(c-s);
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<(1<<n);i++){
            for(int j=1;j<(1<<n);j++){
                for(int k=1;k<(1<<n);k++){
                    if((i&j)!=0 || (j&k)!=0 || (k&i)!=0) continue;
                    min=Math.min(min, ac[i]+bc[j]+cc[k]);
                }
            }
        }
        System.out.println(min);
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
