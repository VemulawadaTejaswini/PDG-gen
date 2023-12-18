import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = fib(n);


        System.out.println(ans);
    }

    public static int fib(int n) {
       int dp[] = new int[n+1];

       dp[0] = 2;
       dp[1] = 1;

       for (int i = 0; i < n - 1; i++) {
           dp[i + 2] = dp[i + 1] + dp[i];
       }

       return dp[n];

    }
}
