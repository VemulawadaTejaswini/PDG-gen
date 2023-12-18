import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] nums = new int[N];
    for(int i = 0; i < N; i++){
      nums[i] = Integer.parseInt(sc.nextLine());
    }
    Arrays.sort(nums);
    
    int count = 0, ans = 0, now = 0;
    for(int i = 0; i < N; i++){
      if(now != nums[i]){
        now = nums[i];
        if(count%2 == 1){
          ans++;
        }
        count = 1;
      }else{
        count++;
        if(i == N-1 && count%2 == 1){
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}