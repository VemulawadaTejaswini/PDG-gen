import java.util.*;

public class Main {

    public static void main(String[] args) {
        movingPeace();
    }

    private static void movingPeace() {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] Ps = new int[N + 1];
        long[] Cs = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            Ps[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            Cs[i] = sc.nextLong();
        }

        long score = Integer.MIN_VALUE;
        long maxScore = score;
        for (int i = 1; i <= N; i++) {

            int index = Ps[i];
            score = Cs[index];

            maxScore = Math.max(maxScore, score);
            for (int j = 1; j < K; j++) {
                index = Ps[index];
                score += Cs[index];
            }
            maxScore = Math.max(maxScore, score);
        }

        System.out.println(maxScore);

    }
}