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
        String line = null;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            double target = Double.parseDouble(line);
            int n = 2;
            while (true) {
                double v = Math.sqrt(98 * n - 98);
                if (v >= target) {
                    break;
                }
                n++;
            }
            out.println(n);
        }
    }
}