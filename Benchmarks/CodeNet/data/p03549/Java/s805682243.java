import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt(), m=fsc.nextInt();
        fsc.close();
        long[] t=new long[6];
        for(int i=1;i<=5;i++){
            t[i]=1900*i + 100*(n-i);
        }
        double[] ans=new double[m+1];
        for(int i=0;i<=m;i++){
            if(i==0){
                ans[i]=0.;
            }

            // if(i==1){
            //     //ans[1]=2.*t[i];
            // }
            // if(i==2){
            //     //ans[2]=(4.*t[i]+2*ans[1])/3;
            // }
            // if(i==3){
            //     //ans[3]=(8.*t[i]+3*ans[2]+3*ans[1])/7;
            // }
            // if(i==4){
            //     //ans[4]=(16.*t[i]+4*ans[3]+6*ans[2]+4*ans[1])/15;
            // }
            // if(i==5){
            //     //ans[5]=(32.*t[i]+5*ans[4]+10*ans[3]+10*ans[2]+5*ans[1])/31;
            // }
        }
        System.out.println((1l<<m)*t[m]);
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
