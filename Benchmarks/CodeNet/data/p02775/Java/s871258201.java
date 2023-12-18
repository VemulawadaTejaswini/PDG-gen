import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        System.out.println(solve(N));

        /*
        int[] ans = {
                0, 1, 2, 3 ,4, 5, 5, 4, 3, 2,
                1, 2, 3, 4, 5, 6, 6, 5, 4, 3,
                2, 3, 4, 5, 6, 7, 7, 6, 5, 4,
                3, 4, 5, 6, 7, 8, 8, 7, 6, 5,
                4, 5, 6, 7, 8, 9, 9, 8, 7, 6,
                5, 6, 7, 8, 9, 10, 9, 8, 7, 6,
                5, 6, 7, 8, 9, 9, 8, 7, 6, 5,
                4, 5, 6, 7, 8, 8, 7, 6, 5, 4,
                3, 4, 5, 6, 7, 7, 6, 5, 4, 3,
                2, 3, 4, 5, 6, 6, 5, 4, 3, 2,
                1
        };
        for (int i=0; i<ans.length; i++) {
            if (solve(String.valueOf(i)) != ans[i]) {
                System.err.println("fail: " + i + " -> " + solve(String.valueOf(i)) + " but expect " + ans[i]);
            }
        }
         */

    }

    private static long solve(String N) {
        long count = 0;

        int[] convert = {
                0, 1, 2, 3 ,4, 5, 4, 3, 2, 1
        };

        int keta = 0;
        for (int i=0; i<N.length(); i++) {
            int val = N.charAt(N.length()-i-1) - '0';

            if (val+keta == 5 && i != N.length()-1) {
                int nextVal = N.charAt(N.length()-i-2) - '0';
                if (nextVal >= 5) {
                    keta = 1;
                    count += 5;

                    continue;
                }
            }

            count += convert[(val+keta)%10];
            if (val+keta >= 6) {
                keta = 1;
            } else {
                keta = 0;
            }
            // System.err.println("val=" + val + ", keta=" + keta + ", count=" + count);
        }
        if (keta == 1) {
            count += 1;
        }

        return count;
    }
}