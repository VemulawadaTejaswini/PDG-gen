import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();

        long l = (c - a - b) * (c - a - b);
        long r = 4 * a * b;
        if (l > r) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
