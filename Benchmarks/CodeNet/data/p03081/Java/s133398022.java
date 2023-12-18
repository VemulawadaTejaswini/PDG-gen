import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String... args) {
        // 入力
        FastScanner fc = new FastScanner();
        int n = (int)fc.nextLong();
        int q = (int)fc.nextLong();

        int[] gArr = new int[n];
        char[] qArr = fc.next().toCharArray();

        for (int i=0;i<n;i++) {
            gArr[i] = 1;
        }

        for (int i=0;i<q;i++) {
            char gc = fc.next().charAt(0);
            char qc = fc.next().charAt(0);

            if (qc == 'L') {
                for (int j=0;j<n;j++) {
                    if (qArr[j] == gc && gArr[j] != 0) {
                        if (j != 0) gArr[j-1]+=gArr[j];
                        gArr[j]=0;
                    }
                }
            } else if (qc == 'R') {
                for (int j=n-1;j>=0;j--) {
                    if (qArr[j] == gc && gArr[j] != 0) {
                        if (j != n-1) gArr[j+1]+=gArr[j];
                        gArr[j]=0;
                    }
                }
            }
        }

        int sum = 0;
        for (int i=0;i<n;i++) {
            sum += gArr[i];
        }
        System.out.println(sum);
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