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
            double xmin = xa1;
            double xmax = xa2;
            if (xa1 > xa2) {
                xmin = xa2;
                xmax = xa1;
            }
            double ymin = ya1;
            double ymax = ya2;
            if (ya1 > ya2) {
                ymin = ya2;
                ymax = ya1;
            }
            String result = "NO";
            if ((xb1 >= xmin && xb1 <= xmax) || (xb2 >= xmin && xb2 <= xmax)) {
                if ((yb1 >= ymin && yb1 <= ymax)
                        || (yb2 >= ymin && yb2 <= ymax)) {
                    result = "YES";
                }
            }
            out.println(result);
        }
    }
}