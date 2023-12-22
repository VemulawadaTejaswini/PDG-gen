
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// ?¨??????\???????????????????????????????????????
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            int[] scores = new int[n];
            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextInt();
            }
            int max = scores[0];
            int maxnum = 0;
            int min = scores[0];
            int minnum = 0;
            for (int i = 0; i < n; i++) {
                if (max < scores[i]) {
                    max = scores[i];
                    maxnum = i;
                }
                if (scores[i] < min) {
                    min = scores[i];
                    minnum = i;
                }
            }
            int av= 0;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if ((scores[i] == min || scores[i] == max) && cnt < 2) {
                    cnt++;
                    continue;
                }
                av+=scores[i];
            }
            av=av-max-min;
            av /= n - 2;
            System.out.println(av);

        }

    }

}