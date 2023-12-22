import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                break;
            }

            long[] input = new long[n];
            for(int i = 0; i < n; i++){
                input[i] = Long.parseLong(br.readLine());
            }


            System.out.println(calcSumOfArray(input));
        }
    }

    static long calcSumOfArray(long[] input){
        int n = input.length;
        long maxSum = input[0];

        for(int i = 0 ; i < n ;i++){
            int sum = 0;

            for(int j = i; j < n; j++){
                sum += input[j];

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
