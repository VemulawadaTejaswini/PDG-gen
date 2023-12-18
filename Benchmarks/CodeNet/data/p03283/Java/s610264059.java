import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int m=fsc.nextInt();
        int q=fsc.nextInt();
        int[][] lr=new int[m][2];
        int[][] contain=new int[n][n];
        for(int x=0;x<n;x++){
            for(int y=x;y<n;y++){
                contain[x][y]=0;
            }
        }
        for(int i=0;i<m;i++){
            lr[i][0]=fsc.nextInt()-1;
            lr[i][1]=fsc.nextInt()-1;
            for(int x=0;x<=lr[i][0];x++){
                for(int y=lr[i][1];y<n;y++){
                    contain[x][y]++;
                }
            }
        }
        StringBuilder sb=new StringBuilder("");
        for(int k=0;k<q;k++){
            int ql=fsc.nextInt()-1;
            int qr=fsc.nextInt()-1;
            sb.append(contain[ql][qr]+"\n");
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