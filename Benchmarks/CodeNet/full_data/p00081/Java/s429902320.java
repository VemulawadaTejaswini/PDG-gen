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
            String[] values = line.split(",");
            double x1 = Double.parseDouble(values[0]);
            double y1 = Double.parseDouble(values[1]);
            double x2 = Double.parseDouble(values[2]);
            double y2 = Double.parseDouble(values[3]);
            double xq = Double.parseDouble(values[4]);
            double yq = Double.parseDouble(values[5]);
            double xr = -xq;
            double yr = yq;
            if (x1 != x2) {
                double a = (y2 - y1) / (x2 - x1);
                xr = -2.0 * a / (1 + a * a) * (y1 - yq - a * (x1 - xq)) + xq;
                yr = 2.0 / (1 + a * a) * (y1 - yq - a * (x1 - xq)) + yq;
            }
            out.println(xr + " " + yr);
        }
    }
}