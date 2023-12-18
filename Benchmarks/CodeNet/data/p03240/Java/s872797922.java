import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        try (InputReader reader = new InputReader(System.in)) {
            solve(reader);
        }
    }

    private static void solve(InputReader reader) throws IOException {
        int n = reader.readInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int[] p = reader.readIntsSplitByDelimiter(" ");
            points[i] = new Point(p[0], p[1], p[2]);
        }

        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                boolean ok = true;

                int h = points[0].h + Math.abs(points[0].x - i) + Math.abs(points[0].y - j);
                for (int k = 1; k < n; k++) {
                    int tmp = points[k].h + Math.abs(points[k].x - i) + Math.abs(points[k].y - j);

                    if (h != tmp) {
                        ok = false;
                        break;
                    }
                }

                if (ok) {
                    System.out.printf("%d %d %d%n", i, j, h);
                }
            }
        }
    }
}

class Point {
    public int x;
    public int y;
    public int h;

    Point(int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }
}

class Util {
    static int gcd(int m, int n) {
        int min = Math.min(m, n);
        int max = Math.max(m, n);
        while (min != 0) {
            int tmp = min;
            min = max % tmp;
            max = tmp;
        }

        return max;
    }

    static int lcm(int m, int n) {
        return m / gcd(m, n) * n;
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
        return Integer.parseInt(this.readLine());
    }

    long readLong() throws IOException {
        return Long.parseLong(this.readLine());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(this.readLine());
    }

    String[] readStringsSplitByDelimiter(String delimiter) throws IOException {
        return this.readLine().split(delimiter);
    }

    int[] readIntsSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.readStringsSplitByDelimiter(delimiter);

        int stringsLength = strings.length;
        int[] ints = new int[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        return ints;
    }

    long[] readLongsSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.readStringsSplitByDelimiter(delimiter);

        int stringsLength = strings.length;
        long[] longs = new long[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            longs[i] = Long.parseLong(strings[i]);
        }

        return longs;
    }

    double[] readDoublesSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.readStringsSplitByDelimiter(delimiter);

        int stringsLength = strings.length;
        double[] doubles = new double[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            doubles[i] = Double.parseDouble(strings[i]);
        }

        return doubles;
    }

    @Override
    public void close() throws IOException {
        this.br.close();
    }
}
