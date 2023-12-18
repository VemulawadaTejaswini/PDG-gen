import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // 宝石の価値
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();
        }
        sc.close();

        int max = 0;
        for (int i = 0; i <= Math.min(N, K); i++) {
            for (int j = 0; i + j <= Math.min(N, K); j++) {
                List<Integer> val = new ArrayList<Integer>();
                int sum = 0;
                for (int m = 0; m < i; m++) {
                    val.add(V[m]);
                    sum += V[m];
                }

                for (int n = 0; n < j; n++) {
                    val.add(V[N - n - 1]);
                    sum += V[N - n - 1];
                }

                int remain = K - val.size();
                for (int e = 0; e < remain; e++) {
                    if (val.size() > 0) {
                        int min = Collections.min(val);
                        if (min < 0) {
                            sum -= min;
                            val.remove(val.indexOf(min));
                        } else {
                            break;
                        }
                    }
                }

                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);

    }
}