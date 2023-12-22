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
            double a = Double.parseDouble(line);
            double s = a;
            for (int i = 2; i <= 10; i++) {
                if (i % 2 == 0) {
                    a *= 2;
                } else {
                    a /= 3;
                }
                s += a;
            }
            out.println(s);
        }
    }
}