
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int type = 26;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = Integer.parseInt(scan.next());
        int[] c = new int[type];
        for (int i = 0; i < type; i++) {
            c[i] = Integer.parseInt(scan.next());
        }
        int[][] s = new int[d][type];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < type; j++) {
                s[i][j] = Integer.parseInt(scan.next());
            }
        }
        int[] t = new int[d];
        for (int i = 0; i < d; i++) {
            t[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        for (int i = 0; i < d; i++) {
            t[i]--;
        }
        // 前のコンテスト開催日
        int[] prevContest = new int[type];
        Arrays.fill(prevContest, -1);
        long score = 0;

        for (int i = 0; i < d; i++) {
            score += s[i][t[i]];
            prevContest[t[i]] = i;
            for (int j = 0; j < type; j++) {
                score -= c[j] * (i - prevContest[j]);
            }
            System.out.println(score);
        }
    }

}