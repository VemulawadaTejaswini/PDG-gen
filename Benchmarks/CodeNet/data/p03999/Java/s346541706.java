import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split("");
        long sum = 0;
        String temp;
        String[] temp_split;
        
        for (int i = 0; i < (1<<nums.length-1); i++) {
            temp = nums[0];
            for (int j = 0; j < nums.length-1; j++) {
                if ((i & (1<<j)) >= 1) {
                    temp += "+" + nums[j+1];
                }
                else {
                    temp += nums[j+1];
                }
            }
            //System.out.println(temp);
            temp_split = temp.split("\\+");
            for (String x : temp_split) {
                sum += Long.parseLong(x);
            }
        }
        
        System.out.println(sum);
    }
}
