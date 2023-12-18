import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int P = scanner.nextInt();

        int fragment = A * 3 + P;
        int ans = fragment / 2;
        System.out.println(ans);

    }
}