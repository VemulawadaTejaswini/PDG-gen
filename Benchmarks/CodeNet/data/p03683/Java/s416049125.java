import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    sc.close();
    int sum_N = 1;
    int sum_M = 1;
    int ans = 0;
    int n_m = Math.abs(N-M);
    int l = (int)Math.pow(10, 9) + 7;
    
    if(n_m < 2){
      for(int i = 1;i <= N;i++){
        sum_N *= i % l;
      }
      for(int j = 1;j <= M;j++){
        sum_M *= j % l;
      }
      if(n_m == 0){
        ans = (sum_N * sum_M * 2) % l;
      }else{
        ans = (sum_N * sum_M) % l;
      }
    }
    System.out.println(ans);
  }
}
      