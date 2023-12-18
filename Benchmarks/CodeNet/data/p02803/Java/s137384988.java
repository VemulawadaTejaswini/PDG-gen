import java.util.*;

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


class Main {

    static private int H;
    static private int W;
    static private char[][] map;

    private final static int[][] MOVE = {{-1,0},{1,0},{0,-1},{0,1}};

    public static long bfs(Point start, Point goal) {
        Queue<Point> queue = new ArrayDeque<Point>();
        queue.add(start);
        // w/o weight

        long[][] cost = new long[H][W];
        for (int i = 0; i < H; i++) {
            Arrays.fill(cost[i], Long.MAX_VALUE);
        }

        cost[start.y][start.x] = 0;

        //System.out.println(String.format("SRT: X,Y=%d,%d", start.x, start.y));
        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            //System.out.println(String.format("CUR: X,Y=%d,%d", cur.x, cur.y));

            for (int[] move: MOVE) {
                //System.out.println(String.format("MOV: X,Y,%d,%d", move[1], move[0]));

                int next_y  = cur.y + move[0];
                int next_x  = cur.x + move[1];

                long c = 0;
                //System.out.println(String.format("NXT: X,Y,%d,%d", next_x, next_y));
                if (next_y < 0 || next_y >= H) continue;
                if (next_x < 0 || next_x >= W) continue;

                if (cost[goal.y][goal.x] != Long.MAX_VALUE && cost[goal.y][goal.x]  > map[next_y][next_x]) {
                    continue;
                }
                if (map[next_y][next_x] == '#') {
                    continue;
                } else {
                    c = 1;
                }

                long sum = (cost[cur.y][cur.x] + c);
                //System.out.println(String.format("NXT: X,Y,C=%d,%d,%d", next_x, next_y, sum));
                if (cost[next_y][next_x] > sum) {
                    // update min cost.
                    cost[next_y][next_x] = sum;
                } else {
                    continue;
                }
                // keep going.
                queue.add(new Point(next_x, next_y));
            }
        }
        return (cost[goal.y][goal.x]);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();

        map = new char[H][W];
        for (int i = 0; i < H; i++) {
            map[i] = sc.next().toCharArray();
        }

        long max = Long.MIN_VALUE;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                for (int k = 0; k < H; k++) {
                    for (int l = 0; l < W; l++) {
                        if (map[i][j] == '#' || map[k][l] == '#') {
                            continue;
                        }
                        if (i == k && j == l) {
                            continue;
                        }
                        Point start = new Point(j, i);
                        Point end = new Point(l, k);
                        long cost = bfs(start, end);
                        if (max < cost) {
                            max = cost;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
