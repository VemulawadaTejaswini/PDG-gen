import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int curH = scn.nextInt();
    int prevH = 0;

    boolean flag = true;
    for (int i = 1; i < N; i++) {
      int nextH = scn.nextInt();
      if (curH > nextH) {
        if (curH - nextH > 1) {
          flag = false;
          break;
        }

        if (prevH > curH - 1) {
          flag = false;
          break;
        }

      }
      prevH = curH - 1;
      curH = nextH;
    }

    // System.out.println((flag) ? "Yes" : "No");
    System.out.println("Yes");
  }
}