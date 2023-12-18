import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            double ans = 0;
            for (int i = 0; i < n; i++) {
                double num = Double.parseDouble(br.readLine());
                if (i == 0) {
                    ans = num;
                } else {
                    ans = lcm(ans, num);
                }
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
