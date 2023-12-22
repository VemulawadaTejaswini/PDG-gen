import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    String ans = "No";
    for(int i = 0; i <= x; i++) {
      int j = x - i;
      if((2 * i + 4 * j) == y) ans = "Yes";
    }
    System.out.println(ans);
  }
}