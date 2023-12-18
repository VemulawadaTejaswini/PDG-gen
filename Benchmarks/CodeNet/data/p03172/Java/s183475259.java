import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int maxWays(int[] cap, int K){
        int[] state = new int[K+1];
        state[0] = 1;
        for (int children = 0; children < cap.length; children++) {
            int[] prefix = new int[K+1];
            for (int candies = K; candies >= 0; candies--) {
            //for (int candies = 0; candies <= K; candies++) { // gives different calculation
                int up_to = Math.min(cap[children], K - candies);
                int L = candies+1;
                int R = candies + up_to;
                if (L <= R) {
                    prefix[L] = add_self(prefix[L], state[candies]);
                    if (R + 1 <= K) {
                        prefix[R + 1] = sub_self(prefix[R + 1], state[candies]);
                    }
                }
            }
            int prefix_sum = 0;
            for (int i = 0; i <= K; i++) {
                prefix_sum = add_self(prefix_sum,prefix[i]);
                state[i] = add_self(state[i], prefix_sum);
            }
        }

        return state[K];
    }

    private static int add_self(int a, int b){
        int sum = a+b;
        if (sum >= mod){
            sum -= mod;
        }
        return sum;
    }

    private static int sub_self(int a, int b){
        int sum = a-b;
        if (sum < 0){
            sum += mod;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] a = new int[N];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(maxWays(a, K));
    }

    private static int mod = (int) (1e9+7);
}
