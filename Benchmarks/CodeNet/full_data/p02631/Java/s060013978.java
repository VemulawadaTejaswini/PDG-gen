import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(f.readLine());
        int[] ar = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int current = 1;
        int[] values = new int[n];
        for (int i = 0; current <= 1000000000; current *= 2) {
            int numOfHaveBit = 0;
            for (int j = 0; j < n; j++) {
                if ((ar[j] & current) != 0) {
                    numOfHaveBit++;
                }
            }
            if (numOfHaveBit == 0) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (numOfHaveBit % 2 == 0) {
                    if ((ar[j] & current) != 0) {
                        values[j] += current;
                    }
                } else {
                    if ((ar[j] & current) == 0) {
                        values[j] += current;
                    }
                }
            }
        }

        out.print(values[0]);
        for (int i = 1; i < n; i++) {
            out.print(" ");
            out.print(values[i]);
        }

        out.close();
    }
}
