import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long cut = 998244353;

        int[] l_array = new int[K];
        int[] r_array = new int[K];

        for(int i = 0; i < K; i++) {
            String[] input_array = br.readLine().split(" ");
            l_array[i] = Integer.parseInt(input_array[0]);
            r_array[i] = Integer.parseInt(input_array[1]);
        }
        
        long[] dp = new long[N + 10];
        dp[1] = 1;

        long[] sum_array = new long[N + 10];
        sum_array[1] = 1;

        for(int i = 2; i <= N; i++) {    
            
            for(int j = 0; j < K; j++) {
                int max_index = i - l_array[j];
                int min_index = i - r_array[j];

                if(min_index <= 0 && max_index <= 0) {
                    continue;
                } else if(min_index <= 0 && max_index > 0) {
                    min_index = 1;
                }

                long sum = sum_array[max_index] - sum_array[min_index - 1];

                if(sum < 0) sum += cut;

                dp[i] += sum;
                dp[i] %= cut;
            }

            sum_array[i] = (sum_array[i-1] + dp[i]) % cut;

        }
        
        pw.println(dp[N]);
        br.close();
        pw.close();
    }
}