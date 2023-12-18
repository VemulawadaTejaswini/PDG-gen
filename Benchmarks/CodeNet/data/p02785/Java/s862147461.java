import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int k = fs.nextInt();
        Integer h[] = intArray(n, fs);

        System.out.println(attack(n, k, h));
    }

    public static long attack(int n, int k, Integer[] h) {
        if (n <= k)
            return 0;
        else {
            Arrays.sort(h, Comparator.reverseOrder());
            long ans = 0;
            for (int i = k; i < n; i++)
                ans += h[i];
            return ans;
        }
    }

    public static Integer[] intArray(int n, FastScanner fs) {
        Integer array[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = fs.nextInt();
        }
        return array;
    }

    public static long[] longArray(int n, FastScanner fs) {
        long array[] = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = fs.nextLong();
        }
        return array;
    }

    public static String[] stringArray(int n, FastScanner fs) {
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = fs.next();
        }
        return array;
    }

    public static void checkArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void checkArray(long[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void checkArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
        System.out.println(array[array.length - 1]);
    }

    public static void printArray(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
        System.out.println(array[array.length - 1]);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
        System.out.println(array[array.length - 1]);
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
