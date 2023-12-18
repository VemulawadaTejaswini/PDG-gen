import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int count = 1;
        Boolean isIncrease = null;
        for (int i = 1; i < n - 1; i++) {
            int left = a[i - 1];
            int right = a[i + 1];
            int center = a[i];

            if (isIncrease == null) {
                isIncrease = left == center ? null : left < center;
            }

            if (isIncrease != null) {
                if (isIncrease && right < center) {
                    count++;
                    isIncrease = null;
                    i++;

                } else if (!isIncrease && center < right) {
                    count++;
                    isIncrease = null;
                    i++;

                }
            }
        }
        int result = count;

        // 出力
        System.out.println(result);
    }
}
