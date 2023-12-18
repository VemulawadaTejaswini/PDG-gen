import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        List<Long> list = new ArrayList<>();
        for (long i = 0; Math.pow(i, 5) <= Long.MAX_VALUE; i++) {
            long num = (long) Math.pow(i, 5);
            list.add(num);
        }

        String[] nums = new String[2];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {

                long left = (long) list.get(i);
                long right = (long) list.get(j);
                long target = (long) x;

                if (left - right == target) {
                    nums[0] = Integer.toString(i);
                    nums[1] = Integer.toString(j);
                    break;
                }
                if (left + right == target) {
                    nums[0] = Integer.toString(i);
                    nums[1] = Integer.toString(j * -1);
                    break;
                }
                if (left + right == target * -1) {
                    nums[0] = Integer.toString(i * -1);
                    nums[1] = Integer.toString(j);
                    break;
                }
            }
        }
        String result = String.join(" ", nums);

        // 出力
        System.out.println(result);
    }
}
