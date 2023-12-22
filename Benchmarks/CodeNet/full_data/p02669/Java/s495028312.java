import java.util.*;

public class Main {

    private static long A;
    private static long B;
    private static long C;
    private static long D;

    private static long min;
    private static Map<Long,Long> memo;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();

            min = Long.MAX_VALUE;
            memo = new HashMap<>();
            dfs(N, 0);
            ans.append(min).append('\n');
        }

        System.out.print(ans);
    }


    private static void dfs(long n, long cost) {

        if (n == 1) {
            min = Math.min(min,cost+D);
            return;
        }

        Long cached = memo.get(n);
        if (cached != null && cost >= cached) {
            return;
        }

        memo.put(n,cost);

        dfs((n-(n%2))/2, cost+A+D*(n%2));
        dfs((n+(n%2))/2, cost+A+D*(n%2));
        dfs((n-(n%3))/3, cost+B+D*(n%3));
        dfs((n+3-(n%3))/3, cost+B+D*(3-(n%3)));
        dfs((n-(n%5))/5, cost+C+D*(n%5));
        dfs((n+5-(n%5))/5, cost+C+D*(5-(n%5)));
    }
}
