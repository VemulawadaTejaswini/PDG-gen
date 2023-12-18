import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        MyReader reader = new MyReader();
        int[][] cs = new int[3][3];
        cs[0] = reader.readInts(" ");
        cs[1] = reader.readInts(" ");
        cs[2] = reader.readInts(" ");
        System.out.println(problem088c(cs));
    }

    private static String problem088c(int[][] cs) {
        int[] as = {-1, -1, -1};
        int[] bs = {-1, -1, -1};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = cs[i][j];
                as[i] = Math.max(as[i], n);
                bs[j] = Math.max(bs[j], n);
            }
        }

        int a, b;
        for (int a1 = 0; a1 <= as[0]; a1++) {
            for (int a2 = 0; a2 <= as[1]; a2++) {
                for (int a3 = 0; a3 <= as[2]; a3++) {
                    for (int b1 = 0; b1 <= bs[0]; b1++) {
                        for (int b2 = 0; b2 <= bs[1]; b2++) {
                            whole:
                            for (int b3 = 0; b3 <= bs[2]; b3++) {
                                for (int i = 0; i < 3; i++) {
                                    a = (i == 0) ? a1 : ((i == 1) ? a2 : a3);
                                    for (int j = 0; j < 3; j++) {
                                        b = (j == 0) ? b1 : ((j == 1) ? b2 : b3);
                                        if ((a + b) != cs[i][j]) continue whole;
                                    }
                                }
                                return  "Yes";
                            }
                        }
                    }
                }
            }
        }
        return "No";
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