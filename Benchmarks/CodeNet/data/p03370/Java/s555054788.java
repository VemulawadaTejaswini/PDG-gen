import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.chrono.MinguoDate;

public class Main {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(System.out); InputReader reader = new InputReader(System.in)) {
            int[] inputs = reader.readIntsSplitByDelimiter(" ");
            int min = reader.readInt();
            int  c = 0;
            for (int i = 1; i < inputs[0]; i++) {
                int m = reader.readInt();
                if (m < min) {
                    min = m;
                }
                inputs[1] -= m;
                c++;
            }

            c += inputs[1] / min;
            System.out.println(c);
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