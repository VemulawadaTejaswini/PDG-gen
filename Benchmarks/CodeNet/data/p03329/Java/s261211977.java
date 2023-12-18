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
        System.out.println(Arrays.toString(list.toArray()));

        while (N >= 36) {
            for (int i = list.size() - 1; i >= 0; i--) {
                int item = list.get(i);

                if (item <= N) {
                    System.out.println(item);
                    N -= item;
                    count++;
                    break;
                } else {
                    continue;
                }
            }
        }

        // 以下Nは35以下
        int[] dp = new int[36];
        // 1のみ
        for (int i = 0; i < dp.length; i++) {
            dp[i] = i;
        }
        // 1と6のみ
        for (int i = 6; i < dp.length; i++) {
            if (dp[i-6] + 1 < dp[i]) {
                dp[i] = dp[i-6] + 1;
            }
        }
        // 1と6と9のみ
        for (int i = 9; i < dp.length; i++) {
            if (dp[i-9] + 1 < dp[i]) {
                dp[i] = dp[i-9] + 1;
            }
        }

        count += dp[N];

        System.out.println(count);
    }
}