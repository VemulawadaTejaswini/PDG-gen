import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long x = scanner.nextLong();

        long sum = 0;
        for (long i = a; i <= b; i++) {
            if (i % x == 0) {
                sum++;
            }
        }
        System.out.print(sum);
    }
}
