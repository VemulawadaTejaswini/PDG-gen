import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int[][] A = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        boolean[][] table = new boolean[3][3];
        for(int k=0;k<n;k++){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(b[k]==A[i][j]) table[i][j] = true;
                }
            }
        }
        boolean p = true, q = true, d = true;
        for(int i=0;i<3;i++){
            p = true; q = true;
            for(int j=0;j<3;j++){
                if(!table[i][j]) p = false;
                if(!table[j][i]) q = false;
            }
            if(p||q){
                out.println("Yes");
                out.flush();
                return;
            }
        }
        if(!((table[0][0]&&table[1][1]&&table[2][2]) || (table[0][2]&&table[1][1]&&table[2][0]))) d=false;

        if(d) out.println("Yes");
        else out.println("No");

        // out.println(res);
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
