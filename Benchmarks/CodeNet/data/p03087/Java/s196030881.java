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
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') {
                arr[i] = arr[i - 1] + 1;
            } else {
                arr[i] = arr[i - 1];
            }
        }

        String[] arrS = new String[q];
        for (int i = 0; i < q; i++) {
            arrS[i] = Integer.toString(arr[r[i] - 1] - arr[l[i] - 1]);
        }

        // 出力
        String result = String.join("\n", arrS);
        System.out.println(result);
    }
}
