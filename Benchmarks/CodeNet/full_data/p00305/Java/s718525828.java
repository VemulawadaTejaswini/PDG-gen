import java.io.*;
import java.util.*;
public class Main {
   public static void main(String[] args) {
       FastScanner sc = new FastScanner();
       int N = sc.nextInt();
       int[][] p = new int[N][N];
       for(int i = 0; i < N; i++) {
    	   for(int j = 0; j < N; j++) {
    		   p[i][j] = sc.nextInt();
    	   }
       }
       int[][] sum = new int[N+1][N+1];
       for(int i = 1; i <= N; i++) {
    	   for(int j = 0; j < N; j++) {
    		   sum[i][j + 1] += sum[i][j] + p[i-1][j];
    	   }
       }
       for(int i = 0; i <= N; i++) {
    	   for(int j = 0; j < N; j++) {
    		   sum[j + 1][i] += sum[j][i];
    	   }
       }
       
       int max = p[0][0];
       for(int i = 0; i < N; i++) {
    	   for(int j = 0; j < N; j++) {
    		   for(int k = i + 2; k <= N; k++) {
    			   int l = j + 2;
    			   for(l = j + 2; l + 3 <= N; l += 4) {
    				   int sumA = sum[k][l] + sum[i][j] - sum[k][j] - sum[i][l];
    				   int sumB = sum[k-1][l-1] + sum[i+1][j+1] - sum[k-1][j+1] - sum[i+1][l-1];
    				   max = Math.max(max, sumA - sumB);
    				   sumA = sum[k][l+1] + sum[i][j] - sum[k][j] - sum[i][l+1];
    				   sumB = sum[k-1][l] + sum[i+1][j+1] - sum[k-1][j+1] - sum[i+1][l];
    				   max = Math.max(max, sumA - sumB);
    				   sumA = sum[k][l+2] + sum[i][j] - sum[k][j] - sum[i][l+2];
    				   sumB = sum[k-1][l+1] + sum[i+1][j+1] - sum[k-1][j+1] - sum[i+1][l+1];
    				   max = Math.max(max, sumA - sumB);
    				   sumA = sum[k][l+3] + sum[i][j] - sum[k][j] - sum[i][l+3];
    				   sumB = sum[k-1][l+2] + sum[i+1][j+1] - sum[k-1][j+1] - sum[i+1][l+2];
    				   max = Math.max(max, sumA - sumB);
    			   }
    			   for(; l <= N; l++) {
    				   int sumA = sum[k][l] + sum[i][j] - sum[k][j] - sum[i][l];
    				   int sumB = sum[k-1][l-1] + sum[i+1][j+1] - sum[k-1][j+1] - sum[i+1][l-1];
    				   max = Math.max(max, sumA - sumB);
    			   }
    		   }
    	   }
       }
       System.out.println(max);
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
    public int nextInt() {
        if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
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