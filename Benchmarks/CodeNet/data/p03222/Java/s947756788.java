import java.util.*;
import java.io.*;

public class Main{
    static final long MOD=1000000007;
    static int w, h;
    static int combination[];
    static long dp[][];
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        h=fsc.nextInt();
        w=fsc.nextInt();
        int k=fsc.nextInt()-1;
        fsc.close();
        if(w==1){
            System.out.println(1);
            System.exit(0);
        }
        combination=new int[w];
        for(int i=0;i<w;i++){
            combination[i]=0;
            for(int j=0;j<w;j++){
                combination[i]+=comb(i-j+1, j);
            }
        }
        dp=new long[h+1][w];
        for(int i=0;i<=h;i++){
            for(int j=0;j<w;j++){
                if(i==0) dp[i][j]=j==0?1:0;
                else{
                    if(0<j && j<w-1) dp[i][j]=dp[i-1][j]*combination[j-1]*combination[w-j-2]+dp[i-1][j-1]*combination[Math.max(0,j-2)]*combination[w-j-2]+dp[i-1][j+1]*combination[j-1]*combination[Math.max(0,w-j-3)];
                    else if(j==0) dp[i][j]=dp[i-1][j]*combination[w-j-2]+dp[i-1][j+1]*combination[Math.max(0,w-j-3)];
                    else dp[i][j]=dp[i-1][j]*combination[j-1]+dp[i-1][j-1]*combination[Math.max(0,j-2)];
                    dp[i][j]%=MOD;
                }
            }
        }
        System.out.println(dp[h][k]);












        // boolean[][] bs=sel(w-1);
        // for(int t=0;t<h+1;t++){
        //     if(t==0){
        //         for(int i=0;i<w;i++){
        //             if(i==0) dp[t][i]=1;
        //             else dp[t][i]=0;
        //         }
        //         continue;
        //     }
        //     for(boolean[] b:bs){
        //         for(int s=0;s<b.length;s++){
        //             //System.out.print(b[s]);
        //             if(b[s]){
        //                 dp[t][s]+=dp[t-1][s+1];
        //                 dp[t][s+1]+=dp[t-1][s];
        //                 dp[t][s]%=MOD;
        //                 dp[t][s+1]%=MOD;
        //             }
        //             else{
        //                 if(s==0){
        //                     dp[t][0]+=dp[t-1][0];
        //                     dp[t][0]%=MOD;
        //                 }
        //                 else if(s==w-2){
        //                     dp[t][w-1]+=dp[t-1][w-1];
        //                     dp[t][w-1]%=MOD;
        //                 }
        //                 else if(!b[s+1]){
        //                     dp[t][s+1]+=dp[t-1][s+1];
        //                     dp[t][s+1]%=MOD;
        //                 }
        //             }
        //         }
        //         //System.out.print("\n");
        //     }
        // }
        // System.out.println(dp[h][k-1]);
    }
    static boolean[][] sel(int w){
        boolean b[][]=new boolean[combination[w]][w];
        if(w==1){
            b[0][0]=true;
            b[1][0]=false;
        }
        else if(w==2){
            b[0][0]=true; b[0][1]=false;
            b[1][0]=false; b[1][1]=true;
            b[2][0]=false; b[2][1]=false;
        }
        else{
            boolean tf[][]=sel(w-2);
            boolean f[][]=sel(w-1);
            int tfl=tf.length, fl=f.length;
            for(int i=0;i<tfl;i++){
                b[i][0]=true; b[i][1]=false;
                for(int j=2;j<w;j++) b[i][j]=tf[i][j-2];
            }
            for(int i=tfl;i<tfl+fl;i++){
                b[i][0]=false;
                for(int j=1;j<w;j++) b[i][j]=f[i-tfl][j-1];
            }
        }
        return b;
    }

    static long comb(int n, int r){
        if(n<r) return 0;
        r=Math.min(r, n-r);
        long res=1;
        for(int d=1;d<=r;d++){
            res*=n;
            n--;
            res/=d;
        }
        return res;
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