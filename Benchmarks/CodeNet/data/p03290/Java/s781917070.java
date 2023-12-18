import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int threshold = sc.nextInt();

        int[] qnum = new int[D];
        int[] bournus = new int[D];
        for (int i = 0; i < D; i++) {
            qnum[i] = sc.nextInt();
            bournus[i] = sc.nextInt();
        }

        int ret = Integer.MAX_VALUE;

        for (int mask = 0; mask < (1 << D); mask++) {
            int num = 0;
            int score = 0;
            int maxQIdx = -1;

            for (int i = 0; i < D; i++) {
                if (((mask >> i) & 1) == 1) {
                    score += bournus[i] + qnum[i] * (i + 1) * 100;
                    num += qnum[i];
                } else {
                    maxQIdx = i;
                }
            }

            if (score >= threshold) {
                if (num < ret) ret = num;
                continue;
            }

            int rest = threshold - score;
            if (rest > (qnum[maxQIdx] - 1) * (maxQIdx + 1) * 100) {
                continue;
            }

            num += (int) Math.ceil(rest / ((maxQIdx + 1) * 100));
            if (num < ret) ret = num;
        }

        System.out.println(ret);
    }
}