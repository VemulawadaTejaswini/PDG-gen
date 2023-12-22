import java.util.*;

public class Main {
    static int n, s, count;

    static void dfs(int i, int j, int sum) {
        if(j == n && sum == s) {
            count++;
            return;
        }
        else if(j == n || i == 10) return;

        dfs(i + 1, j + 1, sum + i);
        dfs(i + 1, j, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            n = sc.nextInt();
            s = sc.nextInt();
            if(n == 0 && s == 0) break;

            count = 0;
            dfs(0, 0, 0);

            System.out.println(count);
        }
    }
}
