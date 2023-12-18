import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int N = Integer.valueOf(input[0]);
        int K = Integer.valueOf(input[1]);

        int sum = 0;
        for (int i = K; i <= N + 1; i ++) {
            int min = 0;
            for (int j = 0; j < i; j ++) {
                min += j;
            }


            int max = 0;
            for (int j = N; j > N - i; j --) {
                max += j;
            }

            sum += (max - min + 1);
        }

        System.out.println(sum);
    }
}