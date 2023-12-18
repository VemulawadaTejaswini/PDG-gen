import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        long[] values = new long[N];

        long sum = 0;
        for (int i = 0; i < N; i++) {
            long value =  sc.nextLong();
            values[i] = value;
            sum += value;
        }
        long mid = Math.round(((double) sum) / ((double) N));

        long ans = 0;
        for (int i = 0; i < N; i++) {
            long diff = Math.abs(values[i] - mid);
            ans += (diff * diff);
        }
        System.out.println(ans);
    }

}