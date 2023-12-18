
import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        int h = fs.nextInt();
        int w = fs.nextInt();
        int[][] a = new int[h][w];
        int[][] b = new int[h][w];
        for(int i=0;i<h;i++)for(int j=0;j<w;j++)a[i][j] = fs.nextInt();
        for(int i=0;i<h;i++)for(int j=0;j<w;j++)b[i][j] = fs.nextInt();

        int max = 10000;
        boolean[][][] dp = new boolean[h][w][max];
        dp[0][0][Math.abs(a[0][0]-b[0][0])] = true;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                for(int k=0;k<max;k++){
                    if(dp[i][j][k]){
                        if(i+1< h){
                            int favor = k + Math.abs(a[i+1][j]-b[i+1][j]);
                            dp[i+1][j][favor] = true;
                            favor = Math.abs(k-Math.abs(a[i+1][j]-b[i+1][j]));
                            dp[i+1][j][favor] = true;
                        }
                        if(j+1 < w){
                            int favor = k + Math.abs(a[i][j+1]-b[i][j+1]);
                            dp[i][j+1][favor] = true;
                            favor = Math.abs(k-Math.abs(a[i][j+1]-b[i][j+1]));
                            dp[i][j+1][favor] = true;
                        }
                    }
                }
            }
        }
        for(int k=0;k<max;k++){
            if(dp[h-1][w-1][k]){
                System.out.println(k);
                return;
            }
        }

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