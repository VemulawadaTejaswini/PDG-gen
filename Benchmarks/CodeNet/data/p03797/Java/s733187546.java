import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        if (m <= 2 * n) {
            System.out.println(n);
        } else {
            System.out.println(n + (m - 2 * n) / 4);
        }

    }
}
