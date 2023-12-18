import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int N = scn.nextInt();

    int count = 0;
    for (int i = 1; i <= N; i++) {
      int p = scn.nextInt();
      if (p != i) {
        count++;
      }

    }
    if (count == 2 || count == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}