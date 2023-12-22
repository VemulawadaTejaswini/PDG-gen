import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    int k;
    int h;
    int w;
    boolean[][] obstacle;

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        h = Integer.parseInt(tokenizer.nextToken());
        w = Integer.parseInt(tokenizer.nextToken());
        k = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(f.readLine());
        int x1 = Integer.parseInt(tokenizer.nextToken()) - 1;
        int y1 = Integer.parseInt(tokenizer.nextToken()) - 1;
        int x2 = Integer.parseInt(tokenizer.nextToken()) - 1;
        int y2 = Integer.parseInt(tokenizer.nextToken()) - 1;

        obstacle = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] line = f.readLine().toCharArray();
            for (int j = 0; j < w; j++) {
                if (line[j] == '@') {
                    obstacle[i][j] = true;
                }
            }
        }

        int[][] shortestPath = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                shortestPath[i][j] = Integer.MAX_VALUE;
            }
        }
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(x1, y1, 0, 0, 0));
        boolean[][][] visited = new boolean[h][w][4];
        while(!pq.isEmpty()) {
            Node node = pq.remove();
            //System.out.println(node.x + 1 +  " " + (node.y + 1) + " " + node.direction + " " + node.path + " " + node.part);
            if (visited[node.x][node.y][node.direction]) {
                continue;
            }
            visited[node.x][node.y][node.direction] = true;
            int length = node.path;
            if (node.part != 0) {
                length++;
            }
            shortestPath[node.x][node.y] = Math.min(shortestPath[node.x][node.y], length);
            int dx = Integer.MAX_VALUE;
            int dy = Integer.MAX_VALUE;
            if (node.direction == 0) {
                dx = -1;
                dy = 0;
            } else if (node.direction == 1) {
                dx = 1;
                dy = 0;
            } else if (node.direction == 2) {
                dx = 0;
                dy = -1;
            } else if (node.direction == 3) {
                dx = 0;
                dy = 1;
            }
            if (coordIsLegal(node.x + dx, node.y + dy)) {
                pq.add(new Node(node.x + dx, node.y + dy, node.path, node.part + 1, node.direction));
            }

            for (int i = 0; i < 4; i++) {
                pq.add(new Node(node.x, node.y, length, 0, i));
            }
        }

        if (shortestPath[x2][y2] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(shortestPath[x2][y2]);
        }
    }

    private boolean coordIsLegal(int x, int y) {
        if (x < 0 || y < 0 || x >= h || y >= w) {
            return false;
        }
        if (obstacle[x][y]) {
            return false;
        }

        return true;
    }


    private  class Node implements Comparable<Node> {
        int x;
        int y;
        int direction;
        int path;
        int part;

        public Node(int x1, int y1, int path, int part, int direction) {
            this.x = x1;
            this.y = y1;
            if (part == k) {
                part = 0;
                path++;
            }
            this.path = path;
            this.part = part;
            this.direction = direction;
        }

        @Override
        public int compareTo(Node node) {
            if (this.path < node.path) {
                return -1;
            }
            if (this.path > node.path) {
                return 1;
            }
            if (this.part < node.part) {
                return -1;
            }
            if (this.part > node.part) {
                return 1;
            }

            return 0;
        }
    }
}
