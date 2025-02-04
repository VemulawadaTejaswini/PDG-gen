import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

/**
 * @see <a href='http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?lang=jp&id='>??????</a>
 */
public class Main {
    private static FastReader in = new FastReader();

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.run();
    }

    private int[] preOrder, inOrder, postOrder;
    private int pos = 0, count = 0;

    private void run() {
        int n = in.nextInt();
        preOrder = in.nextIntArray(n);
        inOrder = in.nextIntArray(n);
        postOrder = new int[n];

        restore(0, n);
    }

    private void restore(int left, int right) {
        if (left >= right) return;
        int root = preOrder[pos++];
        int middle = 0;
        while (inOrder[middle] != root) {
            middle++;
        }
        restore(left, middle);
        restore(middle + 1, right);
        postOrder[count++] = root;
    }
}

class FastReader {
    private InputStream in = System.in;
    private byte[] buf = new byte[1024];
    private int charNum;
    private int charLen;
    private StringBuilder sb = new StringBuilder();

    public int read() {
        if (charLen == -1)
            throw new InputMismatchException();
        if (charNum >= charLen) {
            charNum = 0;
            try {
                charLen = in.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (charLen <= 0)
                return -1;
        }
        return buf[charNum++];
    }

    public String next() {
        int c = read();
        while (isWhitespace(c)) {
            c = read();
        }
        sb.setLength(0);
        do {
            sb.appendCodePoint(c);
            c = read();
        } while (!isWhitespace(c));
        return sb.toString();
    }

    public char[] nextCharArray() {
        return next().toCharArray();
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();
        return array;
    }

    public List<Integer> nextIntList(int n) {
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();
        return Arrays.asList(array);
    }

    public int[][] nextIntArray2D(int n, int m) {
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++)
            array[i] = nextIntArray(m);
        return array;
    }

    public List<int[]> nextIntsList(int n, int m) {
        List<int[]> list = new ArrayList<int[]>(n);
        for (int i = 0; i < n; i++)
            list.add(nextIntArray(m));
        return list;
    }

    public long nextLong() {
        int c = read();
        while (isWhitespace(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isWhitespace(c));
        return res * sgn;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();
        return array;
    }

    public boolean isWhitespace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
}