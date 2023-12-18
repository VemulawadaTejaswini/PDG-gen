import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Main {

    private static final int MAX = 200000;

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        long k = scanner.nextLong();
        int[] a = new int[n];
        int[] first = new int[MAX + 1];
        Arrays.fill(first, -1);
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
            if (first[a[i]] < 0)
                first[a[i]] = i;
        }
        int[] right = new int[MAX + 1];
        Arrays.fill(right, -1);
        int[] jump = new int[n];
        int[] roundAdd = new int[n];
        for (int i = n - 1; i >= 0; --i) {
            if (right[a[i]] < 0) {
                jump[i] = (first[a[i]] + 1) % n;
                roundAdd[i] = 1;
            } else {
                jump[i] = (right[a[i]] + 1) % n;
            }
            right[a[i]] = i;
        }
//        writer.println(Arrays.toString(jump));
        int p = 0;
        int round = 0;
        ArrayList<Integer> roundStart = new ArrayList<>(n + 1);
        int loopSize = 0;
        while (true) {
            if (roundStart.size() == round)
                roundStart.add(p);
            round += roundAdd[p];
            if (jump[p] == 0) {
                loopSize = round + 1;
                break;
            }
            p = jump[p];
        }
//        writer.println(loopSize);
//        writer.println(roundStart);
        --k;
        if (roundStart.size() > k % loopSize) {
            boolean[] flag = new boolean[MAX];
            LinkedList<Integer> ans = new LinkedList<>();
            for (int i = roundStart.get((int) (k % loopSize)); i < n; ++i) {
                if (flag[a[i]]) {
                    do {
                        int t = ans.pollLast();
                        flag[t] = false;
                    } while (flag[a[i]]);
                } else {
                    ans.offerLast(a[i]);
                    flag[a[i]] = true;
                }
            }
            for (int x : ans) {
                writer.print(x + " ");
            }
            writer.println();
        }
        writer.close();
    }

    private static class SimpleScanner {

        private static final int BUFFER_SIZE = 10240;

        private Readable in;
        private CharBuffer buffer;
        private boolean eof;

        SimpleScanner(InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
            buffer = CharBuffer.allocate(BUFFER_SIZE);
            buffer.limit(0);
            eof = false;
        }


        private char read() {
            if (!buffer.hasRemaining()) {
                buffer.clear();
                int n;
                try {
                    n = in.read(buffer);
                } catch (IOException e) {
                    n = -1;
                }
                if (n <= 0) {
                    eof = true;
                    return '\0';
                }
                buffer.flip();
            }
            return buffer.get();
        }

        void checkEof() {
            if (eof)
                throw new NoSuchElementException();
        }

        char nextChar() {
            checkEof();
            char b = read();
            checkEof();
            return b;
        }

        String next() {
            char b;
            do {
                b = read();
                checkEof();
            } while (Character.isWhitespace(b));
            StringBuilder sb = new StringBuilder();
            do {
                sb.append(b);
                b = read();
            } while (!eof && !Character.isWhitespace(b));
            return sb.toString();
        }

        int nextInt() {
            return Integer.valueOf(next());
        }

        long nextLong() {
            return Long.valueOf(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}