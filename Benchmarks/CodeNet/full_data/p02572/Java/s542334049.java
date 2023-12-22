import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] A = new int[N];
      int[] sums = new int[N-1];
      
      int MOD = 1000000007;
      
      for(int i = 0; i < N; i++){
        A[i] = sc.nextInt();
      }
      for(int i = N-2; i >= 0; i--){
        if(i == N-2){
          sums[i] = A[i+1];
        }else{
          sums[i] = (sums[i+1] + A[i+1]) % MOD;
        }
      }
      
      // 計算
      long result = 0L;
      for(int i = 0; i < N-1; i++){
        long tmp = ((long)A[i] * sums[i]) % MOD;
        result = (result + tmp) % MOD;
      }
      
      // 出力
      System.out.println(result);
    }
    

}