import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        MyReader reader = new MyReader();
        int a = reader.readInt();
        int b = reader.readInt();
        int c = reader.readInt();
        int x = reader.readInt();
        System.out.println(problem087b(a, b, c, x));
    }

    private static int problem087b(int a, int b, int c, int x) {
        int count = 0;
        for (int ai = a; ai >= 0; ai--) {
            for (int bi = b; bi >=0; bi--) {
                for (int ci = c; ci >= 0; ci--) {
                    int price = ai * 500 + bi * 100 + ci * 50;
                    if (price == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static class MyReader {
        private final BufferedReader br;
        private MyReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        private String readLine() throws IOException {
            return br.readLine();
        }

        private int readInt() throws IOException {
            return Integer.parseInt(readLine().split(" ")[0]);
        }

        private long readLong() throws IOException {
            return Long.parseLong(readLine().split(" ")[0]);
        }

        private String[] readStrings(String regex) throws IOException {
            return readLine().split(regex);
        }

        private int[] readInts(String regex) throws IOException {
            String[] strings = readStrings(regex);
            int[] ints = new int[strings.length];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.parseInt(strings[i]);
            }
            return ints;
        }

        private long[] readLongs(String regex) throws IOException {
            String[] strings = readStrings(regex);
            long[] longs = new long[strings.length];
            for (int i = 0; i < longs.length; i++) {
                longs[i] = Long.parseLong(strings[i]);
            }
            return longs;
        }
    }
}