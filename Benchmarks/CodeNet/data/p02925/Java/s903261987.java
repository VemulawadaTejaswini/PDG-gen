
import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[][] a = new int[n][n-1];
        Set<Integer> today = new HashSet<>();;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++)a[i][j] = fs.nextInt()-1;
            today.add(i);
        }

        int[] nxt = new int[n];
        Set<Integer> tomorrow = new HashSet<>();
        int dates = 0;
        while(today.size() > 0){
            for(Integer i: today){
                if(nxt[i] == n-1 || tomorrow.contains(i)){
                    continue;
                }
                int to = a[i][nxt[i]];
                if(nxt[to] == n-1 || tomorrow.contains(to)){
                   continue;
                }
                int from = a[to][nxt[to]];
                if(from == i){
                    nxt[i]++;
                    nxt[to]++;
                    if(nxt[i] < n-1)tomorrow.add(i);
                    
                    if(nxt[to] < n-1)tomorrow.add(to);
                }
            }
            Set<Integer> tmp = today;
            today = tomorrow;
            tomorrow = tmp;
            tomorrow.clear();
            dates++;
        }

        for(int i=0;i<n;i++){
            if(nxt[i]!=n-1){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(dates);

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