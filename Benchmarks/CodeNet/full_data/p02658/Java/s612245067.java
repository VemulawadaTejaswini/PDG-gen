import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long[] inputs = new long[N];

        for (int i = 0; i < N; i++) {
            inputs[i] = scanner.nextLong();
        }

        scanner.close();

        long ans = 1l;

        for (int i = 0; i < N; i++) {
            try {
                ans *= inputs[i];
            } catch (Exception e) {
                System.out.println(-1);
                return;
            }
        }

        if (ans > 1000000000000000000l) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
