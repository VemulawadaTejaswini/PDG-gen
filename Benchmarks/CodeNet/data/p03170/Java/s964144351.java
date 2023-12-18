import java.util.*;
import java.io.*;

class Main{
    static int[] a;
    static int n,k;
    static int[][] judge;//1なら先手の勝ち,0なら後手の勝ち
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        n = fs.nextInt();
        k = fs.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++)a[i] = fs.nextInt();
        judge = new int[k+1][2];
        for(int i=0;i<=k;i++){
            judge[i][0] = judge[i][1] = -1;
        }
        for(int i=0;i<a[0];i++){
            judge[i][0] = 0;
            judge[i][1] = 1;
        }
        
        if(dfs(k,0)==1){
           System.out.println("First");
        }else{
           System.out.println("Second");
        }
    }

    public static int dfs(int val,int turn){
        if(judge[val][turn]!=-1){
            return judge[val][turn];
        }else{
            if(turn==0){
                int win = 0;
                for(int i=0;i<n;i++){
                    if(val-a[i]>=0 && win==0){
                        win = Math.max(win,dfs(val-a[i],1-turn));
                    }else
                    break;
                }
                return judge[val][turn] = win;
            }else{
                int win = 1;
                for(int i=0;i<n;i++){
                    if(val-a[i]>=0 && win==1){
                        win = Math.min(win,dfs(val-a[i],1-turn));
                    }else
                    break;
                }
                return judge[val][turn] = win;
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