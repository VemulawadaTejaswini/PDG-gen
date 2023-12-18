
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long l = scanner.nextLong();
        long[] a = new long[n];
        boolean hasMore = false;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
            if (i > 0 && a[i] + a[i - 1] >= l) {
                hasMore = true;
            }
        }
        if (!hasMore) {
            System.out.println("Impossible");
            return;
        }

        System.out.println("Possible");
        int left = 0;
        int right = n - 1;
        for (int i = 0; i < n-1; i++) {
            if (a[left] < a[right]) {
                System.out.println(left + 1);
                left++;
            } else {
                System.out.println(right);
                right--;
            }
        }
    }
}
