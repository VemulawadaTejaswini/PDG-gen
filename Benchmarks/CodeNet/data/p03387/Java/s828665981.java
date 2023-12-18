import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str_nums = br.readLine().split(" ");
        int[] nums = new int[3];
        nums[0] = Integer.parseInt(str_nums[0]);
        nums[1] = Integer.parseInt(str_nums[1]);
        nums[2] = Integer.parseInt(str_nums[2]);
        int count = 0;
        
        while (!(nums[0] == nums[1] && nums[1] == nums[2])) {
            Arrays.sort(nums);
            if ((nums[0] == nums[1] || nums[1] == nums[2] || nums[2] == nums[0]) && (!(nums[0] == nums[1] && nums[1] == nums[2]))) {
                if (nums[2] > nums[1]) {
                    nums[0] += 1;
                    nums[1] += 1;
                    count++;
                }
                else {
                    nums[0] += 2;
                    count++;
                }
            }
            else {
                nums[0] += 1;
                nums[1] += 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
