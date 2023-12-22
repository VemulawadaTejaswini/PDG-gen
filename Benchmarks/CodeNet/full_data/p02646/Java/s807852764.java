import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    long nums[] = new long[5];
    for(int i = 0; i < nums.length;i++)
      nums[i] = sc.nextInt();
    

    nums[0] += nums[1] * nums[4];
    nums[2] += nums[3] * nums[4];
    if(nums[0] >= nums[2]){
      System.out.print("YES");
    }else{
      System.out.print("NO");
    }
  }
}