import java.util.*;
public class Main{
  public static long[] memo;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] h = new int[N];
    memo = new long[N];
    Arrays.fill(memo, -1L);
    for(int i = 0; i < N; i++){
      h[i] = sc.nextInt();
    }
    System.out.println(solve(h));
  }
  
  public static long solve(int[] array){
    long[] ans = new long[array.length];
    ans[0] = 0L;
    ans[1] = Math.abs(array[1] - array[0]);
    for(int i = 2; i < array.length; i++){
      long tmp1 = ans[i-1] + Math.abs(array[i] - array[i-1]);
      long tmp2 = ans[i-2] + Math.abs(array[i] - array[i-2]);
      ans[i] = Math.min(tmp1, tmp2);
    }
    return ans[array.length - 1];
  }
}