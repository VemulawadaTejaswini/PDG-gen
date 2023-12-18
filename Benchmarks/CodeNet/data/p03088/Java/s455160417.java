import java.io.*;
import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        final int N = Integer.parseInt(in.readLine());
        final char[] arr = {'A', 'T', 'G', 'C'};
        HashMap<String, Integer> countBySuffix = new HashMap<>();
        for (char c1 : arr) {
            for (char c2 : arr) {
                for (char c3 : arr) {
                    StringBuilder str = new StringBuilder();
                    str.append(c1);
                    str.append(c2);
                    str.append(c3);
                    String suffix = str.toString();
                    if (suffix.endsWith("AGC") || suffix.endsWith("ACG") || suffix.endsWith("GAC")) {
                        continue;
                    }
                    countBySuffix.put(suffix, 1);
                }
            }
        }


        for (int i = 4; i <= N; i++) {
            HashMap<String, Integer> countBySuffix2 = new HashMap<>();
            for (String suf : countBySuffix.keySet()) {
                for (char c : arr) {
                    String st = suf + Character.toString(c);
                    if (st.endsWith("AGC") || st.endsWith("ACG") || st.endsWith("GAC")) {
                        continue;
                    } if (st.endsWith("GC") && st.charAt(0) == 'A') {
                        continue;
                    } if(st.endsWith("C") && st.startsWith("AG")){
                        continue;
                    }
                    else {
                        String suf2 = st.substring(1, 4);
                        int cnt = (countBySuffix2.getOrDefault(suf2, 0) + countBySuffix.get(suf)) % MOD;
                        countBySuffix2.put(suf2, cnt);
                    }
                }
            }
            countBySuffix = countBySuffix2;
        }

        long total = 0L;
        for (String sf : countBySuffix.keySet()) {
//            System.out.println(sf + ":" + countBySuffix.get(sf));
            total = (total + countBySuffix.get(sf)) % MOD;
        }
        System.out.println(total);
    }


    static class CustomReader extends BufferedReader {

        private static final int DEFAULT_BUF_SIZE = 2048;
        // private static final int DEFAULT_BUF_SIZE = 4096;
        // private static final int DEFAULT_BUF_SIZE = 8192;
        //private static final int DEFAULT_BUF_SIZE = 16384;
        // private static final int DEFAULT_BUF_SIZE = 1048576;

        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in), DEFAULT_BUF_SIZE);
        }

        public int[] readLineAsIntArray() throws IOException {
            String[] strArray = this.readLine().split(" ");
            int[] intArray = new int[strArray.length];
            for (int i = 0, n = strArray.length; i < n; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            return intArray;
        }

        public int[][] readAsIntMatrix(int rows, int columns) throws IOException {
            int[][] matrix = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                String[] r = this.readLine().split(" ");
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = Integer.parseInt(r[j]);
                }
            }
            return matrix;
        }
    }
}