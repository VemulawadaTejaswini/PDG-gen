import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] memo = new int[n + 1];

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                memo[Math.min(j - i, Math.abs(x - i) + 1 + Math.abs(y - j))]++;
            }
        }

        for (int i = 1; i < n; i++) {
            System.out.println(memo[i]);
        }
    }
}