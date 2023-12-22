import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        while (!(n == 0 && s == 0)) {
            System.out.println(dfs(n, s, 0, 0, -1));
            n = sc.nextInt();
            s = sc.nextInt();
        }

        sc.close();
    }

    static int dfs(int maxdepth, int target, int sum, int depth, int lastNum) {
        if (depth == maxdepth) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int ans = 0;

        for (int i = 0; i < 10; i++) {
            if (lastNum < i) {
                ans += dfs(maxdepth, target, sum + i, depth + 1, i);
            }
        }

        return ans;
    }

}

