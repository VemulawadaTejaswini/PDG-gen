import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        FastScanner scan = new FastScanner();
        int n = Integer.parseInt(scan.next());
        List<String> strList = new ArrayList<>();
        for (int i=1; i<= n; i++) {
            strList.add(scan.next());
        }

        int count = 0;
        int i = 1;
        for (int y =0; y < strList.size(); y++) {
            i = y + 1;
            for (; i < strList.size(); i++) {
                if (permutation_2(strList.get(y),strList.get(i))) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
    static boolean permutation_2(String s,String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] letters = new int[256]; //文字コードの仮定;

        char[] s_array = s.toCharArray();
        for(char c:s_array){
            letters[c]++;
        }

        for(int i=0;i<t.length();i++){
            int c = (int)t.charAt(i);
            if(--letters[c] < 0){
                return false;
            }
        }
        return true;
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
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

}