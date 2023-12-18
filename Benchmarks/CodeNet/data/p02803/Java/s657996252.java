
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int h = fs.nextInt();
        int w = fs.nextInt();
        char[][] s = new char[h][w];
        for(int i=0;i<h;i++){
            s[i] = fs.next().toCharArray();
        }
        int[][] cost = new int[h*w][h*w];
        int inf = 10000000;
        for(int i=0;i<h*w;i++){
            for(int j=0;j<h*w;j++){
                cost[i][j] = inf;
            }
            cost[i][i] = 0;
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(j+1 < w && s[i][j]=='.' && s[i][j+1]=='.'){
                    cost[i*w+j][i*w+j+1] = 1;
                    cost[i*w+j+1][i*w+j] = 1;
                }
                if(i+1 < h && s[i][j]=='.' && s[i+1][j]=='.'){
                    cost[i*w+j][i*w+w+j] = 1;
                    cost[i*w+w+j][i*w+j] = 1;
                }
            }
        }
        int v = h*w;
        for(int k=0;k<v;k++){
            for(int i=0;i<v;i++){
                for(int j=0;j<v;j++){
                    cost[i][j] = Math.min(cost[i][j],cost[i][k]+cost[k][j]);
                }
            }
        }
        int max = 0;
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(cost[i][j] < inf){
                    max = Math.max(max,cost[i][j]);
                }
            }
        }
        System.out.println(max);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
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
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}