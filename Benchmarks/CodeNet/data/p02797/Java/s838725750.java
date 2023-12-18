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
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < k) {
                nums[i] = s;
            } else {
                nums[i] = s + 1;
            }
        }

        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.toString(nums[i]);
        }

        String result = String.join(" ", array);

        // 出力
        System.out.println(result);
    }
}
