import java.util.*;

public class Main {

    private static int A;
    private static int B;
    private static int C;
    private static int D;

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

        Long cached = memo.get(n);
        if (cached != null && cost >= cached) {
            return;
        }

        memo.put(n,cost);

        if (n == 0) {
            min = Math.min(min,cost);
            return;
        }

        if (n == 1) {
            min = Math.min(min,cost+D);
            return;
        }

        int[] div = new int[] {2,3,5};
        int[] divCost = new int[] {A,B,C};

        for (int i = 0; i < 3; i ++) {
            if (n < div[i]) {
                dfs(0, cost+n*D);
            } else if (n%div[i] == 0) {
                divDfs(n, n/div[i], divCost[i], cost);
            } else {
                divDfs(n-n%div[i], n/div[i], divCost[i], cost+D*(n%div[i]));
                divDfs(n+(div[i]-n%div[i]), (n+div[i])/div[i], divCost[i], cost+D*(div[i]-n%div[i]));
            }
        }
    }

    private static void divDfs(long src, long dst, int divCost, long cost) {
        long diffCost;
        if (src-dst >= 1_000_000_000) {
            diffCost = divCost;
        } else {
            diffCost = Math.min((src-dst)*D,divCost);
        }
        dfs(dst, cost+diffCost);
    }
}
