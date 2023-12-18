
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] H = new long[N];
        int[] count = new int[N];
        int maxCount = 0;

        for (int i = 0 ; i < N ; i++) {
            H[i] = scanner.nextLong();
        }

        for (int i = N - 2 ; i >= 0 ; i--) {
            if (H[i] >= H[i + 1]) {
                count[i] = count[i + 1] + 1;
            } else {
                count[i] = 0;
            }
            maxCount = Math.max(maxCount, count[i]);
        }

        System.out.println(maxCount);
    }
}
