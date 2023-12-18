import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long k = sc.nextLong();
    
    long buf = n / k;
    long ans = Math.min(n - k * buf, k * (buf + 1) - n);

    System.out.println(ans);
  }
}
