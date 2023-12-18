import java.util.Scanner;

public class E {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        int r = N - K;
        System.out.println(r / (K - 1) + 1 + (r % (K - 1) != 0 ? 1 : 0));
    }

}
