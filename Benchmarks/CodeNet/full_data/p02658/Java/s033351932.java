import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        long ans = 1;

        long[] arr = new long[n];

        int cnt = 0;
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextLong();
            if (arr[i] == 0) cnt++;
        }

        if (0<cnt) {
            System.out.println(0);
            return;
        }

        Arrays.sort(arr);

        for (int i=0; i<n; i++) {
            long s = arr[i];
            long tmp = ans * s;
            if ((tmp / ans) != s) {
                System.out.println(-1);
                return;
            }
            ans *= s;
            if ((long)1e18 < ans || ans < 0) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(ans);

    }
}
