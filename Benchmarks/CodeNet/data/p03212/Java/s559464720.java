import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long S = sc.nextLong();

        int result = dfs("0", S);

        System.out.println(result);
    }

    public static int dfs(String target, Long S) {
        int result = 0;

        if (Long.parseLong(target) > S) {
            return result;
        }

        if (target.matches(".*3.*") && target.matches(".*5.*") && target.matches(".*7.*")) {
            result++;
        }

        result += dfs(target + "3", S);
        result += dfs(target + "5", S);
        result += dfs(target + "7", S);
        return result;
    }

}