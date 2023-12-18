import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int count = 0;
        if (a == b) {
            count++;
        }
        if (a == c) {
            count++;
        }
        if (b == c) {
            count++;
        }
        System.out.println(count == 1 ? "Yes" : "No");
    }
}