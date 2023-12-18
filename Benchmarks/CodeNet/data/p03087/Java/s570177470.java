import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String S = sc.next();
        int[] l = new int[q], r = new int[q];
        for(int i=0;i<q;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int[] s = new int[n+1];
        for(int i=1;i<n;i++){
            if(S.charAt(i-1)=='A'&&S.charAt(i)=='C'){
                s[i+1] = s[i] +1;
            }
            else{
                s[i+1] = s[i];
            }
        }
        for(int i=0;i<q;i++){
            out.println(s[r[i]]-s[l[i]]);
        }

        out.flush();
    }

    public static long repeatSquarePow(int a, int n, int p){
        if(n==1) return a % p;
        if(n%2==1) return a * repeatSquarePow(a,n-1,p) % p;
        long tmp = repeatSquarePow(a, n/2, p) % p;
        return tmp*tmp % p;
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