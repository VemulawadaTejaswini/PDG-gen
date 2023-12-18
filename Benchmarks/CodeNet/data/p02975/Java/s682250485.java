import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String line = sc.nextLine();
        check(num, line);
    }

    public static void check(String num, String line) {
        int cnt = Integer.parseInt(num);
        String[] strs = line.split(" ");
        int[] nums = new int[strs.length];
        for(int i=0; i<strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }

        //0
        if((nums[0] != (nums[1]^nums[nums.length-1]))
            || (nums[nums.length-1] != (nums[nums.length-2]^nums[0]))) {
            System.out.println("No");
            return;
        }

        for(int i=1; i<nums.length-1; i++) {
            if(nums[i] != (nums[i-1]^nums[i+1])) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}