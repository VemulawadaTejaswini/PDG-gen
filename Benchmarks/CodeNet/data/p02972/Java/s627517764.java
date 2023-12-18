import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            String[] array = reader.readLine().split(" ");
            int[] A = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                A[i] = Integer.parseInt(array[i - 1]);
            }

            List<Integer> list = new ArrayList<>();
            int[] S = new int[N + 1];
            for (int i = N; i >= 1; i--) {
                if (A[i] != (S[i] % 2)) {
                    list.add(i);

                    for (int n = 1; n <= Math.sqrt(i); n++) {
                        if (N % n == 0) {
                            S[n]++;
                            int n2 = N / n;
                            if (n != n2) {
                                S[n2]++;
                            }
                        }
                    }
                }
            }

            Collections.sort(list);

            StringBuilder sb = new StringBuilder();
            sb.append(list.size());
            if (list.size() > 0) {
                sb.append("\n").append(list.get(0));
                for (int i = 1; i < list.size(); i++) {
                    sb.append(" ").append(list.get(i));
                }
            }
            System.out.println(sb.toString());
        }
    }

}
