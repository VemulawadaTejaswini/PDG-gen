import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inData;
            while ((inData = br.readLine()) != null) {
                String[] abcdefList = inData.split(" ");
                double[] in = new double[6];
                for (int i = 0; i < 6; i++) {
                    in[i] = Double.parseDouble(abcdefList[i]);
                }
                double deno = (in[1] * in[3] - in[0] * in[4]);
                double x = (in[1] * in[5] - in[2] * in[4]) / deno;
                double y = (in[0] * in[5] - in[2] * in[3]) / (deno * -1);
                x = ((int) x == 0) ? 0.0 : x;
                y = ((int) y == 0) ? 0.0 : y;
                System.out.printf("%4.3f %4.3f\n", x, y);
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}