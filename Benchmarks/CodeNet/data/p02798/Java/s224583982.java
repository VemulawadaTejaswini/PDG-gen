import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        Card[] a = new Card[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Card(i, sc.nextInt(), 0);
        }
        for (int i = 0; i < n; i++) {
            a[i].ib = sc.nextInt();
        }

        int ans = 1000000000;

        out: for (int i = 0; i < 2 << n; i++) {
            String s = "0000000000000000000" + Integer.toBinaryString(i);

            int numt = 0;
            for (int j = 0; j < n; j++) {
                if(s.charAt(s.length() - j - 1) == '1') numt++;
            }
            if(numt % 2 == 1) continue;

            Card[] ma = new Card[n];
            for (int j = 0; j < ma.length; j++) {
                ma[j] = a[j].copy();
                ma[j].red = s.charAt(s.length() - j - 1) == '0';
            }

            int mans = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n-1; k++) {
                    if(ma[k].getU() > ma[k+1].getU()){
                        swap(ma, k);
                        mans++;
                    }
                }
            }

            boolean[] check = new boolean[n];
            for (int j = 0; j < n-1; j++) {
                int mnum = 0;
                for (int j2 = j; j2 < n; j2++) {
                    if(ma[j].getU() == ma[j2].getU()){
                        mnum++;
                    }
                }

                if(mnum >= 2){
                    for (int k = j; k < j+mnum; k++) {
                        if(!check(ma, k)){
                            int epos = k-1;
                            for (int k2 = k+1; k2 < j+mnum; k2++) {
                                if(check(ma, k2)){
                                    epos = k2;
                                    break;
                                }
                            }
                            if(epos < k) continue out;
                            for (int l = epos-1; l >= k; l--) {
                                swap(ma, l);
                                mans++;
                            }
                        }
                    }
                }
            }

            for (int j = 0; j < n; j++) {
                if(!check(ma, j)) continue out;
            }

            ans = Math.min(ans, mans);
        }

        if( ans == 1000000000) System.out.println(-1);
        else System.out.println(ans);
    }

    static boolean check(Card[] cards, int pos){
        return ((pos % 2 == 0 && cards[pos].red == cards[pos].re) || pos % 2 == 1 && cards[pos].red != cards[pos].re);
    }

    static void swap(Card[] cards, int pos){
        Card tmp = cards[pos+1];
        cards[pos+1] = cards[pos];
        cards[pos] = tmp;
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
