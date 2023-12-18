import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()) - 1);
        sc.close();

        // 主処理
        List<Integer> pushed = new ArrayList<>();
        int index = 0;
        int count = 0;
        while (index != 1) {
            if (a[index] == 0) {
                break;
            }
            int temp = a[index];
            a[index] = 0;
            index = temp;
            count++;
        }

        boolean judge = index == 1;
        int result = judge ? count : -1;

        // 出力
        System.out.println(result);
    }
}
