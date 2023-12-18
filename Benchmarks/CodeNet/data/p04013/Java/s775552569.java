import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        System.out.println(dfs(0, a, 0, 0, ary));

    }
    private static long dfs(int n, int avg, int sum, int num, int[] ary) {
        if (ary.length == n) {
            if (num == 0) {
                return 0;
            } else {
                return (avg == sum / num && sum % num == 0) ? 1: 0;
            }
        }
        long ans = 0;
        ans += dfs(n + 1, avg, sum, num, ary);
        ans += dfs(n + 1, avg, sum + ary[n], num + 1, ary);
        return ans;
    }
}