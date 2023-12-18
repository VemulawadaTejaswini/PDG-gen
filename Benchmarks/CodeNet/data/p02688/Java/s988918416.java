import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public  static void main(String[] args) {
        FastScanner sc = new FastScanner();

        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        List<Integer> a = new ArrayList<Integer>();
        int num;
        int num2;

        for(int i = 1; i <= K; i ++) {
        	num = Integer.parseInt(sc.next());
        	for(int j = 0; j < num; j++) {
        		num2 = Integer.parseInt(sc.next());
        		if(!a.contains(num2)) {
        			a.add(num2);
        		}
        	}
        }
        System.out.print(N - a.size());
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