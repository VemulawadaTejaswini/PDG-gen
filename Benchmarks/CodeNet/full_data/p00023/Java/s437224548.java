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
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] values = reader.readLine().split(" ");
            double xa = Double.parseDouble(values[0]);
            double ya = Double.parseDouble(values[1]);
            double ra = Double.parseDouble(values[2]);
            double xb = Double.parseDouble(values[3]);
            double yb = Double.parseDouble(values[4]);
            double rb = Double.parseDouble(values[5]);
            double x = xb - xa;
            double y = yb - ya;
            double d = Math.sqrt(x * x + y * y);
            int result = 0;
            if (d <= ra + rb) {
                if (d <= ra - rb) {
                    result = 2;
                } else if (d <= rb - ra) {
                    result = -2;
                } else {
                    result = 1;
                }
            }
            out.println(result);
        }
    }
}