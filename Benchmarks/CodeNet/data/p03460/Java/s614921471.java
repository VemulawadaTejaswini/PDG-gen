import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] white = new int[2*K][2*K];
        int[][] black = new int[2*K][2*K];
        for(int i=0;i<N;i++){
            int x = sc.nextInt() % (2*K);
            int y = sc.nextInt() % (2*K);
            if(sc.next().charAt(0) == 'B') black[x][y]++;
            else white[x][y]++;
        }

        int[][] w = new int[K][K];
        int[][] b = new int[K][K];
        for(int i=0;i<2*K;i++){
            for(int j=0;j<2*K;j++){
                if((i%K<K && j%K<K) || (i%K>=K && j%K>= K)){
                    w[i%K][j%K] += white[i][j];
                    b[i%K][j%K] += black[i][j];
                }
                else{
                    w[i%K][j%K] += black[i][j];
                    b[i%K][j%K] += white[i][j];
                }
            }
        }
        int[][] white_sum = new int[K][K], black_sum = new int[K][K];
        for(int i=0;i<K;i++){
            white_sum[i][0] = w[i][0];
            black_sum[i][0] = b[i][0];
            for(int j=1;j<K;j++){
                white_sum[i][j] = white_sum[i][j-1] + w[i][j];
                black_sum[i][j] = black_sum[i][j-1] + b[i][j];
            }
        }
        int[][] white_x = new int[K+1][K], black_x = new int[K+1][K];
        for(int i=0;i<K;i++){
            white_x[0][i] = black_sum[i][K-1];
            black_sum[0][i] = white_sum[i][K-1];
        }
        for(int t=1;t<=K;t++){
            for(int i=0;i<K;i++){
                white_x[t][i] = white_sum[i][t-1] + (black_sum[i][K-1] - black_sum[i][t-1]);
                black_x[t][i] = black_sum[i][t-1] + (white_sum[i][K-1] - white_sum[i][t-1]);
            }
        }

        int[][] white_x_sum = new int[K+1][K], black_x_sum = new int[K+1][K];
        for(int t=0;t<=K;t++){
            white_x_sum[t][0] = white_x[t][0];
            black_x_sum[t][0] = black_x[t][0];
            for(int i=1;i<K;i++){
                white_x_sum[t][i] = white_x_sum[t][i-1]+white_x[t][i];
                black_x_sum[t][i] = black_x_sum[t][i-1]+black_x[t][i];
            }
        }
        int[][] white_f = new int[K+1][K+1], black_f = new int[K+1][K+1];
        for(int t=0;t<=K;t++){
            white_f[t][0] = black_x_sum[t][K-1];
            black_f[t][0] = white_x_sum[t][K-1];
            for(int s=1;s<=K;s++){
                white_f[t][s] = white_x_sum[t][s-1] + (black_x_sum[t][K-1]-black_x_sum[t][s-1]);
                black_f[t][s] = black_x_sum[t][s-1] + (white_x_sum[t][K-1]-white_x_sum[t][s-1]);
            }
        }
        int res = 0;
        for(int i=0;i<=K;i++){
            for(int j=0;j<=K;j++){
                res = Math.max(res, Math.max(white_f[i][j], black_f[i][j]));
            }
        }
        out.println(res);

        out.flush();
    }

}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
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
    public double nextDouble() { return Double.parseDouble(next());}
}