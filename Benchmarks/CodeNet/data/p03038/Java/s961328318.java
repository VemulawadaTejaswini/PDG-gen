import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Integer Cards
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            List<BC> list = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                BC bc = new BC();
                bc.B = sc.nextInt();
                bc.C = sc.nextLong();
                list.add(bc);
            }

            Arrays.sort(A);
            Collections.sort(list, (o1, o2) -> Long.compare(o2.C, o1.C));

            long sum = 0;
            long count = 0;

            for (int i = N - 1; i >= 0; i--) {
                long a = A[i];

                while (list.size() > 0 && list.get(0).C >= a) {
                    BC bc = list.get(0);

                    if (count + bc.B >= N) {
                        sum += bc.C * (N - count);
                        count = N;
                        break;
                    }

                    sum += bc.C * bc.B;
                    count += bc.B;
                    list.remove(0);
                }

                if (count == N) {
                    break;
                }

                sum += a;
                count++;

                if (count == N) {
                    break;
                }
            }

            System.out.println(sum);
        }
    }

    static class BC {

        int B;

        long C;

    }

}
