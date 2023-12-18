import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int[] a = new int[q];
        for (int i = 0; i < q; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int[] score = new int[n];
        for (int i = 0; i < q; i++) {
            score[a[i] - 1]++;
        }

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = k <= Arrays.stream(score).sum() - score[i] ? "No" : "Yes";

        }

        // 出力
        System.out.println(String.join("\r\n", result));
        sc.close();
    }
}