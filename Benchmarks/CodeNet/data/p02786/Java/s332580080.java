import java.util.*;

public class Main{
  static long ans = 0;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    ans++;
    func(N/2,0);
    System.out.println(ans);
  }
  static void func(long N, long now){
    if(N == 0){
      return;
    }
    ans += (long)Math.pow(2, now+1);
    func(N/2, now+1);
  }
}