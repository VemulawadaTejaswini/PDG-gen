import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.00000000");
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int n = Integer.parseInt(input);
            String[] st = br.readLine().split(" ");
            double sum = 0;
            double[] s = new double[n];
            for (int i = 0; i < n; i++) {
                sum += s[i] = Double.parseDouble(st[i]);
            }
            double m = sum / (double) n;
            double result = 0;
            for (int i = 0; i < n; i++) {
                result += Math.pow(s[i] - m, 2);
            }
            bw.append(df.format(Math.sqrt(result / (double) n)) + "\n");
        }
        bw.flush();
    }


}

