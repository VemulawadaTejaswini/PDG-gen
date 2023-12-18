import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();
    }

    int[] nums = new int[4];

    private void solve() {
        String N = sc.next();
        for (int i = 0; i < 4; i++) {
            nums[i] = Character.getNumericValue(N.charAt(i));
        }
        calc(nums[0], 0, String.valueOf(nums[0]));
    }
    boolean flg = false;
    void calc(int sum, int idx, String f) {
        if (flg) {
            return;
        }
        if (idx == 3) {
            if (sum == 7) {
                System.out.println(f + "=7");
                flg = true;
            }
            return;
        }

        calc(sum + nums[idx + 1], idx + 1, f + "+" + nums[idx + 1]);
        calc(sum - nums[idx + 1], idx + 1, f + "-" + nums[idx + 1]);
    }
}
