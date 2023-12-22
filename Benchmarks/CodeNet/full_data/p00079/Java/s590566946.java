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
        double[][] points = new double[21][2];
        int n = 0;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] values = line.split(",");
            points[n][0] = Double.parseDouble(values[0]);
            points[n][1] = Double.parseDouble(values[1]);
            n++;
        }
        points[n][0] = points[0][0];
        points[n][1] = points[0][1];
        double s = 0.0;
        for (int i = 0; i < n; i++) {
            s += 0.5 * (points[i][0] * points[i + 1][1] - points[i + 1][0]
                    * points[i][1]);
        }
        out.println(Math.abs(s));
    }
}