import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();

        int[] diffs = new int[n];
        for (int i = 0; i < n; i++) {
            diffs[i]= Math.abs(x - in.nextInt());
        }

        int gcd = diffs[0];
        for (int i = 1; i < diffs.length; i++) {
            gcd = gcd(gcd, diffs[i]);
        }

        System.out.println(gcd);

    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
