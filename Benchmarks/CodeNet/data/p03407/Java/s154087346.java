
import java.util.Scanner;

public class team_formation1_b {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int c = in.nextInt();
    if ((n + m) >= c) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}