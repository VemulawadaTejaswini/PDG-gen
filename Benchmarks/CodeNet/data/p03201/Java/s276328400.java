import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            a.add(sc.nextInt());
        }

        int npow = 32;
        long[] pow2 = new long[npow];
        for(int i=0; i<pow2.length; i++){
            pow2[i] = (long)Math.pow(2, i);
        }

        Collections.sort(a);

        int ans = 0;
        out: for(int i=a.size()-1; i>=0; i--){
            int cur = a.get(i);
            if(i > 0){
                int cur2 = a.get(i-1);
                if(cur == cur2){
                    int curx2 = cur*2;
                    for(int j=0; j<npow; j++){
                        if(curx2 == pow2[j]){
                            ans++;
                            i--;
                            continue out;
                        }
                    }
                }
            }
            for(int j=0; j<npow; j++){
                if(cur >= pow2[j]) continue;
                int pos = Collections.binarySearch(a, (int)pow2[j]-cur, (ma, mb) -> Integer.compare(ma, mb));
                if(pos >= 0 && pos < i){
                    a.remove(i);
                    a.remove(pos);
                    i--;
                    ans++;
                    break;
                }
                break;
            }
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