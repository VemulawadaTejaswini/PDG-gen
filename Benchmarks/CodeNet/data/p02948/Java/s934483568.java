import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int M = sc.nextInt();
        TreeMap<Integer, TreeMap<Integer, Integer>> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            Integer A = sc.nextInt();
            Integer B = sc.nextInt();
            if (map.containsKey(B)) {
                TreeMap<Integer, Integer> map2 = map.get(B);
                if (map2.containsKey(A)) {
                    map2.put(A, map2.get(A)+1);
                } else {
                    map2.put(A, 1);
                }
                map.put(B, map2);
            } else {
                TreeMap<Integer, Integer> map2 = new TreeMap<>();
                map2.put(A, 1);
                map.put(B, map2);
            }
        }
        int money = 0;
        Integer max = map.lastKey() + 1;
        outside: for (int i = M; i > 0; i--) {
            while (true) {
                Map.Entry entry = map.lowerEntry(max);
                if(entry == null) {
                    break outside;
                }
                Integer map1Key = (Integer)entry.getKey();
                TreeMap<Integer, Integer> map2 = (TreeMap)entry.getValue();
                Map.Entry entry2 = map2.floorEntry(i);
                if(entry2 == null) {
                    max = (Integer) entry.getKey();
                    continue;
                }
                Integer key = (Integer) entry2.getKey();
                Integer val = (Integer) entry2.getValue();
                money += map1Key;
                if (val > 1) {
                    map2.put(key, val-1);
                } else {
                    map2.remove(key);
                    if(map2.size() == 0) {
                        map.remove(map1Key);
                    }
                }
                break;
            }
        }

        out.println(money);
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