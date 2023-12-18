

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final int n = sc.nextInt();
            final int k = sc.nextInt();
            final String s = sc.next();

            List<Integer> nums = new ArrayList<Integer>();
            int now = 1; // これにより、numsの最初の要素は必ず1に対応する（文字列の最初の要素が1でないときでも）
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == (char) ('0' + now)) {
                    count += 1;
                } else {
                    nums.add(count);
                    now = 1 - now; // now ^= 1もあり
                    count = 1;
                }
            }
            nums.add(count);
            // numsの末尾も1に対応させたいので、0対応で終わっていたら（数が偶数個なら）1に対応する要素を追加（実際は存在しないので数は0）
            if (nums.size() % 2 == 0) {
                nums.add(0);
            }
            // しゃくとり法
            int ans = 0;
            int add = 2 * k + 1;
            int left = 0;
            int right = 0;
            int temp = 0; // [left, right)
            for (int i = 0; i < nums.size(); i += 2) {
                int nextLeft = i;
                int nextRight = Math.min(nextLeft + add, nums.size());
                while (nextLeft > left) {
                    temp -= nums.get(left);
                    left++;
                }
                while (nextRight > right) {
                    temp += nums.get(right);
                    right++;
                }
                ans = Math.max(ans, temp);
            }
            System.out.println(ans);
        }
    }

}
