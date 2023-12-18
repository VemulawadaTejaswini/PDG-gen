import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        Arrays.sort(a, Collections.reverseOrder());
        int side1 = 0;
        int side2 = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                if (side1 == 0) {
                    side1 = a[i];
                    i++;
                } else {
                    side2 = a[i];
                    break;
                }
            }
        }

        int result = side1 * side2;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
