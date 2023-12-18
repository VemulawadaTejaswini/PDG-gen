import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
    public  static void main(String[] args) {
        FastScanner sc = new FastScanner();
         String text = sc.next();
         int a;
         int count = 0;
         if(4 <= text.length()) {
             for (int i = 0; i < text.length() - 3; i++) {
                 for (int j = i + 3; j < text.length(); j++) {
                     a = Integer.parseInt(text.substring(i, j));
                     if (a % 2019 == 0) {
                         count++;
                     }
                 }
             }
         }
         System.out.print(count);
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