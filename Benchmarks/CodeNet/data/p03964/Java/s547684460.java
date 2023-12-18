
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            int c1 = (a + x - 1) / x;
            int c2 = (b + y - 1) / y;

            int max = Math.max(c1, c2);

            a = x * max;
            b = y * max;
        }

        System.out.println(a + b);
    }
}