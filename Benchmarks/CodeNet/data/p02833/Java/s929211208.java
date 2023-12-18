import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long result = func(n);

        long count = 0;
        while (true) {
            long tmp = result % 10;
            if (tmp != 0) {
                break;
            }
            count++;
            result = result / 10;
        }

        System.out.println(count);
    }

    private static long func(long n) {
        if (n < 2) return 1;
        return n * func(n - 2);
    }
}