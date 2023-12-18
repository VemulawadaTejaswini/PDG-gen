import java.util.Scanner;

public class abc125_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();

        System.out.println((t / a) * b);
    }
}
