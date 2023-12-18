import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for(int i = 0; i < n; i++) {
          nums[i] = sc.nextLong();
        }

        long[] prefixSum = new long[n];
        
        int minCost = 0;
        if(nums[0] == 0) {
          nums[0] = 1;
          minCost = 1 + count(nums);

          nums[0] = -1;
          minCost = Math.min(minCost, 1 + count(nums));
        } else {
          minCost = count(nums);
        }
        System.out.println(minCost);
    }

    private static int count(long[] nums) {
      int cnt = 0;
      long prev = nums[0];
      long cur = 0;
      for(int i = 1; i < nums.length; i++) {
        cur = nums[i] + prev;
        if(cur * prev < 0) {
          prev = cur;
          continue;
        }

        if(prev > 0) {
          cnt += cur + 1;
          prev = -1; 
        } else {
          cnt += 1 - cur;
          prev = 1;
        }
      }
      return cnt;
    }
}
