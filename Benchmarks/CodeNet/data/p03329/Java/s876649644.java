import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    static int[] memo;

    public static int rec(int n) {
        if (n == 0) { return 0; }
        if (memo[n] != 0) { return memo[n]; }

        int[] coins = {
            1,
            6,
            6 * 6,
            6 * 6 * 6,
            6 * 6 * 6 * 6,
            6 * 6 * 6 * 6 * 6,
            6 * 6 * 6 * 6 * 6 * 6,
            9,
            9 * 9,
            9 * 9 * 9,
            9 * 9 * 9 * 9,
            9 * 9 * 9 * 9 * 9
        };

        List<Integer> answers = new ArrayList<>();
        for (int coin : coins) {
            if (n - coin >= 0) {
                answers.add(rec(n - coin) + 1);
            }
        }

        memo[n] = Collections.min(answers);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        memo = new int[100001];

        System.out.println(rec(N));
    }
}