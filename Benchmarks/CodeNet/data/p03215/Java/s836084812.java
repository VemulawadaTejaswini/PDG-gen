import java.awt.SystemTray;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int kosu = 0;
        boolean flag = true;
        int count = 0;
        while (flag) {
            count = count + 1;
            kosu = kosu + count;
            if (k <= kosu) {
                flag = false;
            }
        }
        // count - 1 個の数字を使ってはいけない。
        // 要素数
        int kazu = n - count + 1;
        long sum = 0;
        for (int i = 0; i < kazu; i++) {
            sum = sum + a[i];
        }
        int nokori = (count + 1) * count / 2 - k;
        long[] summ = new long[count];
        summ[0] = sum;
        for (int i = 0; i < count - 1; i++) {
            summ[i + 1] = summ[i] - a[i] + a[i + kazu];
        }
        Arrays.sort(summ);

        System.out.println(summ[nokori]);

    }
}