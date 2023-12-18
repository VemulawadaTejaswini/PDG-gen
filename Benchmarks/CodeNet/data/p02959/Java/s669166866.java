

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = IntStream.range(0, n + 1).map(i -> sc.nextInt()).toArray();
        int[] b = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();

        int ans = 0;
        for (int i = 0; i < n; i++ ) {
            if (b[i] >= a[i]) {
                ans += a[i];
                if (b[i] - a[i] >= a[i + 1]) {
                    ans += a[i + 1];
                    a[i + 1] = 0;
                } else {
                    ans += b[i] - a[i];
                    a[i + 1] -= b[i] - a[i];
                }
            } else {
                ans += b[i];
                a[i] -= b[i];
            }
        }

        System.out.println(ans);
        sc.close();
    }
}