import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long min = 100;
    for(long i = 1; i <= Math.sqrt(N); i++){
      if(N%i == 0){
        long A = calc(i, N/i);
        min = A < min ? A : min;
      }
    }
    System.out.println(min);
  }
  public static long calc(long A, long B){
    if(A < B){
      return calc(B, A);
    }
    int ans = 1;
    while(A/10 != 0){
      A /= 10;
      ans++;
    }
    return ans;
  }
}