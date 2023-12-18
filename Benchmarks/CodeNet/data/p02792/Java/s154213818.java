import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[][] cnt = new long[10][10];
        for (int i = 1; i <= n; i++) {
            cnt[String.valueOf(i).charAt(0) - '0'][String.valueOf(i).charAt(String.valueOf(i).length() - 1) - '0']++;
        }
        long ans = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                ans += cnt[i][j] * cnt[j][i];
            }
        }
        System.out.println(ans);
    }
}
