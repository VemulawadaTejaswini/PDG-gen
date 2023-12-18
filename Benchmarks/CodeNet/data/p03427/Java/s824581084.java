import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(System.out); InputReader reader = new InputReader(System.in)) {
            String input = reader.readLine();
            char[] inputChar = input.toCharArray();

            if (inputChar.length < 2) {
                writer.println(input);
                writer.flush();
                return;
            }

            int length = inputChar.length;
            long ans = 0L;
            // 100
            for (int i = length - 1; i >= 1; i--) {
                if (inputChar[i] == '9') {
                    ans += 9L;
                } else {
                    ans += 9L;
                    for (int j = i - 1; j >= 0; j--) {
                        if (inputChar[j] > '0') {
                            inputChar[j]--;
                            break;
                        }

                        if (j !=  0) {
                            inputChar[j] = '9';
                            if (inputChar[j - 1] != '0'){
                                inputChar[j - 1]--;
                            }
                        }
                    }
                }
            }

            ans += inputChar[0] - '0';

            writer.println(ans);
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