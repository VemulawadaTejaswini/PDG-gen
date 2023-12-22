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

    private void run() {
        PriorityQueue queue = new PriorityQueue();

        boolean hasNext = true;
        while (hasNext) {
            String order = in.next();
            if (order.startsWith("i")) {
                queue.push(in.nextInt());
            } else if (order.startsWith("ex")) {
                System.out.println(queue.pop());
            } else {
                return;
            }
        }
    }

    private class PriorityQueue {
        private Node head = null;

        private void push(int value) {
            Node node = new Node(value);
            if (head == null) {
                head = node;
                return;
            }
            Node temp = head;
            Node prev = null;
            while (true) {
                if (node.value >= temp.value) {
                    node.next = temp;
                    if (prev != null) {
                        prev.next = node;
                    }
                    if (temp == head) {
                        head = node;
                    }
                    return;
                }
                if (temp.next == null) {
                    temp.next = node;
                    return;
                }
                prev = temp;
                temp = temp.next;
            }
        }

        public Node pop() {
            Node first = head;
            head = head.next;
            first.next = null;
            return first;
        }
    }

    private class Node {
        private Node next;
        private int value;

        private Node(int value) {
            this.value = value;
        }

        public String toString() {
            return String.valueOf(value);
        }
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