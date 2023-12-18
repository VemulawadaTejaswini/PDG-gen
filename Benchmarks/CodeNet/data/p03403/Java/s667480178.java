import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int pre = a[0];
            for (int j = 1; j < a.length; j++) {
                if (i != j) {
                    int amount = Math.abs(pre - a[j]);
                    pre = a[j];
                    sum += amount;
                }
            }
            list.add(Integer.toString(sum));
        }

        String result = String.join("\n", list);

        // 出力
        System.out.println(result);
    }
}
