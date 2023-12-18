import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] t = new long[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextLong();
        }

        long gcm = t[0];
        for (int i = 1; i < n; i++) {
            long lcm = calcLcm(gcm, t[i]);
            gcm = gcm  / (lcm) * t[i];
        }
        System.out.println(gcm);
    }

    private static long calcLcm(long a, long b) {
        if (b == 0) {
            return a;
        }

        return calcLcm(b, a%b);
    }
}
