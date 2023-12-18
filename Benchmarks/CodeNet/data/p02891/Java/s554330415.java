
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String line = scanner.nextLine();
        final long k = scanner.nextLong();

        long cost = 0;
        boolean flag = false;
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) != line.charAt(i + 1)) {
                continue;
            }

            flag = i == line.length() - 1;
            cost++;
            i++;
        }

        System.out.println(cost * k + (flag ? k - 1 : 0));
    }
}
