
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[][] arrs = new int[n][2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arrs[i] = new int[]{x, y};
        }

        long[] arr = new long[n];
        long[] arr2 = new long[n];
        for (int i = 0; i < n; i++) {
            long x = arrs[i][0];
            long y = arrs[i][1];
            arr[i] = x + y;
            arr2[i] = x - y;
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Math.max(arr[n - 1] - arr[0], arr2[n - 1] - arr2[0]));

        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
