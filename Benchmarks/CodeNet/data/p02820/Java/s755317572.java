import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int k=fsc.nextInt();
        int r=fsc.nextInt();
        int s=fsc.nextInt();
        int p=fsc.nextInt();
        char[] t=fsc.next().toCharArray();
        fsc.close();
        char[] st=new char[n];
        long score=0;
        for(int i=0;i<k;i++){
            boolean rr=false;
            boolean ss=false;
            boolean pp=false;
            for(int j=i;j<n;j+=k){
                if(j==i){
                    if(t[j]=='r'){
                        score+=p;
                        rr=true;
                    } else if(t[j]=='s'){
                        score+=r;
                        ss=true;
                    } else{
                        score+=s;
                        pp=true;
                    }
                }
                else{
                    if(t[j]=='r'){
                        if(rr){
                            rr=false;
                            ss=false;
                            pp=false;
                        } else{
                            score+=p;
                            rr=true;
                            ss=false;
                            pp=false;
                        }
                    } else if(t[j]=='s'){
                        if(ss){
                            rr=false;
                            ss=false;
                            pp=false;
                        } else{
                            score+=r;
                            ss=true;
                            rr=false;
                            pp=false;
                        }
                    } else{
                        if(pp){
                            rr=false;
                            ss=false;
                            pp=false;
                        } else{
                            score+=s;
                            pp=true;
                            rr=false;
                            ss=false;
                        }
                    }
                }
            }
        }
        System.out.println(score);
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
