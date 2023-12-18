import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      if (i + 1 != sc.nextInt()) {
        cnt++;
      }
    }
    if (cnt == 0 || cnt == 2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
