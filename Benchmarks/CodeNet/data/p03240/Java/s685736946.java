import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        for(int i=0;i<N;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        int cx = 0, cy = 0, H=0;

        int a=0;
        for(int i=0;i<N;i++){
            if(h[i]!=0){
                a = i;
                break;
            }
        }
        loop:for(int i=0;i<=100;i++){
            for(int j=0;j<=100;j++){
                H = h[a]-Math.abs(x[a]-i)-Math.abs(y[a]-j);
                for(int k=0;k<N;k++){
                    if(h[k]==H-Math.abs(x[k]-i)-Math.abs(y[k]-j) || h[k] == 0){
                        if(k==N-1){
                            cx = i;
                            cy = j;
                            break loop;
                        }
                    }
                    else{
                        break;
                    }
                }
            }
        }

        out.print(cx);
        out.print(" ");
        out.print(cy);
        out.print(" ");
        out.print(H);


        // out.println(result);

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
