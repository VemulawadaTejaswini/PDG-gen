import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String format = "%.6f %.6f%n";

        while ((line = br.readLine()) != null) {
            String[] input = line.split(",");
            double x1 = Double.parseDouble(input[0]);
            double y1 = Double.parseDouble(input[1]);
            double x2 = Double.parseDouble(input[2]);
            double y2 = Double.parseDouble(input[3]);
            double xq = Double.parseDouble(input[4]);
            double yq = Double.parseDouble(input[5]);

            if (x1 == x2) {
                double x = (x1 - xq) + x1;
                System.out.printf(format, x, yq);
            } else if (y1 == y2) {
                double y = (y1 - yq) + y1;
                System.out.printf(format, xq, y);
            } else {
                double alpha = (y2 - y1) / (x2 - x1);
                double x = (xq - x1 - y1 / alpha) / 2.0;
                double y = -alpha * (x - xq) + yq;
                System.out.printf(format, x, y);
            }

        }
    }
}
