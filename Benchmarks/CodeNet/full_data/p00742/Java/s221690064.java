import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    final double EPS = 1.0e-10;
    final int INF = 1 << 28;
    boolean used[];
    int nums[];
    String[] strs;
    Character[] cs;
    int ans;
    int[] cf;
    boolean init[];

    void run() {
        Scanner sc = new Scanner(System.in);
        int[] pow10 = new int[8];
        pow10[0] = 1;
        for (int i = 1; i < pow10.length; i++) {
            pow10[i] = pow10[i - 1] * 10;
        }
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            strs = new String[n];
            Set<Character> set = new HashSet<Character>();
            for (int i = 0; i < n; i++) {
                strs[i] = sc.next();
                char[] tmp = strs[i].toCharArray();
                for (int j = 0; j < tmp.length; j++) {
                    set.add(tmp[j]);
                }
            }
            init = new boolean[256];
            for (int i = 0; i < n; i++) {
                if (strs[i].length() < 2)
                    continue;
                init[strs[i].charAt(0)] = true;

            }
            cs = new Character[set.size()];
            cs = set.toArray(cs);

            cf = new int[256];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < strs[i].length(); j++) {
                    if (i == n - 1) {
                        cf[strs[i].charAt(j)] -= pow10[strs[i].length() - 1 - j];
                    } else
                        cf[strs[i].charAt(j)] += pow10[strs[i].length() - 1 - j];
                }
            }
            nums = new int[cs.length];
            used = new boolean[10];
            ans = 0;
            permutation(0, 9, cs.length, 0);
            System.out.println(ans);
        }
    }

    void permutation(int pos, int n, int k, int sum) {
        if (pos == k) {
            if (sum == 0) {
                ans++;
            }
            return;
        }

        for (int i = 0; i <= n; i++) {
            if (used[i])
                continue;
            if (i == 0 && init[cs[pos]])
                continue;
            nums[pos] = i;
            used[i] = true;
            permutation(pos + 1, n, k, sum + i * cf[cs[pos]]);
            used[i] = false;
        }
        return;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}