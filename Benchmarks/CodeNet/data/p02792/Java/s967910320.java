import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] count = new long[10][10];
        long ans = 0;

        // nまでの全ての数の先頭と末尾を取り出す
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                continue;
            }
            int j = i;
            while (j >= 10) {
                j /= 10;
            }
            count[j][i % 10]++;
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                ans += (count[i][j] * count[j][i]);
            }
        }

        System.out.println(ans);
    }
}