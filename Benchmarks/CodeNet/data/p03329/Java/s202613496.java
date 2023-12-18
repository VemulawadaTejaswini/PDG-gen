import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        for (int i = 6; i <= N; i *= 6) {
            list.add(i);
        }

        for (int i = 9; i <= N; i *= 9) {
            list.add(i);
        }

        Collections.sort(list);

        int[] dp = new int[N+1];

        for (int i = 0; i < N+1; i++) {
            dp[i] = i;
        }

        for (int j = 1; j < list.size(); j++) {
            int item = list.get(j);

            for (int i = item; i < dp.length; i++) {
                if (dp[i - item] + 1 < dp[i]) {
                    dp[i] = dp[i - item] + 1;
                }
            }
        }

        System.out.println(dp[N]);
    }
}