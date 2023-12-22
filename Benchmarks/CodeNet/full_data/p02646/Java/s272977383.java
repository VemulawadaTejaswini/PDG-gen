import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int nums[] = new int[5];
    for(int i = 0; i < nums.length;i++)
      nums[i] = sc.nextInt();
    
	if(nums[1] <= nums[3]){
      System.out.print("NO");
    }else{
      nums[0] += nums[1] * nums[4];
      nums[2] += nums[3] * nums[4];
      if(nums[0] >= nums[2]){
        System.out.print("YES");
      }else{
        System.out.print("NO");
      }
    }
  }
}