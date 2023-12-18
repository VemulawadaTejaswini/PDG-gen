import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int L = sc.nextInt();

        final int d = L / 3;

        if (L%3 == 0) {
            System.out.println(d * d * d);
        }
        if (L%3 == 1) {
            System.out.println(d * d * (d+1));
        }
        if (L%3 == 2) {
            System.out.println(d * (d+1) * (d+1));
        }
    }
}
