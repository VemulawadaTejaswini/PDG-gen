import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        List<Integer> list = new ArrayList<>();
        final int MOD = 1000000007;
        for (int i = 0; Math.pow(i, 5) <= MOD; i++) {
            int num = (int) Math.pow(i, 5);
            list.add(num);
        }

        String[] nums = new String[2];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {

                long left = (long) list.get(i);
                long right = (long) list.get(j);
                long LONG_MOD = (long) MOD;
                long target = (long) x;

                boolean isOverInt = LONG_MOD < left + right;
                if (!isOverInt && left + right == target) {
                    nums[0] = Integer.toString(i);
                    nums[1] = Integer.toString(j * -1);
                }
                if (!isOverInt && left + right == target * -1) {
                    nums[0] = Integer.toString(i * -1);
                    nums[1] = Integer.toString(j);
                }

                if (left - right == target) {
                    nums[0] = Integer.toString(i);
                    nums[1] = Integer.toString(j);
                }

            }
        }
        String result = String.join(" ", nums);

        // 出力
        System.out.println(result);
    }
}
