import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @see <a href='http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?lang=jp&id='>??????</a>
 */
public class Main {
    private static FastReader in = new FastReader();

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.run();
    }

    private void run() {
        int n = in.nextInt();
        DoublyLinkedList first = null;
        DoublyLinkedList last = null;
        for (int i = 0; i < n; i++) {
            String command = in.next();
            if (command.equals("insert")) {
                DoublyLinkedList insert = new DoublyLinkedList(in.nextInt());
                if (first == null) {
                    first = insert;
                    last = insert;
                } else {
                    insert.next = first;
                    first.prev = insert;
                    first = insert;
                }
            }
            if (command.equals("delete")) {
                int delete = in.nextInt();
                DoublyLinkedList temp = first;
                while (temp != null && temp.value != delete) {
                    temp = temp.next;
                }
                if (temp == null) {
                    continue;
                }
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    first = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    last = temp.prev;
                }
            }
            if (command.equals("deleteFirst")) {
                if (first.next != null) {
                    first.next.prev = null;
                } else {
                    last = null;
                }
                first = first.next;
            }
            if (command.equals("deleteLast")) {
                if (last.prev != null) {
                    last.prev.next = null;
                } else {
                    first = null;
                }
                last = last.prev;
            }
        }
        System.out.println(first);
    }
}

class DoublyLinkedList {
    public DoublyLinkedList prev;
    public DoublyLinkedList next;
    public int value;

    DoublyLinkedList(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" ");
        DoublyLinkedList temp = this;
        while (temp != null) {
            joiner.add(String.valueOf(temp.value));
            temp = temp.next;
        }
        return joiner.toString();
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