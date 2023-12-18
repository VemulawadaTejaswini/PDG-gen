import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] a = new Integer[m];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int[] fibonacci = new int[100001];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < 100001; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        List<Integer> list = new ArrayList<>();
        int index = 0;
        if (0 < a.length) {
            list.add(a[0]);
            index = a[0];
            for (int i = 1; i < a.length; i++) {
                int len = (a[i] - 1) - index;
                index = a[i];
                list.add(len);
            }
        }
        list.add(n - index);

        long result = 1;
        if (list.contains(0)) {
            result = 0;
        } else {
            final long MOD = 1000000007;
            for (int num : list) {
                result *= (long) fibonacci[num - 1];
                result %= MOD;
            }
        }

        // 出力
        System.out.println(result);
    }
}
