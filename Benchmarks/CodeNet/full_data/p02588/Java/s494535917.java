import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        BigDecimal[] A = new BigDecimal[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextBigDecimal();
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                BigDecimal x = A[i].multiply(A[j]);
                if (x.subtract(BigDecimal.valueOf(x.intValue())).compareTo(BigDecimal.ZERO) == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}