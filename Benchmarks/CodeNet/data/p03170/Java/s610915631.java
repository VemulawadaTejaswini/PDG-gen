import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;


public class MainApp{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean[] dp = new boolean[k+1]; // true表示dp[i]剩余i石头且现在移动的人赢了
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if(i-arr[j] >=0&&!dp[i-arr[j]]) {
                    dp[i]=true;
                }
            }
        }
        System.out.println(dp[k] == true?"First":"Second");



    }



}