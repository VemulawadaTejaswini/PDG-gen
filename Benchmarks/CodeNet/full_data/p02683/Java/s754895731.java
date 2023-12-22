import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(
                    reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static float nextFloat() throws IOException {
        return Float.parseFloat(next());
    }
}

public class Chocolate {
    //static final int MOD=1000000007;
    public static void main(String[] args) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        Reader.init(System.in);
        int test = 1;
        for (int ii = 0; ii < test; ii++) {
            int n = Reader.nextInt();
            int m = Reader.nextInt();
            int x = Reader.nextInt();
            int mat[][] = new int[n][m];
            int cost[] = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = Reader.nextInt();
                for (int j = 0; j < m; j++) {
                    mat[i][j] = Reader.nextInt();
                }
            }
            double ratio[] = new double[n];
            for (int i = 0; i < n; i++) {
                double num = (double) cost[i];
                double denom = 0.0;
                for (int j = 0; j < m; j++) {
                    denom += mat[i][j];
                }
                ratio[i] = num / denom;
                //System.out.println(ratio[i]);
            }
            int ct2 = 0;
            int arr[] = new int[m];
            for (int i = 0; i < m; i++) arr[i] = 0;
            int cos = 0;
            while (ct2 != n) {
                double min = Integer.MAX_VALUE;
                int index = -1;
                for (int i = 0; i < n; i++) {
                    if (Math.min(min, ratio[i]) < min) {
                        min = Math.min(min, ratio[i]);
                        index = i;
                    }
                }
                //System.out.println("min "+min);
                //System.out.println("index "+index);
                ratio[index] = Integer.MAX_VALUE;
                for (int i = 0; i < m; i++) {
                    arr[i] += mat[index][i];
                }
                cos += cost[index];
                //System.out.println("cost "+cos);
                boolean fl = true;
                for (int i = 0; i < m; i++) {
                    if (arr[i] < x) fl = false;
                }
                ct2 += 1;
                if (fl) break;
            }
            if (ct2 == n) System.out.println("-1");
            else System.out.println(cos);
        }
        out.flush();
        out.close();
    }
}

