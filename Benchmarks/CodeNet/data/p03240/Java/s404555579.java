import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        List<Integer[]> values = new ArrayList<Integer[]>();
        for (int i = 0; i < N; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            values.add(new Integer[]{a, b, c});
        }
        int[] tmp = {0,0,0};
        for(Integer[] v : values){
            if (v[2] != 0){
                int i = 0;
                for(Integer p: v){
                    tmp[i] = p;
                    i++;
                }
                break;
            }
        }

        for (int cx = 0; cx < 101; cx++) {
            for (int cy = 0; cy < 101; cy++) {
                int h = Math.max(0, tmp[2] + Math.abs(tmp[0] - cx) + Math.abs(tmp[1]-cy));
                int f = 0;
                for(Integer[] v : values){
                    if (!(v[2] == Math.max(h-Math.abs(v[0]-cx) - Math.abs(v[1] - cy),0))){
                        f = 1;
                        break;
                    }
                }
                if (f == 0){
                    System.out.print(String.format("%d %d %d", cx, cy, h));
                    return;
                }
            }
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