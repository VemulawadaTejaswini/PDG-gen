import java.io.*;
import java.util.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Point {
    int id;
    long x;
    long y;

    Point(int id, long x, long y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
}

class KDTree {
    private static final int K = 2;

    KDNode root;
    private Point[] points;
    List<Point> answer;

    KDTree(Point[] points) {
        this.points = points;
        this.root = build(0, points.length, 0);
    }

    private KDNode build(int l, int r, int depth) {
        if (l >= r) return null;

        int mid = (l + r) / 2;
        if (depth % K == 0) {
            Arrays.sort(points, l, r, xComparator);
        } else if (depth % K == 1) {
            Arrays.sort(points, l, r, yComparator);
        } else {
            throw new RuntimeException();
        }

        KDNode node = new KDNode();

        node.location = mid;
        node.l = build(l, mid, depth + 1);
        node.r = build(mid + 1, r, depth + 1);

        return node;
    }

    List<Point> find(Point p1, Point p2) {
        answer = new LinkedList<>();
        long sx = Math.min(p1.x, p2.x);
        long sy = Math.min(p1.y, p2.y);
        long tx = Math.max(p1.x, p2.x);
        long ty = Math.max(p1.y, p2.y);
        find(root, sx, tx, sy, ty, 0);
        return answer;
    }

    void find(KDNode v, long sx, long tx, long sy, long ty, int depth) {
        long x = points[v.location].x;
        long y = points[v.location].y;

        if (sx <= x && x <= tx && sy <= y && y <= ty) {
            answer.add(points[v.location]);
//            System.out.println(points[v.location]);
        }

        if (depth % K == 0) {
            if (v.l != null && sx <= x) find(v.l, sx, tx, sy, ty, depth + 1);
            if (v.r != null && x <= tx) find(v.r, sx, tx, sy, ty, depth + 1);
        } else if (depth % K == 1) {
            if (v.l != null && sy <= y) find(v.l, sx, tx, sy, ty, depth + 1);
            if (v.r != null && y <= ty) find(v.r, sx, tx, sy, ty, depth + 1);
        } else {
            throw new RuntimeException();
        }
    }

    private Comparator<Point> xComparator = new Comparator<Point>() {
        @Override
        public int compare(Point p1, Point p2) {
            return (int) Math.signum(p1.x - p2.x);
        }
    };

    private Comparator<Point> yComparator = new Comparator<Point>() {
        @Override
        public int compare(Point p1, Point p2) {
            return (int) Math.signum(p1.y - p2.y);
        }
    };

    class KDNode {
        int location;
        KDNode l, r;
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
        new Solver().solve(new UserScanner(System.in));
//        new Solver().solve(new UserScanner(new ByteArrayInputStream(ex.getBytes("utf-8"))));
    }

    private static final String ex = "6\n" +
            "2 1\n" +
            "2 2\n" +
            "4 2\n" +
            "6 2\n" +
            "3 3\n" +
            "5 4\n" +
            "2\n" +
            "2 4 0 4\n" +
            "4 10 2 5\n";
}

class Solver {
    void solve(UserScanner scanner) throws IOException {
        int n = scanner.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i ++) {
            long x = scanner.nextInt();
            long y = scanner.nextInt();
            points[i] = new Point(i, x, y);
        }
        KDTree tree = new KDTree(points);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i ++) {
            long sx = scanner.nextInt();
            long tx = scanner.nextInt();
            long sy = scanner.nextInt();
            long ty = scanner.nextInt();
//            List<Point> result = tree.find(new Point(-1, sx, sy), new Point(-1, tx, ty));
            tree.answer = new LinkedList<>();
            tree.find(tree.root, sx, tx, sy, ty, 0);
            int[] answerInts = new int[tree.answer.size()];
            for (int j = 0; j < answerInts.length; j ++) answerInts[j] = tree.answer.get(j).id;
            Arrays.sort(answerInts);
            for (int j = 0; j < answerInts.length; j ++) System.out.println(answerInts[j]);
            System.out.println();
        }
    }

    private int[] splitInt(String s) {
        String[] split = s.split(" ");
        int[] splitInt = new int[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitInt[i] = Integer.parseInt(split[i]);
        }
        return splitInt;
    }

    private long[] splitLong(String s) {
        String[] split = s.split(" ");
        long[] splitLong = new long[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitLong[i] = Long.parseLong(split[i]);
        }
        return splitLong;
    }
}

class UserScanner {
    private InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    UserScanner(InputStream in) {
        this.in = in;
    }

    private boolean read() throws IOException {
        ptr = 0;
        buflen = in.read(buffer);
        if (buflen <= 0)
            return false;
        else
            return true;
    }

    private byte getByte() throws IOException {
        if (ptr >= buflen)
            read();
        if (isCtlSpace(buffer[ptr])) {
            return -1;
        } else
            return buffer[ptr++];
    }

    private void skipCtlSpace() throws IOException {
        if (ptr >= buflen)
            read();
        if (isCtlSpace(buffer[ptr])) {
            ptr++;
            skipCtlSpace();
        }
    }

    private boolean isCtlSpace(byte b) {
        if (b <= ' ' || b > '~')
            return true;
        else
            return false;
    }

    public void close() throws IOException {
        in.close();
    }

    public String next() throws IOException {
        skipCtlSpace();
        StringBuilder sb = new StringBuilder();
        byte b;
        while ((b = getByte()) != -1) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() throws IOException {
        skipCtlSpace();
        int n = 0;
        boolean minus = false;
        byte b;
        while ((b = getByte()) != -1) {
            if (b == '-')
                minus = true;
            else {
                n *= 10;
                n += (b - '0');
            }
        }
        if (minus)
            return n * -1;
        else
            return n;
    }
}