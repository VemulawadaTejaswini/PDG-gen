import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        int h = in.nextInt();
        int w = in.nextInt();
        int k = in.nextInt();
        int x1 = in.nextInt() - 1;
        int y1 = in.nextInt() - 1;
        int x2 = in.nextInt() - 1;
        int y2 = in.nextInt() - 1;
        char[][] c = in.nextCharGrid(h, w);
        Node[][] a = new Node[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = new Node(j, i);
                if (c[i][j] == '@') {
                    a[i][j] = null;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (a[i][j] == null) {
                    continue;
                }
                if (j - 1 >= 0) {
                    a[i][j].left = a[i][j - 1];
                }
                if (j + 1 < w) {
                    a[i][j].right = a[i][j + 1];
                }
                if (i + 1 < h) {
                    a[i][j].up = a[i + 1][j];
                }
                if (i - 1 >= 0) {
                    a[i][j].down = a[i - 1][j];
                }
            }
        }
        int[][] dist = new int[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(dist[i], iinf);
        }
        dist[x1][y1] = 0;
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(a[x1][y1]);
        a[x1][y1].remove();
        boolean[][] visited = new boolean[h][w];
        visited[x1][y1] = true;
        while (!deque.isEmpty()) {
            Node node = deque.pollFirst();
            if (visited[node.y][node.x]) {
                continue;
            }
            visited[node.y][node.x] = true;
            if (node.x == y2 && node.y == x2) {
                out.println(dist[node.y][node.x]);
                return;
            }
            for (int i = 0; i < 4; i++) {
                Node to = null;
                {
                    int move = 0;
                    Node current = node;
                    while (current != null && move <= k) {
                        move += current.getDist(i);
                        current = current.getNode(i);
                        to = current;
                    }
                }
                int move = 0;
                Node current = node;
                List<Node> visit = new ArrayList<>();
                while (move <= k) {
                    move += current.getDist(i);
                    current = current.getNode(i);
                    if (move > k || current == null) {
                        break;
                    }
                    dist[current.y][current.x] = dist[node.y][node.x] + 1;
                    visit.add(current);
                    deque.addLast(current);
                }
                for (Node node1 : visit) {
                    node1.remove();
                    node1.setNode(i, to);
                }
            }
        }
        Arrays.stream(dist).map(Arrays::toString).forEach(System.out::println);
        out.println(-1);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Node extends Point {
    Node left;
    Node right;
    Node up;
    Node down;
    int leftDist = 1;
    int rightDist = 1;
    int upDist = 1;
    int downDist = 1;

    Node(int x, int y) {
        super(x, y);
    }

    void remove() {
        if (left != null) {
            left.right = right;
            left.rightDist += rightDist;
        }
        if (right != null) {
            right.left = left;
            right.leftDist += leftDist;
        }
        if (up != null) {
            up.down = down;
            up.downDist += downDist;
        }
        if (down != null) {
            down.up = up;
            down.upDist += upDist;
        }
    }

    Node getNode(int i) {
        if (i == 0) {
            return left;
        } else if (i == 1) {
            return up;
        } else if (i == 2) {
            return right;
        } else {
            return down;
        }
    }

    void setNode(int i, Node node) {
        if (i == 0) {
            left = node;
            leftDist = dist(node);
        } else if (i == 1) {
            up = node;
            upDist = dist(node);
        } else if (i == 2) {
            right = node;
            rightDist = dist(node);
        } else {
            down = node;
            downDist = dist(node);
        }
    }

    int getDist(int i) {
        if (i == 0) {
            return leftDist;
        } else if (i == 1) {
            return upDist;
        } else if (i == 2) {
            return rightDist;
        } else {
            return downDist;
        }
    }

    int dist(Node a) {
        return a == null ? 0 : a.x == x ? a.y - y : a.x - x;
    }
}

class Point implements Comparable<Point> {
    static int h = -1, w = -1;
    final int x, y, z;

    Point(int z) {
        this.x = z % w;
        this.y = z / w;
        this.z = z;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = y * w + x;
    }

    Point move(int d) {
        return new Point(x + Main.da[d], y + Main.da[d + 1]);
    }

    boolean isInner() {
        if (h == -1 || w == -1) {
            throw new IllegalStateException("h/w is not initialized!");
        }
        return 0 <= x && x < w && 0 <= y && y < h;
    }

    List<Point> aroundPoints(int type) {
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < type; i++) {
            int nx = x + Main.da[i];
            int ny = y + Main.da[i + 1];
            Point point = new Point(nx, ny);
            if (point.isInner()) {
                list.add(point);
            }
        }
        return list;
    }

    int direction(Point o) {
        for (int i = 0; i < 8; i++) {
            if (move(i).equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int compareTo(Point o) {
        return x == o.x ? Integer.compare(y, o.y) : Integer.compare(x, o.x);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point)o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(char[] s) {
        out.println(String.valueOf(s));
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
