import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(System.out); InputReader reader = new InputReader(System.in)) {
            int[] input = reader.readIntsSplitByDelimiter(" ");
            int numOfbill = input[0];
            int sumInput = input[1];

            for (int numOf1000 = 0; numOf1000 <= numOfbill; numOf1000++) {
                for (int numOf5000 = numOfbill - numOf1000; numOf5000 >= 0; numOf5000--) {
                    int numOf10000 = numOfbill - numOf1000 - numOf5000;
                    int sum = 1000 * numOf1000 + 5000 * numOf5000 + 10000 * numOf10000;
                    if (sum == sumInput) {
                        System.out.printf("%d %d %d%n", numOf10000, numOf5000, numOf1000);
                        return;
                    }
                }
            }
            System.out.println("-1 -1 -1");
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