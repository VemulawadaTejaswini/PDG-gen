import java.util.Scanner;

public class Main {

    public static class LIS {

        int[] arr;

        public LIS(int[] arr) {
            this.arr = arr;
        }

        public int solve() {
            if (arr == null || arr.length == 0) {
                return 0;
            }
            int[] dp = new int[arr.length];
            int max = 1;
            for (int i = 0; i < arr.length; i++) {
                dp[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (arr[i] > arr[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                        max = Math.max(max, dp[i]);
                    }
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        LIS lis = new LIS(arr);
        System.out.println(lis.solve());
    }
}