import java.util.*;
import java.io.*;

public class Main {


    
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String s = sc.next();
        int[] count = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        
        char mchar = 'a';
        String scp = new String(s);

        int ans = 232131313;
        for(int kk = 0; kk < 26; kk++) {
            if(count[kk] == 0) continue;
            s = scp;
            mchar = (char)('a' + kk);
            int i;
            for(i = 0; ; ) {
                boolean same = true;
                for(int j = 0; j < s.length()-1; j++) {
                    if(s.charAt(j) != s.charAt(j + 1)) {
                        same = false;
                        break;
                    }
                }
                if(same) break;
                i++;
                String nextS = "";
                for(int j = 0; j < s.length()-1; j++) {
                    if(s.charAt(j) == mchar || s.charAt(j+1) == mchar) {
                        nextS += mchar;
                    } else {
                        nextS += s.charAt(j);
                    }
                }
                s = nextS;
            }
            ans = Math.min(ans, i);
        }


        System.out.println(ans);

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

