import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        MyReader reader = new MyReader();
        int n = reader.readInt();
        String s = reader.readString();
        System.out.println(problem052b(n, s));
    }

    private static int problem052b(int n, String s) {
        int x = 0, max = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'I':
                    x++;
                    break;
                case 'D':
                    x--;
                    break;
                default:
                    // NOP
            }
            max = Math.max(x, max);
        }
        return max;
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