import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        for (int i = 0; i <= N; i += 4) {
            for (int j = 0; j <= N; j += 7) {
                if (i + j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}
