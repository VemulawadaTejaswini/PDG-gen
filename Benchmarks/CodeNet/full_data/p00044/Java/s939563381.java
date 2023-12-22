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
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            int n = Integer.parseInt(line);
            boolean[] sieve = new boolean[50022];
            for (int i = 2; i < Math.sqrt(n) + 1; i++) {
                if (sieve[i]) {
                    continue;
                }
                for (int j = i * 2; j < sieve.length; j += i) {
                    sieve[j] = true;
                }
            }
            for (int i = n - 1; i >= 2; i--) {
                if (!sieve[i]) {
                    out.print(i);
                    break;
                }
            }
            for (int i = n + 1; i < sieve.length; i++) {
                if (!sieve[i]) {
                    out.println(" " + i);
                    break;
                }
            }

        }
    }
}