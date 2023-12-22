import java.util.*;

public class Main {
    static int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s;

        while (true) {
            n = sc.nextInt();
            s = sc.nextInt();

            if (n == 0 && s == 0) break;

            System.out.println(dfs(n, s, 0, 0, 0));
        }
    }

    private static int dfs(int n, int s, int i, int count, int sum) {
        if (count == n) {
            if (sum == s) return 1;
            else return 0;
        }
        if (i == 10) return 0;
        if (sum > s) return 0;

        return dfs(n, s, i+1, count, sum) + dfs(n, s, i+1, count+1, sum+numbers[i]);
    }
}