import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        int[][] results = new int[11][331];
        solve(new int[10], 0, 0, results);

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] values = line.split(" ");
            int n = Integer.parseInt(values[0]);
            int s = Integer.parseInt(values[1]);
            if (n > 10 || s > 330) {
                out.println(0);
                continue;
            }
            out.println(results[n][s]);
        }
    }

    private static void solve(int[] indexes, int k, int s, int[][] results) {
        if (k == 10) {
            return;
        }
        for (int i = 0; i < 10; i++) {
            boolean used = false;
            for (int j = 0; j < k; j++) {
                if (indexes[j] == i) {
                    used = true;
                    break;
                }
            }
            if (used) {
                continue;
            }
            indexes[k] = i;
            int t = s + i * (k + 1);
            results[k + 1][t]++;
            solve(indexes, k + 1, t, results);
        }
    }
}