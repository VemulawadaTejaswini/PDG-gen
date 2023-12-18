import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }

        double[] data  = new double[1010];
        data[0] = 0;
        double sum = 0;
        for (int i = 1; i < data.length; i++) {
            sum += i;
            data[i] = sum / i;
        }

        double max = 0;
        double sum2 = 0;
        for (int i = 0; i < k; i++) {
            sum2 += data[p[i]];
        }
        max = sum2;
        for (int i = k; i < n; i++) {
            sum2 += data[p[i]];
            sum2 -= data[p[i - k]];
            max = Math.max(max, sum2);
        }

        System.out.println(max);
    }

    private static class FastScanner {
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
}

class Card{
    int pos;
    boolean red;
    int ir;
    int ib;
    boolean re;

    Card(int pos, int ir, int ib){
        this(pos, true, ir, ib);
    }

    Card(int pos, boolean red, int ir, int ib){
        this.pos = pos;
        this.red = red;
        this.ir = ir;
        this.ib = ib;
        if(pos % 2 == 0){
            re = red;
        }else{
            re = !red;
        }
    }

    int getU(){
        if(red) return ir;
        else return ib;
    }

    int getD(){
        if(red) return ib;
        else return ir;
    }

    boolean exist(int cpos, boolean cred){
        if(cpos % 2 == 0){
            if(cred){
                return re;
            }else{
                return !re;
            }
        }else{
            if(cred){
                return !re;
            }else{
                return re;
            }
        }
    }

    Card copy(){
        return new Card(pos, red, ir, ib);
    }
}
