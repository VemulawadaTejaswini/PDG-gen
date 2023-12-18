import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long A = sc.nextLong();
        long B = sc.nextLong();

        long ans = xorToX(A - 1) ^ xorToX(B);

        System.out.println(ans);
    }

    private static long xorToX(long A) {
        if (A <= 0) return 0;
        A++;
        long ans = 0;
        for (int i = 0; i <= 50; i++) {
            long loop = (1l << (i + 1));
            long numOfOne = (A / loop) * (loop / 2) + Math.max(0, (A % loop) - (loop / 2));
            if (numOfOne % 2 == 1) {
                ans += (1l << i);
            }
        }
        return ans;
    }
}