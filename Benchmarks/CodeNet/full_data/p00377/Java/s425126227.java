import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < c; i++) {
            sum += sc.nextInt();
        }

        System.out.println((sum % (n + 1) == 0) ? sum / (n + 1) : sum / (n + 1) + 1);
    }
}
