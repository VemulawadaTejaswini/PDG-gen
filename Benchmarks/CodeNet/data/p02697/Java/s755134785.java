import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        if (n % 2 == 1) {
            for (int i = 0; i < m; i++) {
                System.out.println((i + 1) + " " + (2 * m - i));
            }
        } else {
            System.out.println(1 + " " + (2 * m + 1));
            for (int i = 1; i < m; i++) {
                System.out.println((i + 1) + " " + (2 * m - i));
            }
        }
    }
}