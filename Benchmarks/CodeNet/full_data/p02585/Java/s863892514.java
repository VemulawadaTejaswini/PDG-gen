import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] p = new int[n];
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextLong();
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            long max = 0;
            long s = 0;
            int x = i;
            for (int j = 0; j < k; j++) {
                x = p[x] - 1;
                s += c[x];
                max = Math.max(max, s);
            }
            ans = Math.max(ans, max);
        }
        if (ans == 0) {
            System.out.println(c[0]);
        } else {
            System.out.println(ans);
        }
    }

}
