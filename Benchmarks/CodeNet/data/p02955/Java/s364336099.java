import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = reader.readLine().split(" ");
            int N = Integer.parseInt(array[0]);
            int K = Integer.parseInt(array[1]);

            array = reader.readLine().split(" ");
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(array[i]);
            }

            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += A[i];
            }

            List<Integer> divisors = divisor(sum);
            Collections.sort(divisors);
            Collections.reverse(divisors);

            for (Integer divisor : divisors) {
                int d = divisor.intValue();

                int modSum = 0;
                for (int i = 0; i < N; i++) {
                    int mod = A[i] % d;
                    modSum += Math.min(mod, Math.abs(mod - d));
                }

                if (modSum / 2 <= K) {
                    System.out.println(d);
                    System.exit(0);
                }
            }
        }
    }

    public static List<Integer> divisor(int N) {
        List<Integer> list = new ArrayList<Integer>();

        for (int n = 1; n <= Math.sqrt(N); n++) {
            if (N % n == 0) {
                list.add(n);
                int n2 = N / n;
                if (n != n2) {
                    list.add(N / n);
                }
            }
        }

        return list;
    }

}
