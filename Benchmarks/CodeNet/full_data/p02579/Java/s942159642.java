import java.util.*;

public class Main {
    static ArrayList<ArrayList<Grid>> maze = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> used = new ArrayList<>();

    static public void main(String[] args) {
        final int MAX = (int) 1e8;

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[] C = new int[2];
        int[] D = new int[2];
        C[0] = sc.nextInt() + 1;
        C[1] = sc.nextInt() + 1;
        D[0] = sc.nextInt() + 1;
        D[1] = sc.nextInt() + 1;
        ArrayList<Grid> wall = new ArrayList<>();
        for (int i = -2; i < W + 2; i++) {
            wall.add(Grid.WALL);
        }
        for (int i = -2; i < H + 2; i++) {
            ArrayList<Integer> max = new ArrayList<>();
            for (int j = -2; j < W + 2; j++) {
                max.add(MAX);
            }
            used.add(max);

            if (i < 0 || i >= H) {
                maze.add(wall);
                continue;
            }
            ArrayList<Grid> line = new ArrayList<>();
            String lineStr = sc.next();
            for (int j = -2; j < W + 2; j++) {
                if (j < 0 || j >= W) {
                    line.add(Grid.WALL);
                } else {
                    line.add(lineStr.charAt(j) == '.' ? Grid.ROAD : Grid.WALL);
                }
            }
            maze.add(line);
        }

        setUsed(C[0], C[1], 0);
        PriorityQueue<Point> stack = new PriorityQueue<Point>(Comparator.comparingInt(Main::getUsed));
        stack.add(new Point(C[0], C[1]));

        while (!stack.isEmpty()) {
            Point now = stack.poll();
            for (int i = -2; i <= 2; i++) {
                for (int j = -2; j <= 2; j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    if (getGrid(now.h + i, now.w + j) == Grid.WALL) {
                        continue;
                    }
                    if (i * i + j * j == 1) {
                        if (updateUsed(now.h + i, now.w + j, getUsed(now), Integer::compare)) {
                            stack.add(new Point(now.h + i, now.w + j));
                        }
                    } else {
                        if (updateUsed(now.h + i, now.w + j, getUsed(now) + 1, Integer::compare)) {
                            stack.add(new Point(now.h + i, now.w + j));
                        }
                    }
                }
            }
        }

        System.out.println(getUsed(D[0], D[1]) == MAX ? -1 : getUsed(D[0], D[1]));
    }

    static int getUsed(int h, int w) {
        return used.get(h).get(w);
    }

    static int getUsed(Point p) {
        return used.get(p.h).get(p.w);
    }

    static void setUsed(int h, int w, int value) {
        used.get(h).set(w, value);
    }

    //Comparator(すでに入っている値, value) > 0なら更新
    static boolean updateUsed(int h, int w, int value, Comparator<Integer> comparator) {
        if (comparator.compare(getUsed(h, w), value) > 0) {
            setUsed(h, w, value);
            return true;
        }
        return false;
    }

    static Grid getGrid(int h, int w) {
        return maze.get(h).get(w);
    }

    enum Grid {
        WALL, ROAD;
    }

    static class Point {
        public int h;
        public int w;

        Point(int h, int w) {
            this.h = h;
            this.w = w;
        }
    }
}
