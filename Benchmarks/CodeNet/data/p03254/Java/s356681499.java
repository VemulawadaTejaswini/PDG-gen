import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int count = 0;
        int remain = x;
        Arrays.sort(a);
        for (int num : a) {
            if (num <= remain) {
                remain -= num;
                count++;
            } else {
                break;
            }
        }
        Arrays.sort(a, Collections.reverseOrder());
        for (int num : a) {
            if (num <= remain) {
                count--;
            }
            while (num <= remain) {
                remain -= num;
            }
        }

        int result = remain == 0 ? count : 0;

        // 出力
        System.out.println(result);
    }
}
