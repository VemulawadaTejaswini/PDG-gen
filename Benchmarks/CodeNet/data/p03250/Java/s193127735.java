import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[3];
    nums[0] = sc.nextInt();
    nums[1] = sc.nextInt();
    nums[2] = sc.nextInt();
    Arrays.sort(nums);
    System.out.println(nums[2] * 10 + nums[1] + nums[0]);
  }
}