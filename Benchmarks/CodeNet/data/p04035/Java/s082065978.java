import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long l = scanner.nextLong();
        long[] a = new long[n];
        boolean hasMore = false;
        int keepIndex = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
            if (i > 0 && a[i] + a[i - 1] >= l) {
                hasMore = true;
                keepIndex = i - 1;
            }
        }
        if (!hasMore) {
            System.out.println("Impossible");
            return;
        }

        System.out.println("Possible");
        for (int i = 0; i < keepIndex; i++) {
            System.out.println(i + 1);
        }
        int last = keepIndex + 1;
        for (int i = n - 1; i > last; i--) {
            System.out.println(i);
        }
        System.out.println(last);
    }
}