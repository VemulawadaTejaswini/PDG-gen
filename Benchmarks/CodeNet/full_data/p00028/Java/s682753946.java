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
        int[] counts = new int[101];
        int max = 0;
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            int n = Integer.parseInt(line);
            max = Math.max(++counts[n], max);
        }
        for (int i = 1; i <= 100; i++) {
            if (counts[i] == max) {
                out.println(i);
            }
        }
    }
}