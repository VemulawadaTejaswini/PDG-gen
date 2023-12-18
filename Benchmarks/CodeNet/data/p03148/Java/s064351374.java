import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt(), k=fsc.nextInt();
        long[][] td=new long[n][2];
        for(int i=0;i<n;i++) for(int j=0;j<2;j++) td[i][j]=fsc.nextLong();
        fsc.close();
        Arrays.sort(td, (u,v)->u[1]<v[1]?1:u[1]>v[1]?-1:0);
        long val=0;
        HashSet<Integer> sushi=new HashSet<>();
        ArrayDeque<Long> dq=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            val+=td[i][1];
            int kind=(int) td[i][0];
            if(sushi.contains(kind)) dq.add(td[i][1]);
            sushi.add(kind);
        }
        long num=sushi.size();
        val+=num*num;
        long max=val;
        for(int i=k;i<n;i++){
            if(dq.size()==0) break;
            int kind=(int) td[i][0];
            if(!sushi.contains(kind)){
                sushi.add(kind);
                val=val-dq.removeLast()+td[i][1]+2*num+1;
                num++;
                max=Math.max(max, val);
            }
        }
        System.out.println(max);
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