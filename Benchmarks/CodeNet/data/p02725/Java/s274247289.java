import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(), n = scanner.nextInt();
        int[] nums = new int[n+1];
        for (int i = 1; i <= n; i ++)
            nums[i] = scanner.nextInt();
        Arrays.sort(nums);
        int sum = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i ++){
            int temp = 0;
            for (int j = 1; j < n; j ++){
                int left = i + j;
                int t = left > n ? (i + j) % n : left;
                if (left > n && t == 1){
                    temp += k - nums[i] + nums[j];
                }else
                    temp += nums[t] - nums[t - 1];
            }
            sum = Math.min(sum, temp);
        }
        System.out.println(sum);
    }

}
