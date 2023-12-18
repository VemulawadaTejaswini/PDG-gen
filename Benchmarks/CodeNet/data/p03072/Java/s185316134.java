import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a >= max) {
                max = a;
                result++;
            }
        }
        System.out.println(result);
    }
}
