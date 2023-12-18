import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] combination = new int[N][];

        combination[0] = new int[1];
        combination[0][0] = 1;

        combination[1] = new int[2];
        combination[1][0] = 1;
        combination[1][1] = 1;

        for (int i = 2; i< N ; i++ ){
            combination[i] = new int[i+1];
            combination[i][0] = 1;
            combination[i][i] = 1;
            for (int j=1; j<i; j++) {
                combination[i][j] = combination[i-1][j-1] + combination[i-1][j];
            }
            out.println(Arrays.toString(combination[i]));
        }

        int mod = 1000000007;
        long[] A = new long[K];
        A[0] = (N - K + 1) % mod;
        sb.append(A[0]);
        sb.append("\n");
        for (int i=2; i<=K; i++) {
//            int Y = ((K - i  + 1) * (N - K - i + 2) / ((i - 1) * i)) % mod;
            A[i-1] = (combination[N-K+1][i] % mod) * (combination[K-1][i-1] % mod) % mod;
            sb.append(A[i-1]);
            sb.append("\n");
        }
        out.println(sb.toString());
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