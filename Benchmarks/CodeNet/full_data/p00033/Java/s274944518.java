
import java.util.Arrays;
import java.util.Scanner;

// http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0033
public class Main {

    boolean[] flags;
    int[] nums;
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        flags = new boolean[10];
        for (int i = 0; i < n; i++) {
            nums = new int[10];
            for (int j = 0; j < 10; j++) {
                nums[j] = sc.nextInt();
            }
            System.out.println(dfs(0) ? "YES" : "NO");
        }
    }

    boolean dfs(int index) {
        if (index >= nums.length) {
            return isOk();
        }

        flags[index] = true;
        boolean b1 = dfs(index + 1);
        flags[index] = false;
        boolean b2 = dfs(index + 1);
        return b1 || b2;
    }

    boolean isOk() {
        int l = 0;
        int r = 0;
        for (int i = 0; i < 10; i++) {
            if (flags[i] && l < nums[i]) {
                l = nums[i];
            } else if (!flags[i] && r < nums[i])  {
                r = nums[i];
            } else {
                return false;
            }
        }
        return true;
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }

}

