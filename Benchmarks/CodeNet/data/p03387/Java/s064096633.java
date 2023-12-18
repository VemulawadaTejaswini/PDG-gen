import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[3];

        nums[0] = sc.nextInt();
        nums[1] = sc.nextInt();
        nums[2] = sc.nextInt();

        Arrays.sort(nums);
        int ans = 0;

        int diff_1 = nums[1] - nums[0];
        if (diff_1 % 2 != 0){
            ans++;
            nums[1]++;
            nums[2]++;
        }

        System.out.println(ans + nums[2] - nums[1] + (nums[1] - nums[0]) / 2);

    }
}
