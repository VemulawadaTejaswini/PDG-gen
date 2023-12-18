import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int W = fs.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for(int i=0;i<n;i++){
            w[i] = fs.nextInt();
            v[i] = fs.nextInt();
        }
        long[][] dp = new long[n+1][W+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=W;j++){
                if(j-w[i]>=0){
                    dp[i+1][j] = Math.max(dp[i][j],dp[i][j-w[i]]+v[i]);
                }else{
                    dp[i+1][j] = dp[i][j];
                }
            }
        }
        System.out.println(dp[n][W]);
    }
    static class FastScanner{
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte(){
            if(ptr < buflen){
                return true;
            }else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen <= 0){
                    return false;
                }
            }
            return true;
        }

        private int readByte(){
            if(hasNextByte())return buffer[ptr++];
            else return -1;
        }

        private boolean isPrintableChar(int c){
            return 33<=c && c<=126;
        }

        public boolean hasNext(){
            while(hasNextByte() && !isPrintableChar(buffer[ptr]))ptr++;
            return hasNextByte();
        }

        public String next(){
            if(!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)){
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong(){
            if(!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if(b == '-'){
                minus = true;
                b = readByte();
            }
            if(b < '0' || '9' < b){
                throw new NumberFormatException();
            }
            while(true){
                if('0' <= b && b<='9'){
                    n*=10;
                    n+=b-'0';
                }else if(b==-1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
        public int nextInt(){
            long nl = nextLong();
            if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)throw new NumberFormatException();
            return (int)nl;
        }
        public double nextDouble(){return Double.parseDouble(next());}
    }
}