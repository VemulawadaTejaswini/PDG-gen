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
            String[] values = line.split(" ");
            double xa1 = Double.parseDouble(values[0]);
            double ya1 = Double.parseDouble(values[1]);
            double xa2 = Double.parseDouble(values[2]);
            double ya2 = Double.parseDouble(values[3]);
            double xb1 = Double.parseDouble(values[4]);
            double yb1 = Double.parseDouble(values[5]);
            double xb2 = Double.parseDouble(values[6]);
            double yb2 = Double.parseDouble(values[7]);
            String result = "YES";
            if (xa2 < xb1 || xb2 < xa1 || ya2 < yb1 || yb2 < ya1) {
                result = "NO";
            }
            out.println(result);
        }
    }
}