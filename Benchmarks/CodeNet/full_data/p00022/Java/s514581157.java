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

            SubArray subArray = new SubArray(input, 0, input.length - 1);

            System.out.println(maxSubarray(subArray));
        }
    }

    static long maxSubarray(SubArray input){
        int left = input.left;
        int right = input.right;
        long maxSum = input.array[input.left];

        for(int i = input.left ; i <= input.right ;i++){
            int sum = 0;

            for(int j = i; j <= input.right; j++){
                sum += input.array[j];

                if(maxSum < sum){
                    left = i;
                    right = j;
                    maxSum = sum;
                }
            }
        }

        input.left = left;
        input.right = right;

        return maxSum;
    }
}

class SubArray {
    long[] array;
    int left;
    int right;

    public SubArray (long[] array, int left, int right){
        this.array = array;
        this.left = left;
        this.right = right;
    }
}
