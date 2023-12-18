import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());

        if (k <= a + b) {
            System.out.println(a);
        } else {
            System.out.println(a - (k - a - b));
        }

        sc.close();
    }
}