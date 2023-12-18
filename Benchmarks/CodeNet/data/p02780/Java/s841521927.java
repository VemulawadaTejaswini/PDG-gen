
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int xxx = 0;
        int sum = 0;
        int ind = 0;
        int[] x = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            sum += x[i];
            if (i >= K) sum -= x[i - K];
            if (xxx < sum) {
                xxx = sum;
                ind = i;
            }
        }

        BigDecimal max = BigDecimal.ZERO;

        for (int i = ind - K; i <= ind; i++) {
            int p = x[i];
            int s = (int) ((0.5) * p * (p + 1));
            BigDecimal k = new BigDecimal(s).divide(new BigDecimal(p));
            max = max.add(k);
        }

        System.out.println(max);

        sc.close();
    }

}