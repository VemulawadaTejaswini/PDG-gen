import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.*;

public class Main {

    private static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Point p) {
            return p.x == x && p.y == y;
        }

        public String toString() {
            return "point: " + x + "," + y;
        }
    }

    private static char[][] room;
    private static LinkedList<Point> queue;
    private static int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    private static Point[] points;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, h, n;
        int count = 0;
        String lineOfInput;

        h = sc.nextInt();
        w = sc.nextInt();
        n = sc.nextInt();

        room = new char[h][w];
        points = new Point[n+1];

        sc.nextLine(); // for empty line
        for (int i = 0; i < h; i++) {
            lineOfInput = sc.nextLine();
            for (int j = 0; j < w; j++) {
                room[i][j] = lineOfInput.charAt(j);
                if (room[i][j] == 'S') {
                    points[0] = new Point(j, i);
                }
                if (room[i][j] != '.' && room[i][j] != 'X' && room[i][j] != 'S') {
                    points[Integer.parseInt(Character.toString(room[i][j]))] = new Point(j, i);
                }
            }
        }

//        System.out.println(Arrays.toString(points));
//        System.out.println(points[1].equals(new Point(2,2)));

        for (int i = 1; i <= n; i++) {
            count += bfs(i);
        }

        System.out.println(count);
    }

    private static int bfs(int next) {
        int count = 0;
        Point temp;
        int nx, ny;
        boolean[][] visited = new boolean[room.length][room[0].length];

        queue = new LinkedList<>();
        queue.add(points[next-1]);
        queue.add(null);
        visited[points[next-1].y][points[next-1].x] = true;
        while ((queue.peek() != null && !queue.peek().equals(points[next])) || queue.peek() == null) {
//            System.out.println(queue.peek());
            temp = queue.poll();
            if (temp == null) {
                count++;
                queue.add(null);
            }
            else {
                for (int[] direction: directions) {
                    nx = temp.x + direction[0];
                    ny = temp.y + direction[1];
                    if (nx >= 0 && ny >= 0 && nx < room[0].length && ny < room.length) {
                        if (room[ny][nx] != 'X' && !visited[ny][nx]) {
                            queue.add(new Point(nx, ny));
                            visited[ny][nx] = true;
                        }
                    }
                }
            }
        }

        return count;
    }
}