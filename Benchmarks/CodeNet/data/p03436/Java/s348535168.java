import java.awt.RadialGradientPaint;
import java.awt.geom.CubicCurve2D;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


public class Main {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(System.out); InputReader reader = new InputReader(System.in)) {
            int[] input = reader.readIntsSplitByDelimiter(" ");
            int numOfRows = input[0];
            int numOfCols = input[1];

            Point[][] map = new Point[numOfRows + 2][numOfCols + 2];
            int whiteCount = 0;
            for (int i = 0; i < numOfRows + 2; i++) {
                for (int j = 0; j < numOfCols + 2; j++) {
                    map[i][j] = new Point(0, 0, Point.WALL);
                }
            }

            for (int i = 0; i < numOfRows; i++) {
                char[] mapChars = reader.readLine().toCharArray();
                for (int j = 0; j < numOfCols; j++) {
                    map[i + 1][j + 1] = new Point(i + 1, j + 1, mapChars[j]);

                    if (mapChars[j] == '.') {
                        whiteCount++;
                    }
                }
            }

            Deque<Point> queue = new ArrayDeque<>();
            map[1][1].check();
            map[1][1].setCost(1);
            queue.addLast(map[1][1]);
            while(!queue.isEmpty()) {
                Point currentP = queue.removeFirst();
                
                if (currentP.getX() == numOfRows && currentP.getY() == numOfCols) {
                    System.out.println(whiteCount - currentP.getCost());
                    return;
                }

                Point tmp = map[currentP.getX() - 1][currentP.getY()];
                if (tmp.isNotWall() && tmp.isNotChecked()) {
                    tmp.check();
                    tmp.setCost(currentP.getCost() + 1);
                    queue.addLast(tmp);
                }

                tmp = map[currentP.getX() + 1][currentP.getY()];
                if (tmp.isNotWall() && tmp.isNotChecked()) {
                    tmp.check();
                    tmp.setCost(currentP.getCost() + 1);
                    queue.addLast(tmp);
                }

                tmp = map[currentP.getX()][currentP.getY() - 1];
                if (tmp.isNotWall() && tmp.isNotChecked()) {
                    tmp.check();
                    tmp.setCost(currentP.getCost() + 1);
                    queue.addLast(tmp);
                }

                tmp = map[currentP.getX()][currentP.getY() + 1];
                if (tmp.isNotWall() && tmp.isNotChecked()) {
                    tmp.check();
                    tmp.setCost(currentP.getCost() + 1);
                    queue.addLast(tmp);
                }
            }
        }
    }
}

class Point {
    public static final char START = 's';
    public static final char GOAL = 'g';
    public static final char WALL = '#';
    public static final char PATH = '.';

    private final int x;
    private final int y;
    private final char state;
    private boolean isChecked;
    private int cost;

    Point(int x, int y, char state) {
        this.x = x;
        this.y = y;
        this.state = state;
        this.isChecked = false;
        this.cost = 0;
    }

    void setCost(int cost) {
        this.cost = cost;
    }

    int getCost() {
        return this.cost;
    }

    void check() {
        this.isChecked = true;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    boolean isNotChecked() {
        return !this.isChecked;
    }

    boolean isNotWall() {
        return this.state != Point. WALL;
    }

    boolean isGoal() {
        return this.state == Point.GOAL;
    }

    char getState() {
        return this.state;
    }
}
 
class InputReader implements Closeable, AutoCloseable {
    private final BufferedReader br;
 
    InputReader(InputStream inputStream) {
        this.br = new BufferedReader(new InputStreamReader(inputStream));
    }
 
    String readLine() throws IOException {
        return this.br.readLine();
    }
 
    int readInt() throws IOException {
        return Integer.parseInt(this.br.readLine());
    }
 
    long readLong() throws IOException {
        return Long.parseLong(this.br.readLine());
    }
 
    String[] readStringsSplitByDelimiter(String delimiter) throws IOException {
        return this.br.readLine().split(delimiter);
    }
 
    int[] readIntsSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.br.readLine().split(delimiter);
 
        int stringsLength = strings.length;
        int[] ints = new int[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
 
        return ints;
    }
 
    long[] readLongsSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.br.readLine().split(delimiter);
 
        int stringsLength = strings.length;
        long[] longs = new long[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            longs[i] = Long.parseLong(strings[i]);
        }
 
        return longs;
    }
 
    @Override
    public void close() throws IOException {
        br.close();
    }
}