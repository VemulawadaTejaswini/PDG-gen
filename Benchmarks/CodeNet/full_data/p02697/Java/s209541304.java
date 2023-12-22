import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        if (3 * M <= N) {
            for (int i = 0; i < M; i++) {
                System.out.println((i + 1) + " " + (M + 1 + 2 * i));
            }
        } else {
            for (int i = 0; i < M; i++) {
                System.out.println((i + 1) + " " + (N - i));
            }

        }
    }
}
