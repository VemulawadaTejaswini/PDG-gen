import java.util.*;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int point = 0;
        double probability = 0.0f;

        for (int i = 1; i <= n; i++) {
            point = i;// ポイントの初期値設定
            double tmpProbability = 1.0/n;

            if (point >= k) {
                probability += tmpProbability;
                continue;
            }

            int j = 1;
            while (point < k) {
                point *= 2;
                if (point >= k) {
                    tmpProbability *= Math.pow(0.5, (double)j);
                    probability += tmpProbability;
                    break;
                }
                j++;
            }
        }

        System.out.println(probability);
    }
}
