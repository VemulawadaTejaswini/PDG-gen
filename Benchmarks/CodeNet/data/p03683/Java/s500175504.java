import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int sum_N = 1;
    int sum_M = 1;
    int ans = 0;
    int n_m = Math.abs(N-M);
    int l = (int)Math.pow(10, 9) + 7;
    
    if(n_m < 2){
      for(int i = N;i <= 0;i--){
        sum_N *= i;
      }
      for(int j = M;j <= 0;j--){
        sum_M *= j;
      }
      if(n_m == 0){
        ans =sum_N * sum_M * 2;
      }else{
        ans =sum_N * sum_M;
      }
    }
    System.out.println(ans % l);
  }
}
      