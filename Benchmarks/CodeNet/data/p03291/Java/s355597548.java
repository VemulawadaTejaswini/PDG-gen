import java.util.*;
import java.io.*;

public class Main{
    static final long MOD=1000000007;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        String s=fsc.next();
        fsc.close();
        char[] chs=s.toCharArray();
        int l=chs.length;
        int q=0;
        int[][] accum=new int[l][4];
        long[] selA=new long[l];
        long[] selC=new long[l];
        for(int i=0;i<l;i++){
            if(i==0){
                for(int j=0;j<4;j++) accum[i][j]=0;
                if(chs[i]=='?') accum[i][3]=1;
                else if(chs[i]=='A') accum[i][0]=1;
                else if(chs[i]=='B') accum[i][1]=1;
                else if(chs[i]=='C') accum[i][2]=1;
            }
            else{
                for(int j=0;j<4;j++) accum[i][j]=accum[i-1][j];
                if(chs[i]=='?') accum[i][3]+=1;
                else if(chs[i]=='A') accum[i][0]+=1;
                else if(chs[i]=='B') accum[i][1]+=1;
                else if(chs[i]=='C') accum[i][2]+=1;
            }
        }
        q=accum[l-1][3];
        long pow3[]=new long[q+1];
        for(int r=0;r<=q;r++){
            if(r==0) pow3[r]=1;
            else if(r==1) pow3[r]=3;
            else pow3[r]=(pow3[r/2]*pow3[r-r/2])%MOD;
        }
        for(int i=0;i<l;i++){
            if(i==0){
                if(chs[i]=='A'||chs[i]=='?') selA[i]=1;
                else selA[i]=0;
            }
            else{
                if(chs[i]=='A') selA[i]=selA[i-1]+pow3[accum[i-1][3]];
                else if(chs[i]=='?') selA[i]=3*selA[i-1]+pow3[accum[i-1][3]];
                else selA[i]=selA[i-1];
                selA[i]%=MOD;
            }
        }
        for(int i=l-1;i>=0;i--){
            if(i==l-1){
                if(chs[i]=='C'||chs[i]=='?') selC[i]=1;
                else selC[i]=0;
            }
            else{
                if(chs[i]=='C') selC[i]=selC[i+1]+pow3[accum[l-1][3]-accum[i][3]];
                else if(chs[i]=='?') selC[i]=3*selC[i+1]+pow3[accum[l-1][3]-accum[i][3]];
                else selC[i]=selC[i+1];
                selC[i]%=MOD;
            }
        }
        long ans=0;
        for(int i=1;i<l-1;i++){
            if(chs[i]!='B'&&chs[i]!='?') continue;
            if(chs[i]=='B'||chs[i]=='?') ans=(ans+(selA[i-1]*selC[i+1])%MOD)%MOD;
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