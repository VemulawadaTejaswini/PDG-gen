import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        Arrays.sort(v);
        double result = (double) v[0];
        for (int i = 1; i < n; i++) {
            result = (result + v[i]) / 2;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}