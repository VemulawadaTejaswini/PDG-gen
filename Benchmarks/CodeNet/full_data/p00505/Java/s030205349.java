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
        int triangle = 0;
        int acute = 0;
        int obtuse = 0;
        int right = 0;
        int a, b, c;
        
        while (nums[0] + nums[1] > nums[2] && nums[1] + nums[2] > nums[0] && nums[2] + nums[0] > nums[1]) {
            Arrays.sort(nums);
            a = nums[2];
            b = nums[1];
            c = nums[0];
            
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {right++; triangle++;}
            else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {obtuse++; triangle++;}
            else {acute++; triangle++;}
            
            str_nums = br.readLine().split(" ");
            nums[0] = Integer.parseInt(str_nums[0]);
            nums[1] = Integer.parseInt(str_nums[1]);
            nums[2] = Integer.parseInt(str_nums[2]);
            System.out.println(a+""+b+""+c);
        }
        
        System.out.println(triangle + " " + right + " " + acute + " " + obtuse);
    }
}

