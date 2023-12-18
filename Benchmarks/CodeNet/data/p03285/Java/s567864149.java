import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i < 101; i++) {
      for (int j = 1; j < 101; j++) {
        if (4*i + 7*j == n) {
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}
