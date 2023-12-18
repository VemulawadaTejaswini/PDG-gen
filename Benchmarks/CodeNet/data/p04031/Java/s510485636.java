import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    
    int[] nums = new int[N];
    int sum = 0;
    for(int i = 0; i < N; i++){
      nums[i] = Integer.parseInt(S[i]);
      sum += nums[i];
    }
    
    int n = sum / N;
    if(sum % N != 0){
      n++;
    }
    int ans = 0;
    for(int i = 0; i < N; i++){
      ans += ((nums[i] - n) * (nums[i] - n));
    }
    System.out.println(ans);
  }
}