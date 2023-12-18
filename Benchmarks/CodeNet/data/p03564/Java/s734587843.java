import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int result = 1;
        for (int j = 0; j < N; j++) {
            if (result * 2 > result + K) {
                result = result + K;
            } else {
                result = result * 2;
            }
        }

        System.out.print(result);
    }
}