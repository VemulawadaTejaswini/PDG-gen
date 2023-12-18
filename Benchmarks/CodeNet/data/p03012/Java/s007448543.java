import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[n];
    int sum = 0;
    int ans = 0;
    for(int i=0;i<n;i++){
      ar[i] = sc.nextInt();
      sum += ar[i];
    }
    for(int j=0;j<n;j++){
      ans += ar[j];
      if((sum - ans) - ans <= 0){
        System.out.println(Math.abs(sum - ans  - ans));
        break;
      }
    }
  }
}