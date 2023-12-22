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
            double weight = Double.parseDouble(line);
            for (int i = 0; i < limits.length; i++) {
                if (weight <= limits[i]) {
                    out.println(names[i]);
                    break;
                }
            }
        }
    }

    private static final double[] limits = { 48.00, 51.00, 54.00, 57.00, 60.00,
            64.00, 69.00, 75.00, 81.00, 91.00, Double.MAX_VALUE };

    private static final String[] names = { "light fly", "fly", "bantam",
            "feather", "light", "light welter", "welter", "light middle",
            "middle", "light heavy", "heavy" };
}