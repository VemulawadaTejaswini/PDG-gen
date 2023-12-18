import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long ans = 0;
    ans = (x / (long)11);
    long t = (x % (long)11);
    if((t > 0) && (t <= 6)) ans++;
    if(t > 6) ans += 2;
    System.out.println(ans);
  }
}