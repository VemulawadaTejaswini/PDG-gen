import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            int min = Arrays.stream(A).parallel().mapToInt(a -> {
                int ret = 0;
                for (int i = 1; i < 50; i++) {
                    if (((a >> i) << i) != a) {
                        ret = i - 1;
                        break;
                    }
                }
                return ret;
            }).min().getAsInt();

            System.out.println(min);

        }
    }

}