import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sqrtN = (int) Math.floor(Math.sqrt(N));
        int[] cnt = new int[N];


        for (int x = 1; x < sqrtN; x++) {
            for (int y = 1; y < sqrtN; y++) {
                for (int z = 1; z < sqrtN; z++) {
                    int n = x * x +
                            y * y +
                            z * z +
                            x * y +
                            y * z +
                            z * x;

                    if (n > cnt.length) continue;
                    cnt[n - 1]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(cnt[i]);
        }
    }
}
