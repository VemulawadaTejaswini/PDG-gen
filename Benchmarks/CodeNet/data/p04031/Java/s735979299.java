import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int max = Arrays.stream(a).max().getAsInt();
        int min = Arrays.stream(a).min().getAsInt();

        int[] lowerArray = Arrays.stream(a).filter(c -> c <= (max + min) / 2).toArray();

        int center = ((int) Math.ceil(a.length / 2.0) <= lowerArray.length) ? (max + min) / 2 : (max + min) / 2 + 1;
        int result = 0;
        for (int num : a) {
            int diff = num - center;
            result += diff * diff;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
