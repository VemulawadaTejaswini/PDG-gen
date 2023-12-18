import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count_y = 0;
    for (int i = 0; i < N; i++) {
      String tmp = sc.next();
      if (tmp.charAt(0) == 'Y') {
        count_y++;
      }
    }
    if (count_y > 0) {
      System.out.println("Four");
    } else {
      System.out.println("Three");
    }
  }
}