import java.io.*;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        HashMap<Integer, Node> nodeMap = new HashMap<>();
        for (int x = 0; x < n; ++x) {
            for (int y = x + 1; y < n; ++y) {
                nodeMap.put(x * n + y, new Node(x + 1, y + 1));
            }
        }
        for (int x = 0; x < n; ++x) {
            Node pre = null;
            for (int i = 0; i < n - 1; ++i) {
                int y = scanner.nextInt() - 1;
                Node cur = nodeMap.get(x < y ? x * n + y : y * n + x);
                if (pre != null) {
                    pre.next.add(cur);
                    ++cur.inDegree;
                }
                pre = cur;
            }
        }
        int ans = 0;
        HashSet<Node> nodes = new HashSet<>(nodeMap.values());
        while (!nodes.isEmpty()) {
            ++ans;
            HashSet<Node> remove = new HashSet<>();
            for (Node node : nodes) {
                if (node.inDegree == 0) {
                    remove.add(node);
                }
            }
            if (remove.isEmpty()) {
                ans = -1;
                break;
            }
            for (Node removeNode : remove) {
                for (Node next : removeNode.next) {
                    --next.inDegree;
                }
                nodes.remove(removeNode);
            }
        }
        writer.println(ans);
        writer.close();
    }

    private static class Node {
        private int x, y;
        private int inDegree;
        private LinkedList<Node> next;

        private Node(int x, int y) {
            this.x = x;
            this.y = y;
            this.next = new LinkedList<>();
        }
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

        private void checkEof() {
            if (eof)
                throw new NoSuchElementException();
        }

        private char nextChar() {
            checkEof();
            char b = read();
            checkEof();
            return b;
        }

        private String next() {
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

        private int nextInt() {
            return Integer.valueOf(next());
        }

        private long nextLong() {
            return Long.valueOf(next());
        }

        private double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}