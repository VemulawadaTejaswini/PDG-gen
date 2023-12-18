import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    static boolean[][] white;
    static Queue<Point> q;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line0 = reader.readLine().split(" ");
        int h = Integer.parseInt(line0[0]);
        int w = Integer.parseInt(line0[1]);
        white = new boolean[h + 2][w + 2];
        q = new ArrayDeque<>(h * w);
        for (int x = 0; x < h; x++) {
            String line = reader.readLine();
            for (int y = 0; y < w; y++) {
                if (line.charAt(y) == '#') {
                    q.offer(new Point(x, y, 0));
                } else {
                    white[x + 1][y + 1] = true;
                }
            }
        }
        while (!q.isEmpty()) {
            Point p = q.poll();
            int x = p.x;
            int y = p.y;
            int nextDepth = p.depth + 1;
            neighbor(x - 1, y, nextDepth);
            neighbor(x + 1, y, nextDepth);
            neighbor(x, y - 1, nextDepth);
            neighbor(x, y + 1, nextDepth);
        }
        System.out.println(Point.maxDepth);
    }

    static void neighbor(int x, int y, int depth) {
        if (white[x + 1][y + 1]) {
            q.offer(new Point(x, y, depth));
            white[x + 1][y + 1] = false;
        }
    }

    static class Point {
        int x;
        int y;
        int depth;
        static int maxDepth;

        Point(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
            maxDepth = depth;
        }
    }
}
