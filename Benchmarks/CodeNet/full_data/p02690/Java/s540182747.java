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
                int left = list.get(i);
                int right = list.get(j);
                if (left + right == x) {
                    nums[0] = Integer.toString(i);
                    nums[1] = Integer.toString(j * -1);
                }
                if (left - right == x) {
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
