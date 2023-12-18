import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        long h=fsc.nextLong(), w=fsc.nextLong();
        int n=fsc.nextInt();
        long[][] ab=new long[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                ab[i][j]=fsc.nextLong()-1;
            }
        }
        fsc.close();
        long max=1_000_000_000l;
        long[] ans=new long[10];
        ans[0]=(h-2)*(w-2);
        HashSet<Long> pairs=new HashSet<>();
        for(int i=0;i<n;i++){
            long a=ab[i][0], b=ab[i][1];
            for(long j=Math.max(0, a-2);j<=Math.min(a, h-3);j++){
                for(long k=Math.max(0, b-2);k<=Math.min(b, w-3);k++){
                    int cnt=0;
                    for(int l=0;l<3;l++){
                        for(int m=0;m<3;m++){
                            long vl=(j+l)+(k+m)*max;
                            if(pairs.contains(vl)){
                                cnt++;
                            }
                        }
                    }
                    ans[cnt]--;
                    ans[cnt+1]++;
                }
            }
            pairs.add(a+b*max);
        }
        for(long a:ans){
            System.out.println(a);
        }
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
