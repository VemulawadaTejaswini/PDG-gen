import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        MyReader reader = new MyReader();
        int[] nab = reader.readInts(" ");
        int n = nab[0];
        int a = nab[1];
        int b = nab[2];
        System.out.println(problem158b(n, a, b));
    }

    private static int problem158b(int n, int a, int b) {
        return a * (n / (a + b)) + (Math.min(a, (n % (a + b))));
    }

    private static class MyReader {
        private final BufferedReader br;
        private MyReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        private String readString() throws IOException {
            return br.readLine();
        }

        private int readInt() throws IOException {
            return Integer.parseInt(readString());
        }

        private String[] readStrings(String regex) throws IOException {
            return readString().split(regex);
        }

        private int[] readInts(String regex) throws IOException {
            String[] strings = readStrings(regex);
            int[] ints = new int[strings.length];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.parseInt(strings[i]);
            }
            return ints;
        }
    }
}