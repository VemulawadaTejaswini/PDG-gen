
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class SolutionDp {

    int[][] dp;
    private List<Integer> w;
    private List<Integer> v;

    public int calculate(int n, int weight, List<Integer> w, List<Integer> v) {
        this.v = v;
        this.w = w;

        dp = new int[n][weight];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }

        return calculate(n - 1, weight);
    }

    private int calculate(int pos, int weight) {
        if (dp[pos][weight] != -1) return dp[pos][weight];

        int result;
        if (pos == 0 || weight == 0) {
            result = 0;
        } else if (w.get(pos) > weight) {
            result = calculate(weight, pos - 1);
        } else {
            int no = calculate(weight, pos - 1);
            int yes = v.get(pos) - calculate(weight, pos - 1);

            result = Math.max(no, yes);
        }
        dp[pos][weight] = result;
        return result;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int W = in.nextInt();

        List<Integer> w = new ArrayList<>();
        List<Integer> v = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            w.add(in.nextInt());
            v.add(in.nextInt());
        }

        SolutionDp s = new SolutionDp();
        int result = s.calculate(N, W, w, v);
        System.out.println(result);
    }

}
