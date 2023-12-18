import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        sc.close();

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int left = x[i];
            int right = x[i + (k - 1)];
            int candidate1 = Math.abs(left) + Math.abs(right - left);
            int candidate2 = Math.abs(right) + Math.abs(right - left);
            int candidate = Math.min(candidate1, candidate2);
            if (candidate < ans) {
                ans = candidate;
            }
        }
        System.out.println(ans);
    }

}
