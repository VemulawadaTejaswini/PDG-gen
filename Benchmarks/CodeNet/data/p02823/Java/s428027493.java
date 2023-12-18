import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        if ((b - a) % 2 == 0) {
            System.out.println((b - a) / 2);
            return;
        }
        if ((n - a) < (b - 1)) {
            System.out.println(n - a);
        } else {
            System.out.println(b - 1);
        }

    }
}
