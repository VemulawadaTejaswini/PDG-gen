import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        double b100 = b * 100L;
        long b100long = (long) b100;
        long sum = 0;
        long sum2 = 0;
        for (int i = 0; i < b100long; i++) {
            if (sum >= Long.MAX_VALUE - a) {
                sum2 = sum;
                sum = 0;
            }
            sum += a;
        }
        long ans = 0;
        long rem1 = sum % 100;
        long rem2 = sum2 % 100;
        if (rem1 + rem2 >= 100) {
            ans++;
        }
        ans += sum / 100 + sum2 / 100;
        System.out.println(ans);
    }

}
