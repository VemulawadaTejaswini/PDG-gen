import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] spys = new int[N];

        for (int i = 0; i < N; i++) {
            spys[i] = scanner.nextInt();
        }
        scanner.close();

        int ans = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (j - i == spys[i] + spys[j]) {
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }
}
