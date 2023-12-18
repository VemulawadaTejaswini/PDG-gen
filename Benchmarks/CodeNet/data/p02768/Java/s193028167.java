import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long res = 1;
        long mod = 1_000_000_007;
        int base = 2;
        int index = n;
        while(true){
            if(index%2==0) index /= 2;
            else{
                res *= 2 % mod;
                index /=2;
            }
            base *= base % mod;
            if(index == 1) break;
        }
        res *= base % mod;
        res-=MyMath.binomial(n, a) % mod;
        res-=MyMath.binomial(n, b) % mod;
        res-=1;
        if(res<0) res += mod;

        if((a==1&&b==2) || (a==2&&b==1)) {
            out.println('0');
            out.flush();
            return;
        }
        out.println(res);
        out.flush();
    }

}


class MyMath{
    public static long gcm(long a, long b){
        if(a<b) return gcm(b, a);

        if(a%b==0 || b==0) return b;

        long remainder = a%b;
        return gcm(b, remainder);
    }

    public static long summation(long a, long b){
        return b*(b+1)/2-a*(a-1)/2;
    }

    public static long factorial(long n){

        if(n<=1) return 1;
        else return factorial(n-1)*n;
    }

    public static long binomial(int a, int b){
        if(a<b) return 0;
        int[][] table = new int[a+1][a+1];
        for(int i=0;i<a+1;i++){
            table[0][a] =  0;
            table[i][0] = 1;
            table[i][i] = 1;
        }
        for(int i=1;i<a+1;i++){
            for(int j=1;j<a+1;j++){
                if(i<j) table[i][j] = 0;
                else{
                    table[i][j] = table[i-1][j-1] + table[i-1][j];
                    table[i][j] %= 1_000_000_007;
                }
            }
        }
        return table[a][b];

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