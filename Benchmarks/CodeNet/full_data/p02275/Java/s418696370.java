import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

    static FastScanner sc = new FastScanner();
    static final int MAX_A = 10000 + 10;
    static int N;
    static int[] A;
    static int[] B;

    public static void main(String[] args) {
        read();
        CountingSort(A, B);
        String ans = "";
        for (int i = 0; i < N; i++) {
            ans += String.format("%d ", B[i]);
        }
        System.out.println(ans);
    }

    static void CountingSort(int[] A, int[] B) {
        int[] C = new int[MAX_A];

        for (int i = 0; i < N; i++) {
            C[A[i]]++;
        }

        for (int i = 1; i < MAX_A; i++) {
            C[i] += C[i - 1];
        }

        for (int i = N - 1; i >= 0; i--) {
            C[A[i]]--;
            B[C[A[i]]] = A[i];
        }
    }

    static void read() {
        N = Integer.parseInt(sc.next());
        A = new int[N + 10];
        B = new int[N + 10];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
}