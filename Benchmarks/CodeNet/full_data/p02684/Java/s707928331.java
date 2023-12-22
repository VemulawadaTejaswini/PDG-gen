import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    long K = Long.parseLong(S[1]);
    S = sc.nextLine().split(" ");
    
    int count = 0;
    int[] nums = new int[N];
    for(int i = 0; i < N; i++){
      nums[i] = Integer.parseInt(S[i]);
      if(nums[i] != i+1){
        count++;
      }
    }
    long times = K%count;
    int ans = 1;
    for(int i = 0; i < times; i++){
      ans = nums[ans-1];
    }
    
    System.out.println(ans);
  }
}