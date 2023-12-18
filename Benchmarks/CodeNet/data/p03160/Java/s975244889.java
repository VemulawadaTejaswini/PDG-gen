import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Solution{

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

    private static void initCache(int[] cache){
        for(int i = 0; i < cache.length; i++) cache[i] = -1;
    }

    private static int[] retrieveInput(){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String a = in.next();
        String b = in.next();
        String[] str = b.split(" ");
        int[] nums = new int[str.length];
        for(int i = 0; i < nums.length; i++)
            nums[i] = Integer.valueOf(str[i]);
        
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = retrieveInput();
        int[] cache = new int[nums.length];
        initCache(cache);
     
        System.out.println(helper(nums, cache, nums.length-1));
    }
}