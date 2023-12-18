import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int[] array = Arrays.stream(a).filter(i -> i % 2 == 0).mapToInt(i -> i).toArray();
        int result = 0;
        for (int num : array) {
            while (num % 2 == 0) {
                num /= 2;
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
