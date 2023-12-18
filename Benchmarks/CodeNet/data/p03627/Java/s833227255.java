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
        Arrays.sort(a);
        List<Integer> list = Arrays.asList(a);
        int max = list.get(list.size() - 1);
        int side1 = 0;
        int side2 = 0;
        for (int i = max; 0 < i; i--) {
            if (list.indexOf(i) != list.lastIndexOf(i)) {
                if (side1 == 0) {
                    side1 = i;
                } else {
                    side2 = i;
                }
            }
            if (side1 != 0 && side2 != 0) {
                break;
            }
        }

        int result = side1 * side2;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
