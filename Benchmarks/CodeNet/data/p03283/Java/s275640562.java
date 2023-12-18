import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int m=fsc.nextInt();
        int q=fsc.nextInt();
        int[][] lr=new int[m][2];
        int[][] accum=new int[n+1][n+1];
        for(int i=0;i<m;i++) accum[fsc.nextInt()][fsc.nextInt()]++;
        for(int x=1;x<=n;x++){
            for(int y=1;y<=n;y++) if(y!=1) accum[x][y]+=accum[x][y-1];
            if(x!=1) for(int y=1;y<=n;y++) accum[x][y]+=accum[x-1][y];
        }
        StringBuilder sb=new StringBuilder("");
        for(int k=1;k<=q;k++){
            int ql=fsc.nextInt();
            int qr=fsc.nextInt();
            if(ql>1) sb.append(accum[qr][qr]-accum[ql-1][qr]-accum[qr][ql-1]+accum[ql-1][ql-1]+"\n");
            else sb.append(accum[qr][qr]+"\n");
        }
        fsc.close();
        PrintWriter pw=new PrintWriter(System.out);
        pw.print(sb);
        pw.flush();
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