import java.util.Scanner;
import java.util.Arrays;

public class Main{

    // recursive with memoization aka dp but not really accepted dp in interviews so go figure.
    private static int helper(int[] nums, int[] cache, int i){

        if(cache[i] != -1)
            return cache[i];
        if(i==0)
            return cache[0] = 0;
        if(i==1)
            return cache[1] = Math.abs(nums[1] - nums[0]);

        cache[i] = Math.min(
            Math.abs(nums[i] - nums[i-1]) + helper(nums, cache, i-1),
            Math.abs(nums[i] - nums[i-2]) + helper(nums, cache, i-2));
        
        return cache[i];
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0){
            System.out.println(0);
            return;
        }
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) nums[i] = in.nextInt();
        int[] cache = new int[nums.length];
        Arrays.fill(cache, -1);

     
        System.out.println(helper(nums, cache, nums.length-1));
    }
}