import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int l = scanner.nextInt();

        final int first = l;
        final int last = l + n - 1;
        final int sum = n * (2 * l + (n - 1)) / 2;

        if (first <= 0 && last >= 0) {
            System.out.println(sum);
        } else {
            if (Math.abs(first) < Math.abs(last)) {
                System.out.println(sum - first);
            } else {
                System.out.println(sum - last);
            }
        }
    }
}