import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int ans;
    if (a == b && b == c) {
      ans = 1;
    } else if (a == b || b == c || c == a) {
      ans = 2;
    } else {
      ans = 3;
    }
    
    System.out.println(ans);
  }
}