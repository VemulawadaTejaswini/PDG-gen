import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "Impossible";

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean total = ((a + b) % 3 == 0);

        if (a % 3 == 0 || b % 3 == 0 || total) {
            result = "Possible";
        }

        System.out.println(result);

    }
}