import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    private static FastScanner input;
    private static PrintWriter output;

    public static void main(String[] args) throws IOException {
//        openFile();
        openConsole();
        int n = readInt();
        int start = readInt();
        int end = readInt();
        boolean isFound = false;
        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                output.println("OK");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            output.println("NG");
        }
        closeReader();
    }


    private static void solveC() throws IOException {
        int numTest = readInt();
        for (int i = 0; i < numTest; i++) {
            int a = readInt();
            int b = readInt();
            int c = readInt();
            int aRes = 0, bRes = 0, cRes = 0, count = Integer.MAX_VALUE;
            for (int aIter = 1; aIter <= 2 * a; aIter++) {
                for (int bIter = aIter; bIter <= 2 * b; bIter += aIter) {
                    int cLow = bIter * (c / bIter);
                    int cHigh = cLow + bIter;
                    int aAndBDist = Math.abs(aIter - a) + Math.abs(bIter - b);
                    int firstSum = aAndBDist + Math.abs(cLow - c);
                    int secondSum = aAndBDist + Math.abs(cHigh - c);
                    if (firstSum < count) {
                        aRes = aIter;
                        bRes = bIter;
                        cRes = cLow;
                        count = firstSum;
                    }
                    if (secondSum < count) {
                        aRes = aIter;
                        bRes = bIter;
                        cRes = cHigh;
                        count = secondSum;
                    }
                }
            }
            output.println(count);
            output.println(aRes + " " + bRes + " " + cRes);
        }
    }

    private static String readString() throws IOException {
        return input.nextLine();
    }

    private static int readInt() throws IOException {
        return input.nextInt();
    }

    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private static void openConsole() {
        input = new FastScanner(System.in);
        output = new PrintWriter(System.out);
    }

    private static void openFile() throws FileNotFoundException {
        ClassLoader classLoader = Main.class.getClassLoader();
        File myFile = new File(classLoader.getResource("input.txt").getFile());
        input = new FastScanner(new FileInputStream(myFile));
        output = new PrintWriter(System.out);
    }

    private static void closeReader() {
        output.flush();
        output.close();
    }

    static class Pair {
        int id, count;

        Pair(Integer id, Integer count) {
            this.id = id;
            this.count = count;
        }
    }

    static class FastScanner {
        StringTokenizer st;
        BufferedReader br;

        FastScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        private String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        boolean hasNext() throws IOException {
            return br.ready() || (st != null && st.hasMoreTokens());
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }

        boolean hasNextLine() throws IOException {
            return br.ready();
        }
    }
}
