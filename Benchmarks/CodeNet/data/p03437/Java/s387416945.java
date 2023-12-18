import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    if (X%Y == 0) {
      System.out.println(-1);
    } else {
      for (int i = 2; i < Y; i++) {
        if (X*i%Y != 0) {
          System.out.println(X*i);
          return;
        }
      }
    }
  }
}