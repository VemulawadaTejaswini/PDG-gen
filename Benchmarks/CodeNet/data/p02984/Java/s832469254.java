import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt() * 2;
        }

        long sum= 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            } else {
                sum = sum - arr[i];
            }
        }

        int[] ans = new int[n];
        ans[0] = (int) sum / 2;

        for (int i = 1; i < n; i++) {
            ans[i] = arr[i - 1] - ans[i - 1];
        }

        System.out.print(ans[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(" " + ans[i]);
        }

    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
