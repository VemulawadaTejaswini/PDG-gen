import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] nums = new int[n];
      for(int i = 0; i < n; i++)
        nums[i] = sc.nextInt();
      int[] sortedSort = nums.clone();
      Arrays.sort(sortedSort);
      int midNum = sortedSort[n/2];
      int nextMid = sortedSort[n/2-1];
      for(int num : nums) {
        int res = 0;
        if(num < midNum) res = midNum;
        else if(num > midNum) res = nextMid;
        else {
          if(midNum == nextMid) res = midNum;
          else res = nextMid;
        }
        System.out.println(res);
      }
  }
}