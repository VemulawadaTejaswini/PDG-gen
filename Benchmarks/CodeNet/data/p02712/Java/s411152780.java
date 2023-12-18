import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int result = 0;
        for (int i = 1; i < N + 1; i++) {
            if ((i % 15 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            result += i;
        }
        System.out.println(result);
    }
}