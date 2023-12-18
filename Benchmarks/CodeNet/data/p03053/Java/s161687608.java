import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String[] f = first.split(" ");
        int H = Integer.valueOf(f[0]);
        int W = Integer.valueOf(f[1]);
        String[] input = new String[H];
        for(int i=0; i<H; i++) {
            input[i] = sc.nextLine();
        }
        int[][] distance = new int[H][W];
        Deque<Point> deque = new LinkedList<>();
        for(int i = 0; i < H ; i++) {
            // String line = sc.nextLine();
            String line = input[i];
            for (int j = 0; j < W; j++) {
                if(line.charAt(j) == '#') {
                    distance[i][j] = 0;
                    deque.addLast(new Point(i,j));
                } else {
                    distance[i][j] = -1;
                }
            }
        }
        int maxDistance = 0; 
        while(deque.size() > 0) {
            Point s = deque.pollFirst();
            int sx = s.x;
            int sy = s.y;
            int ds = distance[sx][sy];
            List<Point> neighbors = s.getNeighbors(H, W);
            for(Point t : neighbors) {
                if(distance[t.x][t.y] != -1) continue;
                distance[t.x][t.y] = ds + 1;
                maxDistance = Math.max(maxDistance, ds + 1);
                deque.addLast(t);
            }
        }
        System.out.println(maxDistance);
    }

    public static class Point {
        public int x;
        public int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public List<Point> getNeighbors(int height, int width) {
            List<Point> ans = new ArrayList<>();
            if(y!=0) {
                ans.add(new Point(x,y-1));
            } 
            if (y != width - 1) {
                ans.add(new Point(x,y+1));
            } 
            if (x != 0) {
                ans.add(new Point(x-1, y));
            }
            if (x != height -1) {
                ans.add(new Point(x+1, y));
            }

            return ans;
        }
    }
}
