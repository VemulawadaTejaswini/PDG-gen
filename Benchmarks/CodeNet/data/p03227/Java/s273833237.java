import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        try (InputReader reader = new InputReader(System.in)) {
            solve(reader);
        }
    }

    private static void solve(InputReader reader) throws IOException {
        String i = reader.readLine();
        if (i.length() == 2) {
            System.out.println(i);
        } else {
            StringBuilder sb = new StringBuilder(i);
            System.out.println(sb.reverse());
        }
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

    String[] readStringsSplitBy(String delimiter) throws IOException {
        return this.readLine().split(delimiter);
    }

    int[] readIntsSplitBy(String delimiter) throws IOException {
        String[] strings = this.readStringsSplitBy(delimiter);

        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        return ints;
    }

    long[] readLongsSplitBy(String delimiter) throws IOException {
        String[] strings = this.readStringsSplitBy(delimiter);

        long[] longs = new long[strings.length];
        for (int i = 0; i < strings.length; i++) {
            longs[i] = Long.parseLong(strings[i]);
        }

        return longs;
    }

    double[] readDoublesSplitBy(String delimiter) throws IOException {
        String[] strings = this.readStringsSplitBy(delimiter);

        double[] doubles = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            doubles[i] = Double.parseDouble(strings[i]);
        }

        return doubles;
    }

    @Override
    public void close() throws IOException {
        this.br.close();
    }
}
