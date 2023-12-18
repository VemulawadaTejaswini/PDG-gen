import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String w = sc.next();
    int cnt = 0;
    for (int i = 0; i < w.length(); i++) {
      for (int j = 0; j < w.length(); j++) {
        if (w.charAt(i) == w.charAt(j)) {
          cnt++;
        }
      }
    }
    if (cnt % 2 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
