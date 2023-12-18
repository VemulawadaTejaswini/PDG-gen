import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long a = n + 1;
    long ans = n % k;
    ans = Math.min(ans,Math.abs(ans - k));
    System.out.println(ans);
  }
}
