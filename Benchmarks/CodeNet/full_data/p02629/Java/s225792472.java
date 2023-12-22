import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        System.out.println(solve(N));
    }

    private static String solve(long N) {
        long[] num = new long[12+1];
        num[0] = 0;
        for (int i=1; i<12; i++) {
            num[i] = (long)Math.pow(26, i) + num[i-1];
            // System.err.println("i=" + i + " : " + num[i]);
        }



        StringBuilder ans = new StringBuilder();
        for (int i=1; i<=12; i++) {
            if (N <= num[i]) {
                // i文字
                N -= num[i-1] + 1;
                for (int k=0; k<i; k++) {
                    int count = (int)(N%26);
                    ans.append((char)(count + 'a'));
                    N /= 26;
                }

                break;
            }
        }

        return ans.reverse().toString();
    }
}