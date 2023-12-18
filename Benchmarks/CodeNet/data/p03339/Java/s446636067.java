import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    static int N;
    static String S;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.next();

        solve();
    }

    static void solve() {
        List<String> list = S.chars().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.toList());

        long dp[] = new long[N+10];

        Arrays.fill(dp, S.length()+100);

        // 0番目をリーダーに選んだときは、自分以外のEの数が向きを変える必要がある人数
        dp[0] = S.chars().filter(i -> i == 'E').count() - (list.get(0).equals("E") ? 1 : 0);


        for (int i = 0; i < N-1; i++) {
            String now = list.get(i);
            String next = list.get(i+1);

            if (now.equals("E") && next.equals("E")) {
                dp[i + 1] = dp[i] - 1;
            } else if (now.equals("E") && next.equals("W")) {
                dp[i + 1] = dp[i];
            } else if (now.equals("W") && next.equals("E")) {
                dp[i + 1] = dp[i] + 1 - 1;
            } else {
                dp[i + 1] = dp[i] + 1;
            }

        }

        System.out.println(Arrays.stream(dp).min().orElse(-1));
    }
}
