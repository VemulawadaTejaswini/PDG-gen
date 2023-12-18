import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        scanner.nextLine(); // empty string
        final String a = scanner.nextLine();
        final String b = scanner.nextLine();
        final String c = scanner.nextLine();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int result = 0;
        for (int idx = 0; idx < n; idx++) {

            final char charInA = a.charAt(idx);
            final char charInB = b.charAt(idx);
            final char charInC = c.charAt(idx);

            if (charInA == charInB && charInB == charInC) {
                continue;
            } else if (charInA == charInB || charInB == charInC || charInC == charInA) {
                result++;
            } else {
                result += 2;
            }

        }

        System.out.println(result);

    }

}
