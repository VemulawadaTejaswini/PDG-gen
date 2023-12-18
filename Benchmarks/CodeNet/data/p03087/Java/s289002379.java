import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        String s = sc.next();
        Integer[] l = new Integer[q];
        Integer[] r = new Integer[q];
        for (int i = 0; i < q; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        int len = s.length();
        int[] arr = new int[len + 1];
        for (int i = 0; i <= len; i++) {
            String str = s.substring(0, i);
            int count = (str.length() - str.replace("AC", "").length()) / 2;
            arr[i] = count;
        }

        // 出力
        for (int i = 0; i < q; i++) {
            int result = arr[r[i]] - arr[l[i]];
            System.out.println(result);
        }
    }
}
