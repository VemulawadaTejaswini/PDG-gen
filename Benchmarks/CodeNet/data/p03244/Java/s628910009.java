import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        try (InputReader reader = new InputReader(System.in)) {
            solve(reader);
        }
    }

    private static void solve(InputReader reader) throws IOException {
        int n = reader.readInt();
        int[] array = reader.readIntsSplitByDelimiter(" ");
        HashMap<Integer, Integer> map1 = new HashMap<>(n / 2);
        HashMap<Integer, Integer> map2 = new HashMap<>(n / 2);

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                Integer tmp = map1.getOrDefault(array[i], 0) + 1;
                map1.put(array[i], tmp);
            } else {
                Integer tmp = map2.getOrDefault(array[i], 0) + 1;
                map2.put(array[i], tmp);
            }
        }

        if (array[0] == array[1] && map1.keySet().size() == 1 && map2.keySet().size() == 1) {
            System.out.println(n / 2);
            return;
        }

        int maxValue1 = 0;
        int maxKey1 = 0;
        int secondValue1 = 0;
        int secondKey1 = 0;
        for (Integer key : map1.keySet()) {
            Integer value = map1.get(key);
            if (value > maxValue1) {
                secondValue1 = maxValue1;
                secondKey1 = maxKey1;

                maxValue1 = value;
                maxKey1 = key;
            } else if (value > secondValue1) {
                secondValue1 = value;
                secondKey1 = key;
            }
        }

        int maxValue2 = 0;
        int maxKey2 = 0;
        int secondValue2 = 0;
        int secondKey2 = 0;
        for (Integer key : map2.keySet()) {
            Integer value = map2.get(key);
            if (value >= maxValue2) {
                secondValue2 = maxValue2;
                secondKey2 = maxKey2;

                maxValue2 = value;
                maxKey2 = key;
            } else if (value >= secondValue2) {
                secondValue2 = value;
                secondKey2 = key;
            }
        }

        // System.out.println(maxKey1 + " " + maxKey2 + " 0");
        if (maxKey1 == maxKey2) {
            if (maxValue1 >= maxValue2) {
                // System.out.println(maxValue1 + " " + secondValue2 + " 1");
                System.out.println(n - maxValue1 - secondValue2);
            } else {
                // System.out.println(maxValue2 + " " + secondValue1 + " 2");
                System.out.println(n - maxValue2 - secondValue1);
            }
        } else {
            // System.out.println(maxValue1 + " " + secondValue2 + " 3");
            System.out.println(n - maxValue1 - maxValue2);
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
