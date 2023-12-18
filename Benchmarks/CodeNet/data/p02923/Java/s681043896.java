import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        for (int i = 0; i < input.length - 2; i++) {
            if(input[i] < input[i + 1]) {
                continue;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}