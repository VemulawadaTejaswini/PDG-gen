import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        List<Integer> mod13 = new ArrayList<>();
        int tmp = 1;
        do{
            mod13.add(tmp);
            tmp = (tmp*10)%13;
        }while(tmp!=1);
        char[] s = fs.next().toCharArray();
        int n = mod13.size();
        int len = s.length;
        long[][] dp = new long[len+1][13];
        int mod = 1000000007;
        dp[0][0] = 1;
        int digitMod;
        for(int i=0;i<len;i++){
            digitMod = mod13.get(i%n);
            if(s[len-1-i]=='?'){
                for(int k=0;k<10;k++){
                    int digit = digitMod*k%13;
                    for(int j=0;j<13;j++){
                        dp[i+1][j] +=dp[i][(j+13-digit)%13];
                        dp[i+1][j]%=mod;
                    }

                }
                
            }else{
                int digit = s[len-1-i]-'0';
                digit = digit*digitMod%13;
                for(int j=0;j<13;j++){
                    dp[i+1][j] +=dp[i][(j+13-digit)%13];
                    dp[i+1][j]%=mod;
                }
            }
        }
        System.out.println(dp[len][5]);

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