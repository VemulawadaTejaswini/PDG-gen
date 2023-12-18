import java.util.*;

public class Main{
  public static void main(String... args){
    Scanner scan = new Scanner(System.in);
    
    final int NUM = scan.nextInt();
    int[] nums =new int[100001];
    for(int i = 0; i < NUM; i++){
      int temp = scan.nextInt();
      nums[temp] += 1;
    }
    
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for(int i = 1; i <= 100000; i++){
      if(i <= 3){
        sum += nums[i];
      } else {
        sum -= nums[i - 3];
        sum += nums[i];
      }
      if(sum > max){
        max = sum;
      }
    }
    
     System.out.println(max);

  }
  
}