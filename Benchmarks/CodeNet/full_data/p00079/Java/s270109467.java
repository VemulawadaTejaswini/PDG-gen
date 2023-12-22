import java.io.*;

public class Main {


    static double s(double a, double b, double c, double d) {
        return Math.abs(a * d - b * c) / 2;
    }

    static double[] p(String s) {
        String[] r = s.split(",");
        return new double[]{
                Double.parseDouble(r[0]),
                Double.parseDouble(r[1])
        };
    }

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] o = p(br.readLine());
        double[] a = p(br.readLine());
        double sum = 0.0;
        String line;
        while ((line = br.readLine()) != null) {
            double[] b = p(line);
            sum += s(a[0] - o[0], a[1] - o[1], b[0] - o[0], b[1] - o[1]);
            a[0] = b[0];
            a[1] = b[1];
        }
        System.out.println(sum);
    }
}