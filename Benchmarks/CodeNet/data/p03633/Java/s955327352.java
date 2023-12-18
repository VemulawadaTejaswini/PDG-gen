import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            double num[] = new double[n];
            for (int i = 0; i < n; i++) {
                num[i] = Double.parseDouble(br.readLine());
            }
            Arrays.sort(num);
            double ans = num[n - 1];
            for (int i = n - 2; i > 0; i--) {
                ans = lcm(ans, num[i]);
            }
            System.out.println((long)ans);
        } catch (IOException e) {
            e.printStackTrace();
           }
    }

    public static double gcd(double a, double b) {
        if (a < b) {
            return gcd(b, a);
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static double lcm(double a, double b) {
        return a * b / gcd(a, b);
    }
}
