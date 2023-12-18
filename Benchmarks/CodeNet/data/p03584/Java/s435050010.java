import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int k=fsc.nextInt();
        long[][] ab=new long[n][2];
        for(int i=0;i<n;i++){
            ab[i][0]=fsc.nextLong();
            ab[i][1]=fsc.nextLong();
        }
        fsc.close();
        int ones=Long.bitCount(k)+1;
        long[] max=new long[ones];
        long ans=0;
        int[] one=new int[ones];
        int indx=0;
        for(int i=29;i>=0;i--){
            if((k&(1<<i))!=0){
                one[indx++]=i;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<ones;j++){
                boolean ok=true;
                for(int bit=29;bit>=0;bit--){
                    if(bit>one[j]){
                        if((ab[i][0]&(1<<bit))!=0 && (k&(1<<bit))==0){
                            ok=false;
                            break;
                        }
                    } else if(bit==one[j]){
                        if((ab[i][0]&(1<<bit))!=0){
                            ok=false;
                            break;
                        }
                    }
                }
                if(ok){
                    max[j]+=ab[i][1];
                    ans=Math.max(ans, max[j]);
                }
            }
        }
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
