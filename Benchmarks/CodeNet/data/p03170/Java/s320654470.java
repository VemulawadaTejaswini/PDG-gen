import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] stones = new int[n];
        for(int i = 0; i < n; i++) {
            stones[i] = sc.nextInt();
        }
        boolean[] dp = new boolean[k + 1];
        for(int i = 1; i <= k; i++) {
            inner:
            for(int stone : stones) {
                if(stone <= i && !dp[i - stone]) {
                    dp[i] = true;
                    break inner;
                }
            }
        }
        System.out.println(dp[k] ? "First" : "Second");
    }
}
