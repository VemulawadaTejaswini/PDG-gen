import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        char[] array = s.toCharArray();
        int[] count = new int[10000];
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int num = ((int) array[i] - 48) * 100 + ((int) array[j] - 48) * 10 + ((int) array[k] - 48);
                    count[num] = 1;
                }
            }
        }
        int sum = Arrays.stream(count).sum();
        int result = sum;

        // 出力
        System.out.println(result);
    }
}
