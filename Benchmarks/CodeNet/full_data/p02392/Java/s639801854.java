import java.util.Scanner;

public class Main {

    private final static String YES = "Yes";
    private final static String NO = "No";

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int[] array = { a, b, c };

        for (int i : array) {
            if (0 > i && i > 100) {
                System.exit(0);
            }
        }

        if (a < b && a < c) {
            System.out.println(b < c ? YES : NO);
        } else if (a < c && b < c) {
            System.out.println(a < b ? YES : NO);
        } else {
            System.out.println(NO);
        }

    }
}

