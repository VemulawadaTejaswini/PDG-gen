import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(in.readLine());
            int[] A = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int cnt = 0;

            for (int i = 0; i < N; i++) {
                int minj = i;
                for (int j = i; j < N; j++) {
                    if (A[j] < A[minj]) {
                        minj = j;
                    }
                }

                if (i != minj) {
                    cnt++;
                    int tmp = A[i];
                    A[i] = A[minj];
                    A[minj] = tmp;
                }
            }

            System.out.println(Arrays.stream(A).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
            System.out.println(cnt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
