import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        String s = fs.next();
        int n = s.length();
        char[] t = fs.next().toCharArray();
        char[] tmp = (s+s).toCharArray();
        int[] charNow = new int[26];
        int[][] nextIdx = new int[n*2+1][26];

        for(int i=1;i<=tmp.length;i++){
            int now = tmp[i-1]-'a';

            for(int j=0;j<26;j++)nextIdx[i-1][j] = -1;

            for(int j=charNow[now];j<i;j++){
                nextIdx[j][now] = i;
            }
            charNow[now] = i;
        }
        long res = 0;
        int prev = 0;
        int nxt = 0;
        for(int i=0;i<t.length;i++){
            int now = t[i]-'a';
            nxt = nextIdx[prev][now];
            if(nxt!=-1){
                res+=nxt - prev;
                if(nxt > n)nxt-=n;
                prev = nxt;
            }else{
                System.out.println(-1);
                return;
            }
        }
        System.out.println(res);
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