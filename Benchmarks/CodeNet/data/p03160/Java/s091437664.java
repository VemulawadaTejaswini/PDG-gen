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
        String[] input_str_array = br.readLine().split(" ");
        int[] input_array = new int[N];

        for(int i = 0; i < N; i++) {
            input_array[i] = Integer.parseInt(input_str_array[i]);
        }

        int[] dp = new int[N];
        dp[0] = 0;
        dp[1] = Math.abs(input_array[1] - input_array[0]);

        for(int i = 2; i < N; i++) {

            if(dp[i-2] + (Math.abs(input_array[i] - input_array[i-2])) > dp[i-1] + (Math.abs(input_array[i] - input_array[i-1]))) {
                dp[i] = dp[i-1] + (Math.abs(input_array[i] - input_array[i-1]));
            } else {
                dp[i] = dp[i-2] + (Math.abs(input_array[i] - input_array[i-2]));
            }
            
        }

        pw.println(dp[N-1]);
        
        pw.close();
        br.close();
    }
}
