import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int w;
            int h;
            while((w = scn.nextInt()) > 0 | (h = scn.nextInt()) > 0) {
                w = w * 2 - 1;
                h = h * 2 - 1;
                boolean[][] maze = new boolean[h][w];
                for(int i = 0; i < h; i++) {
                    for(int j = 0; j < w; j++) {
                        if((i + j) % 2 > 0) {
                            maze[i][j] = scn.nextInt() == 0;
                        }
                    }
                }
                Explorer.resetRecord();
                new Explorer(maze, 0, 0, 0).search();
                System.out.println(Explorer.getRecord());
            }
        }
    }
}

class Explorer {
    private static final int[][] VIEW_VECTOR = {
        {1, 0, -1, 0}, {0, 1, 0, -1}
    };
    private static final int[][] MOVE_VECTOR = {
        {2, 0, -2, 0}, {0, 2, 0, -2}
    };

    private static int record = Integer.MAX_VALUE;

    private boolean[][] map;
    private int y;
    private int x;
    private int count;

    public Explorer(boolean[][] map, int y, int x, int count) {
        this.map   = map;
        this.y     = y;
        this.x     = x;
        this.count = count;
    }

    public static void resetRecord() {
        record = Integer.MAX_VALUE;
    }

    public static int getRecord() {
        return record != Integer.MAX_VALUE ? record : 0;
    }

    public void search() {
        count++;
        if(count < record) {
            if(y == ~-map.length && x == ~-map[0].length) {
                record = count;
            } else {
                dispatch();
            }
        }
        System.gc();
    }

    private void dispatch() {
        for(int v = 0; v < 4; v++) {
            try {
                int viewY = y + VIEW_VECTOR[0][v];
                int viewX = x + VIEW_VECTOR[1][v];
                if(map[viewY][viewX]) {
                    int moveY = y + MOVE_VECTOR[0][v];
                    int moveX = x + MOVE_VECTOR[1][v];
                    boolean[][] newMap = new boolean[map.length][];
                    for(int i = 0; i < newMap.length; i++) {
                        newMap[i] = map[i].clone();
                    }
                    newMap[viewY][viewX] = false;
                    new Explorer(newMap, moveY, moveX, count).search();
                }
            } catch(ArrayIndexOutOfBoundsException ignore) {}
        }
    }
}