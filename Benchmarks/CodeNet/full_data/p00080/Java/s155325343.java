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
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            double q = Double.parseDouble(line);
            if (q == -1.0) {
                break;
            }
            double x = q * 0.5;
            double eps = 0.00001 * q;
            while (true) {
                double xx = x * x;
                double xxx = xx * x;
                if (Math.abs(xxx - q) < eps) {
                    break;
                }
                x -= (xxx - q) / (3.0 * xx);
            }
            out.println(String.format("%.6f", x));
        }
    }
}