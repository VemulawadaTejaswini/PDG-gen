import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int ans = dfs("", n);
        System.out.println(ans);
    }

    // n以下の、strで始まる753数の数を返す
    static int dfs(String str, int n) {
        if (!str.equals("") && Long.parseLong(str) > n) {
            return 0;
        }
        int ret = 0;
        if (str.contains("7") && str.contains("5") && str.contains("3")) {
            ret++;
        }
        ret += dfs(str + "7", n);
        ret += dfs(str + "5", n);
        ret += dfs(str + "3", n);
        return ret;
    }

}
