import java.util.*;
import java.lang.*;

/**
 * SumOfInteger
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out_of_loop: while (true) {
            int n = Integer.parseInt(sc.next());
            int s = Integer.parseInt(sc.next());

            if (n == 0 && s == 0) {
                break out_of_loop;
            }

            System.out.println(dfs(n, s, 0, 0, -1));
        }

        sc.close();
    }

    private static int dfs(int maxdepth, int target, int sum, int depth, int lastNum) {

        // System.out.println("depth:" + depth + " sum:" + sum);
        if (depth == maxdepth) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int ans = 0;

        for (int i = 0; i < 10; i++) {
            if (lastNum < i) {
                ans += dfs(maxdepth, target, sum + i, depth + 1, i);
            }
        }

        return ans;
    }
}
