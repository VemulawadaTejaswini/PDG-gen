import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        char[] c=fsc.next().toCharArray();
        fsc.close();
        int l=c.length;
        int height=0;
        int v=1;
        int vb=0;
        int prem=0, nowm;
        boolean up, down;
        if(c[0]=='<'){
            up=true; down=false;
        }
        else{
            up=false; down=true;
            prem=Integer.MAX_VALUE;
        }
        long ans=0;
        for(int i=0;i<l;i++){
            if(c[i]=='<'){
                if(down){
                    vb=height;
                    nowm=-vb;
                    if(nowm>prem) ans+=nowm-prem;
                }
                height++;
                v++;
                up=true;
                down=false;
            }
            else{
                if(up){
                    prem=height-vb;
                    ans-=vb*v;
                    height=-1;
                    v=1;
                }
                else{
                    v++;
                    height--;
                }
                up=false;
                down=true;
            }
            ans+=height;
            //System.out.println(height+" "+v+" "+vb+" "+ans);
        }
        if(down){
            vb=height;
            ans-=vb*v;
            nowm=-vb;
            if(nowm>prem) ans+=nowm-prem;

        }
        if(up) ans-=vb*v;
        System.out.println(ans);
    }
    static class FastScanner{
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