import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(dfs(s, 0));

    }

    private static long dfs(String s, int depth) {
        if (s.length() - 1 == depth) {
            long sum = 0;
            String[] sary = s.split("\\+");
            for (String a: sary) {
                sum += Long.parseLong(a);
            }
            return sum;
        }
        long sum = 0;
        sum += dfs(s, depth + 1);
        s = s.substring(0, depth + 1) + "+" + s.substring(depth + 1);
        sum += dfs(s, depth + 2);

        return sum;
    }
}