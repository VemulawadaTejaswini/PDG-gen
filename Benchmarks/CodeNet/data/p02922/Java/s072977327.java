import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b == 1) {
            System.out.println(0);
            System.exit(0);
        }

        for (int i = 1; i < 1_000_000_000; i++) {
            if ((a + (a - 1) * (i - 1)) >= b) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}
