import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        int h = fs.nextInt();
        int w = fs.nextInt();
        char[][] map = new char[h][w];
        int[][] cost = new int[h][w];
        int inf = 10000000;
        for(int i=0;i<h;i++){
            map[i] = fs.next().toCharArray();
            for(int j=0;j<w;j++){
                cost[i][j] = inf;
            }
        }
        if(map[0][0]=='.'){
            cost[0][0] = 0;
        }else{
            cost[0][0] = 1;
        }

        Queue<int[]> queue = new ArrayDeque<>();
        int[][] vec = {{1,0},{0,1}};
        queue.add(new int[]{0,0,cost[0][0]});
        queue.isEmpty();
        while(queue.size() > 0){
            int[] p = queue.poll();
            int y = p[0];
            int x = p[1];
            int c = p[2];
            char ch = map[y][x];
            for(int i=0;i<2;i++){
                int toY = y + vec[i][0];
                int toX = x + vec[i][1];
                if(toY < h && toX < w){
                    if(map[toY][toX]==ch && c < cost[toY][toX]){
                        cost[toY][toX] = c;
                        queue.add(new int[]{toY,toX,c});
                    }else if(map[toY][toX]!=ch){
                        if(ch=='#' && c < cost[toY][toX]){
                            cost[toY][toX] = c;
                            queue.add(new int[]{toY,toX,c});
                        }else if(ch=='.' && c+1 < cost[toY][toX]){
                            cost[toY][toX] = c+1;
                            queue.add(new int[]{toY,toX,c+1});
                        }
                    }
                }
            }
        }

        System.out.println(cost[h-1][w-1]);
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