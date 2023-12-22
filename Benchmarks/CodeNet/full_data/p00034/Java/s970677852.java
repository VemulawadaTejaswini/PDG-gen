import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

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
            String[] values = line.split(",");
            double[] distances = new double[11];
            for (int i = 0; i < 10; i++) {
                distances[i + 1] = distances[i] + Double.parseDouble(values[i]);
            }
            int v1 = Integer.parseInt(values[10]);
            int v2 = Integer.parseInt(values[11]);
            double d1 = distances[10] * v1 / (v1 + v2);
            int result = Arrays.binarySearch(distances, d1);
            if (result < 0) {
                result = -result - 1;
            }
            out.println(result);
        }
    }
}