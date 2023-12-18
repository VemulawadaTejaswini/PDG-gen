import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if ((b - a) % 2 == 0) {
            System.out.println((b - a) / 2);
            return;
        }
        System.out.println(Math.min(Math.max(a - 1, b - 1), Math.max(n - a, n - b)));
    }

}
