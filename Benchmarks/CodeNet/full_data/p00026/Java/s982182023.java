import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Map<Integer, DropMode> dropMode;

    static {
        dropMode = new HashMap<Integer, Main.DropMode>();
        dropMode.put(1, new DropModeStar(1));
        dropMode.put(2, new DropModeSquare(1));
        dropMode.put(3, new DropModeStar(2));
    }

    public static void main(String[] args) {
        try {
            int[][] field = new int[10][10];

            Scanner sc = new Scanner(System.in);

            while (sc.hasNext()) {
                String[] arguments = sc.next().split(",");
                int x = Integer.valueOf(arguments[0]);
                int y = Integer.valueOf(arguments[1]);
                int size = Integer.valueOf(arguments[2]);

                dropMode.get(size).drop(field, x, y);
            }

            System.out.println(getWhiteCells(field));
            System.out.println(getMostDropped(field));

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

    }

    private static int getWhiteCells(int[][] field) {
        int result = 0;
        for (int[] row : field) {
            for (int cell : row) {
                if (cell == 0) {
                    result++;
                }
            }
        }
        return result;
    }

    private static int getMostDropped(int[][] field) {
        int result = 0;
        for (int[] row : field) {
            for (int cell : row) {
                if (cell > result) {
                    result = cell;
                }
            }
        }
        return result;
    }

    private static abstract class DropMode {
        protected int size;

        public DropMode(int size) {
            this.size = size;
        }

        public abstract void drop(int[][] field, int x, int y);
    }

    /** x + y = ±sizeにDrop */
    private static class DropModeStar extends DropMode {
        public DropModeStar(int size) {
            super(size);
        }

        @Override
        public void drop(int[][] field, int x, int y) {
            for (int oy = -1 * this.size; oy <= this.size; oy++) {
                if (y + oy < 0 || y + oy > 9) {
                    continue;
                }

                for (int ox = -1 * (this.size - Math.abs(oy)); ox <= (this.size - Math
                        .abs(oy)); ox++) {
                    if (x + ox < 0 || x + ox > 9) {
                        continue;
                    }

                    field[y + oy][x + ox]++;
                }
            }
        }
    }

    /** x = ±size, y = ±sizeにDrop */
    private static class DropModeSquare extends DropMode {
        public DropModeSquare(int size) {
            super(size);
        }

        @Override
        public void drop(int[][] field, int x, int y) {
            for (int oy = -1 * this.size; oy <= this.size; oy++) {
                if (y + oy < 0 || y + oy > 9) {
                    continue;
                }

                for (int ox = -1 * this.size; ox <= this.size; ox++) {
                    if (x + ox < 0 || x + ox > 9) {
                        continue;
                    }

                    field[y + oy][x + ox]++;
                }
            }
        }
    }

}