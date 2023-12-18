import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = reader.readLine().split(" ");
            int N = Integer.parseInt(array[0]);
            long K = Long.parseLong(array[1]);
            int Q = Integer.parseInt(array[2]);

            int[] P = new int[N + 1];
            for (int i = 1; i <= Q; i++) {
                int n = Integer.parseInt(reader.readLine());
                P[n]++;
            }

            for (int i = 1; i <= N; i++) {
                if (K - Q + P[i] > 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

}
