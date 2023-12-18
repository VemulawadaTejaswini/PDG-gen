
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        long L = scanner.nextLong();
        long R = scanner.nextLong();
        if (R - L >= 2018) {
            System.out.println(0);
            return;
        }
        long m1 = L  % 2019;
        long m2 = R % 2019;
        if (m1 > m2) {
            System.out.println(0);
            return;
        }
        long ans = ((m1 % 2019) * ((m1 + 1) % 2019)) % 2019;
        System.out.println(ans);
    }
}
