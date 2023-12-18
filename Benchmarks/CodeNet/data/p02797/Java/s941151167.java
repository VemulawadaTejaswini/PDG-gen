import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        String[] nums = new String[n];
        if (k <= n) {
            for (int i = 0; i < n; i++) {
                if (i < k) {
                    nums[i] = Integer.toString(s);
                } else {
                    nums[i] = Integer.toString(s + 1);
                }
            }
        } else if (k <= (n - 1) * 2) {
            int diff = k - n;
            nums[0] = Integer.toString(s);
            for (int i = 1; i < n; i++) {
                if (0 < diff) {
                    nums[i] = Integer.toString(0);
                    diff--;
                } else {
                    nums[i] = Integer.toString(s);
                }
            }
        } else {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <= n / 2; i++) {
                list.add((n - i) * (i + 1) + 1);
            }
            int index = list.indexOf(k);
            for (int i = 0; i < n; i++) {
                if (index == i) {
                    nums[i] = Integer.toString(s);
                } else {
                    nums[i] = Integer.toString(0);
                }
            }
        }

        String result = String.join(" ", nums);

        // 出力
        System.out.println(result);
    }
}
