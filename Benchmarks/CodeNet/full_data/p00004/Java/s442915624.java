import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inData;
        while ((inData = br.readLine()) != null && !"".equals(inData)) {
            String[] abcdefList = inData.split(" ");
            double[] in = new double[6];
            for (int i = 0; i < 6; i++) {
                in[i] = Double.parseDouble(abcdefList[i]);
            }
            double x = (in[1] * in[5] - in[2] * in[4]) / (in[1] * in[3] - in[0] * in[4]);
            double y = (in[2] - in[0] * x) / in[1];
            x = ((int) x == 0) ? 0.0 : x;
            y = ((int) y == 0) ? 0.0 : y;
            System.out.printf("%.3f ", x);
            System.out.printf("%.3f\n", y);
        }
    }
}