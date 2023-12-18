import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        if ((b - a) % 2l == 0) {
            System.out.println((b - a) / 2l);
            return;
        }

        long res = n - a;

        res = Math.min(res, b - 1l);
        res = Math.min(res, a + (1l + b - a) / 2);
        res = Math.min(res, (n - b + 1l) + (n - a + n - b + 1l) / 2);

        System.out.println(res);
    }
}
