
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String line = scanner.nextLine();
        final long k = scanner.nextLong();

        long cost = 0;
        boolean flag = line.charAt(0) == line.charAt(line.length() - 1);
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) != line.charAt(i + 1)) {
                continue;
            }

            if (i == line.length() - 1) {
                flag = false;
            }
            cost++;
            i++;
        }

        System.out.println(cost * k + (flag ? k - 1 : 0));
    }
}
