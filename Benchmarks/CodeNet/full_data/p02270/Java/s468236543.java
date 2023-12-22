import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) w[i] = scanner.nextInt();

        long left = 0;
        long right = IntStream.of(w).sum() + 1;
        long result = -1;
        while (left < right) {
            long mid = (left + right) / 2;
            if (check(w,  k,  mid)) {
                result = mid;
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(result);
    }

    private static boolean check(int[] w, int k, long p) {
        int i = 0;
        for (int j = 0; j < k; j++) {
            int k_w = 0;
            while (k_w + w[i] <= p) {
                k_w += w[i];
                i++;
                if (i == w.length) return true;
            }
        }
        return false;
    }

}

