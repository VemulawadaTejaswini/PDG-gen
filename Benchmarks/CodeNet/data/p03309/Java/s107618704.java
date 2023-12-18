import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt() - (i + 1);
        }

        Arrays.sort(a);

        // determine the median
        int median;
        if (a.length % 2 == 0) {
            median = a[a.length / 2 - 1];
        } else {
            median = a[a.length / 2];
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += Math.abs(a[i] - median);
        }

        out.println(ans);
    }
}