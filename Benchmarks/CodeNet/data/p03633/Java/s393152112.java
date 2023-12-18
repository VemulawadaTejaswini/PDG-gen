import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    long ans = 1;
    for(int i = 0; i < N; i++){
      long sec = Long.parseLong(sc.nextLine());
      ans = lcm(ans, sec);
    }
    System.out.println(ans);
  }
  static long gcd(long a, long b){
    if(b > a){
      return gcd(b, a);
    }
    if(b == 0){
      return a;
    }
    return gcd(b, a%b);
  }
  
  static long lcm(long a, long b){
    return a*(b/gcd(a,b));
  }
}