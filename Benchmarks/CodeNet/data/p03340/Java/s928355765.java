import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(N, A));
    }

    /**
     * https://drken1215.hatenablog.com/entry/2018/06/26/125054
     * @param N
     * @param A
     * @return
     */
    private static long solve(int N, int[] A) {
        long ans = 0;
        int sum = 0;
        int right = 0;

        for (int left=0; left<N; left++) {
            while (right < N && (sum ^ A[right]) == (sum + A[right])) {
                sum += A[right++];
            }

            ans += right - left;
            if (left == right) {
                right++;
            } else {
                sum -= A[left];
            }
        }


        return ans;
    }
}