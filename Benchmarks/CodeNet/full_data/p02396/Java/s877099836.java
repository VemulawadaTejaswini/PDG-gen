import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    while (true) {
      int n = sc.nextInt();
      if (n == 0) {
        return;
      }
      System.out.println("Case " + i + ": " + n);
      i++;
    }
  }
}
