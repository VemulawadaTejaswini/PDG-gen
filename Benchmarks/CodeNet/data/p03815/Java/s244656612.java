import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    long N= Long.parseLong(sc.next());
    long ans =0;
    ans = (N / 11) * 2;
    if (N % 11 <= 6) {
      ans++;
    } else {
      ans += 2;
    }
    System.out.print(ans); 
  }
}