import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        int d = 0;
        for (int i = 0; i < n; i++) {
            d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                a[sc.nextInt() - 1] += 1;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count++;
            }
        }

        // 出力
        System.out.println(count);
    }
}
