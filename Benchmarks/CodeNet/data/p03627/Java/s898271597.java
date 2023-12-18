import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            long index = scan.nextLong();
            a[i] = index;
        }
        Arrays.sort(a);
        long max = 0;
        for (int i = n - 1; i > 0; i--) {
            if (a[i] == max)
                continue;
            if (a[i] == a[i - 1]) {
                if (max == 0) {
                    max = a[i];
                } else {
                    System.out.println(max * a[i]);
                    return;
                }
            }
        }
        System.out.println(0);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
