import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] lines = br.readLine().split(" ");
        double[] xList = new double[n];
        double[] yList = new double[n];
        int i = n;
        while (i-- > 0) {
            xList[i] = Double.parseDouble(lines[i]);
        }
        i = n;
        lines = br.readLine().split(" ");
        while (i-- > 0) {
            yList[i] = Double.parseDouble(lines[i]);
        }
        double result = 0.0;
        for (i = 1; i < 4; i++) {
            result = 0;
            for (int j = 0; j < n; j++) {
                result += Math.pow(Math.abs(xList[j] - yList[j]), i);
            }
            result = Math.pow(result, 1.0 / i);
            System.out.printf("%f\n", result);
        }
        for (i = 0; i < n - 1; i++) {
            result = Math.max(Math.abs(xList[i] - yList[i]), Math.abs(xList[i + 1] - yList[i + 1]));
        }
        System.out.printf("%f\n", result);
    }
}