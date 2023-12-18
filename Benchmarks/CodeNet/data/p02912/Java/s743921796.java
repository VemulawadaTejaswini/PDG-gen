import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = reader.readLine().split(" ");
            int N = Integer.parseInt(array[0]);
            int M = Integer.parseInt(array[1]);

            array = reader.readLine().split(" ");
            long[] A = new long[N];
            long sum = 0;
            for (int i = 0; i < N; i++) {
                A[i] = Long.parseLong(array[i]);
                sum += A[i];
            }

            for (int i = 0; i < M; i++) {
                Arrays.sort(A);

                long a = A[N - 1];
                sum = sum - a + (a / 2);
                A[N - 1] = (a / 2);
            }

            System.out.println(sum);
        }
    }

}
