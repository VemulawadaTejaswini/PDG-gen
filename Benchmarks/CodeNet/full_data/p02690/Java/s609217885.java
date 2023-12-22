
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long[] power = new long[101];
        power[0] = 0;
        for (int i = 1; i <= 100; ++i) {
            power[i] = ((long)i) * i * i * i * i;
        }
        for (int a = -100; a <= 100; ++a) {
            for (int b = -100; b <= 100; ++b) {
                long powerA = power[Math.abs(a)];
                if (a < 0) {
                    powerA *= -1;
                }
                long powerB = power[Math.abs(b)];
                if (b < 0) {
                    powerB *= -1;
                }
                if (powerA - powerB == x) {
                    System.out.println(a + " " + b);
                    return;
                }
            }
        }
    }
}
