import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    public  static void main(String[] args) {
        FastScanner sc = new FastScanner();

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        long num1;
        long num2;
        long max = 0;
        long sum = 0;

        num1 = (A * 1) / B;
    	num2 = A * (1 / B);
    	sum = num1 - num2;

        for(int i = 2; i <= N; i++) {
        	num1 = (A * i) / B;
        	num2 = A * (i / B);
        	sum = num1 - num2;
        	if(max < sum) {
        		max = sum;
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
}