import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[] { 4, 6, 9, 11 }));
        boolean isSameGroup = false;
        if (x == 2 || y == 2) {
            isSameGroup = false;
        } else if (list.contains(x) && list.contains(y)) {
            isSameGroup = true;
        } else if (!list.contains(x) && !list.contains(y)) {
            isSameGroup = true;
        }
        String result = isSameGroup ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
