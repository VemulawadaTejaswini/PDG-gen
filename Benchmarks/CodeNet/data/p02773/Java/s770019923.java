import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main {
    static int[] w = new int[100010];
    static int[] v = new int[100010];
    static private long MOD = 1000000007;

    static int calcNumOfCombination(int n, int r) {
        int num = 1;
        for (int i = 1; i <= r; i++) {
            num = num * (n - i + 1) / i;
        }
        return num;
    }

    static long lcm(long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return (long) (c / b);
    }

    static long f(long n, Map<Long, Long> map) {
        if (n < 2)
            return 1;
        else if (map.containsKey(n)) {
            return map.get(n);
        } else {
            map.put(n, n * f(n - 2, map));
            return map.get(n);
        }

    }

    static long factorialUsingRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String key = fs.next();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());

        // 3.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
        Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
            // compareを使用して値を比較する
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
                // 降順
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        int max = Integer.MIN_VALUE;
        for (Entry<String, Integer> entry : list_entries) {
            if (max == Integer.MIN_VALUE) {
                max = entry.getValue();
            }
            if(max!=entry.getValue()){
                return;
            }
            System.out.println(entry.getKey());
        }
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
