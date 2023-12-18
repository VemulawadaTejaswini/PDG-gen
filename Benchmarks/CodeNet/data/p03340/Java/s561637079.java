import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=fsc.nextInt();
        fsc.close();
        long[] subans=new long[n];
        boolean[] bitb=new boolean[20];
        long ans=0;
        LoopL:for(int l=0;l<n;l++){
            for(int bit=0;bit<20;bit++){
                if(l>0 && (a[l-1]&(1<<bit))!=0){
                    bitb[bit]=false;
                }
            }
            LoopJ:for(int j=l-1+(l>0?(int)subans[l-1]:1);j<n;j++){
                boolean[] b=new boolean[20];
                for(int bit=0;bit<20;bit++){
                    if((a[j]&(1<<bit))!=0){
                        b[bit]=true;
                        if(b[bit] && bitb[bit]){
                            subans[l]=j-l;
                            continue LoopL;
                        }
                    }
                }
                for(int bit=0;bit<20;bit++) if(b[bit]) bitb[bit]=true;
            }
            subans[l]=n-l;
        }
        for(int i=0;i<n;i++) ans+=subans[i];
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
