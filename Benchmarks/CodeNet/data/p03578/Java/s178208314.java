import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] d = new Integer[n];
        Arrays.setAll(d, i -> Integer.parseInt(sc.next()));
        int m = Integer.parseInt(sc.next());
        Integer[] t = new Integer[m];
        Arrays.setAll(t, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        List<Integer> list = new ArrayList<>(Arrays.asList(d));

        boolean judge = true;
        for (int num : t) {
            if (!list.contains(num)) {
                judge = false;
                break;
            } else {
                int index = list.indexOf(num);
                list.remove(index);
            }
        }
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
