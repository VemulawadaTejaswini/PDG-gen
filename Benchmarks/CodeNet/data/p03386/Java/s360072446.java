import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str_nums = br.readLine().split(" ");
        int[] nums = new int[3];
        nums[0] = Integer.parseInt(str_nums[0]);
        nums[1] = Integer.parseInt(str_nums[1]);
        nums[2] = Integer.parseInt(str_nums[2]);
        
        for (int i = nums[0]; i <= nums[1]; i++) {
            if (i < nums[0] + nums[2] || i > nums[1] - nums[2]) System.out.println(i);
        }
    }
}
