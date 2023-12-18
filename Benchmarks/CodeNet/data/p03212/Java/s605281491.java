import java.util.Scanner;

public class Main {

    private static long n;
    private static int result;

    private static void dfs(long x) {
        if (x > n) {
            return;
        }
        if (String.valueOf(x).contains("3")
                && String.valueOf(x).contains("5")
                && String.valueOf(x).contains("7")) {
            result++;
        }
        if (x <= 999999999) {
            dfs(10 * x + 3);
            dfs(10 * x + 5);
            dfs(10 * x + 7);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        dfs(0);
        System.out.println(result);
    }

}
