
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > total / (4 * m)) {
                count++;
            }
        }

        System.out.println(count >= m ? "Yes" : "No");

    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
