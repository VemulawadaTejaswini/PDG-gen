import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    long x = sc.nextInt();
    long ans = 0;
    if(a == 0) {
      ans = b / x + 1;
    } else {
      ans = b / x - a / x; 
    }
    System.out.println(ans);
  }
}