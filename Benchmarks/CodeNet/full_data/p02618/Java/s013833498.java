import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        // 満足度低下係数
        int[] c = new int[26];
        Arrays.setAll(c, i -> sc.nextInt());
        // 満足度増加度
        int[][] s = new int[d][26];
        for (int i = 0; i < d; i++) {
            Arrays.setAll(s[i], i1 -> sc.nextInt());
        }
        // 最終開催履歴
        int[] ans = new int[d];
        long grandScore = 0;
        // 何日目まで先を見るか
        for (int k = 0; k < 26; k++) {
            long score = 0;
            int[] array = new int[d];
            int[] last = new int[26];
            // 何日目の開催コンテストを決定するか
            for (int i = 0; i < d; i++) {
                int index = 0;
                long v = 0;
                // コンテストのk日後のスコアを見て開催コンテストを決める
                for (int j = 0; j < 26; j++) {
                    int ruiseki = 0;
                    for (int l = 1; l <= k; l++) {
                        ruiseki += l;
                    }
                    long childV = s[i][j] - ruiseki * c[j];
                    if (j == 0) {
                        v = childV;
                    } else if (childV > v) {
                        v = childV;
                        index = j;
                    }
                }
                array[i] = index;
                for (int j = 0; j < 26; j++) {
                    if (j == index) {
                        score += s[i][j];
                        last[j] = i + 1;
                    } else {
                        score -= c[j] * (i + 1 - last[j]);
                    }
                }
            }
            if (k == 0) {
                grandScore = score;
                ans = array;
            } else if (score > grandScore) {
                grandScore = score;
                ans = array;
            }
        }
        for (int i = 0; i < d; i++) {
            System.out.println(ans[i] + 1);
        }
    }
}