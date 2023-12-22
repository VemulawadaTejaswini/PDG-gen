import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            if (n + s == 0) {
                break;
            }
            System.out.println(dfs(n, 0, s));
        }
        sc.close();
    }

    private static int dfs(int depth, int start, int left) {
        if (depth == 0) {
            return left == 0 ? 1 : 0;
        }
        int result = 0;
        for (int i=start; i<10; ++i) {
            result += dfs(depth - 1, i + 1, left - i);
        }
        return result;
    }
}
