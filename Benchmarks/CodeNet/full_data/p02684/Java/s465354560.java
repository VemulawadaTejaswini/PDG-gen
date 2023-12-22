import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        BigInteger K = s.nextBigInteger();
        int[] A = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        K = K.remainder(BigInteger.valueOf(N)).add(BigInteger.valueOf(N));
        int now;
        for (now = 1; BigInteger.valueOf(count).compareTo(K) < 0; count++) {
            now = A[now - 1];
        }

        System.out.print(now);
    }
}