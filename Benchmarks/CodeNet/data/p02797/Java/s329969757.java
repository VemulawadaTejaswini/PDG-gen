import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());

        // 主処理
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            if (i <= k) {
                array[i] = Integer.toString(s);
            } else {
                array[i] = Integer.toString(s - 1);
            }
        }

        String result = String.join(" ", array);
        // 出力
        System.out.println(result);
        sc.close();
    }
}
