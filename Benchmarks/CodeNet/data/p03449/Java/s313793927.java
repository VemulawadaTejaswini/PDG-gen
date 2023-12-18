import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(System.out); InputReader reader = new InputReader(System.in)) {
            int N = reader.readInt();
            int[][] squares = new int[2][];
            squares[0] = reader.readIntsSplitByDelimiter(" ");
            squares[1] = reader.readIntsSplitByDelimiter(" ");

            int max = 0;
            for (int i = 0; i < N; i++) {
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if (i == j) {
                        count += squares[0][j];
                    }

                    if (i > j) {
                        count += squares[0][j];
                    } else {
                        count += squares[1][j];
                    }
                }

                max = Math.max(max, count);
            }

            writer.println(max);
            writer.flush();
        }
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

    String[] readStringsSplitByDelimiter(String delimiter) throws IOException {
        return this.readLine().split(delimiter);
    }

    int[] readIntsSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.readLine().split(delimiter);

        int stringsLength = strings.length;
        int[] ints = new int[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        return ints;
    }

    long[] readLongsSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.readLine().split(delimiter);

        int stringsLength = strings.length;
        long[] longs = new long[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            longs[i] = Long.parseLong(strings[i]);
        }

        return longs;
    }

    @Override
    public void close() throws IOException {
        this.br.close();
    }
}