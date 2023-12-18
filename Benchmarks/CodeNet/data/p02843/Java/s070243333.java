import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int x = std.nextInt();
        int ans = solution(x);
        System.out.println(ans);
    }

    static int solution(int x) {
        boolean[] dp = new boolean[x+10];
        dp[0] = true;
        int[] elements = {100,101,102,103,104,105};
        for (int i = 100; i <= x; i++) {
            for (int j = 0; j < elements.length; j++) {
                int yen = elements[j];
                int diff = i - yen;
                if (diff < 0) {
                    continue;
                }
                if (dp[diff]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        if (dp[x]) {
            return 1;
        } else {
            return 0;
        }
    }

}
