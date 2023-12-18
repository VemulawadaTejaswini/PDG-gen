import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    String ans = "No";
    LABEL:for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        if (i * j == n) {
          ans = "Yes";
          break LABEL;
        }
      }
    }
    System.out.println(ans);
  }
}
