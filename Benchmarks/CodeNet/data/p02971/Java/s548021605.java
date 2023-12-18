import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 元配列は出力で使いたいのでとっておく
        Integer[] copied = new Integer[n];
        for (int i = 0; i < n; i++) {
            copied[i] = a[i];
        }
        Arrays.sort(copied, Comparator.reverseOrder());

        int max = copied[0];
        int nxt = copied[1];

        // 規約通りにシミュレーション
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                System.out.println(nxt);
            } else {
                System.out.println(max);
            }
        }
    }
}

