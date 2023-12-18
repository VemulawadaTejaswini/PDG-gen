import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] h = new int[N];
    for(int i = 0; i < N; i++){
      h[i] = sc.nextInt();
    }
    System.out.println(solve(h, K));
  }
  
  public static long solve(int[] array, int k){
    long[] ans = new long[array.length];
    Arrays.fill(ans, Long.MAX_VALUE);
    ans[0] = 0L;
    for(int i = 0; i < array.length; i++){
      for(int j = i + 1; j <= k + i && j < array.length; j++){
        long tmp = Math.abs(array[j] - array[i]) + ans[i];
        ans[j] = ans[j] < tmp ? ans[j] : tmp;
      }
    }
    return ans[array.length - 1];
  }
}