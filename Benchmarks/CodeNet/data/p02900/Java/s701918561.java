import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int a = fs.nextInt();
        int b = fs.nextInt();
        ArrayList<Integer> pf = new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        pf.add(1);
        for(int i=2; i<=Math.sqrt(a); i++) {
            if(a%i == 0) {
                int cnt = 0;
                for(int j:pf) {
                    if (j != i) {
                        cnt++;
                    }
                }
                if(cnt == pf.size()) {
                    pf.add(i);
                }
            }
        }
        for(int i=2; i<=Math.sqrt(b); i++) {
            if(a%i == 0) {
                int cnt = 0;
                for(int j:pf) {
                    if (j != i) {
                        cnt++;
                    }
                }
                if(cnt == pf.size()) {
                    pf.add(i);
                }
            }
        }
        for(int i:pf) {
            if(Math.sqrt(i)<2) {
                ans.add(i);
            }else {
                int cnt = 0;
                for(int j=2; j<=Math.sqrt(i); j++) {
                    if(i%j != 0) cnt++;
                }    
                if(cnt == (int)Math.sqrt(i)-1) ans.add(i);
            }
        }
        int final_cnt = 0;
        for(int i:ans) {
            if(a%i==0 && b%i==0) {
                final_cnt++;
            }
        }
        System.out.println(final_cnt);
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
        } else {
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
 
    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }
 
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
 
    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }
 
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
 
    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
 
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
