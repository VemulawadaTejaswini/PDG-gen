import java.util.Scanner;

public class Solution {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Solution().solve();
    }

    void solve() {
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        double max = 0;
        for (int i = n; i >= 1; i--) {
            if (i % b == 1 || b % i == 1) {
                max = Math.max(max, i);
                break;
            }
        }
        double x = Math.floor(a * max / b) - a * Math.floor(max / b);
        System.out.println((int) x);
    }
}
