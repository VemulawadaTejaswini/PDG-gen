import java.util.*;

public class Main {
    public void main(Scanner sc) {
        long k = sc.nextLong();

        int n = 50;
        long a[] = new long[n];

        long t = k / n;
        int mod = (int) (k % n);
        for (int i = 0; i < n - mod; i++) {
            a[i] = n + t - 1 - mod;
        }
        for (int i = n - mod; i < n; i++) {
            a[i] = 2 * n + t - mod;
        }

        System.out.println(n);
        System.out.println(Arrays.toString(a).replaceAll("\\[|\\]|,", ""));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
