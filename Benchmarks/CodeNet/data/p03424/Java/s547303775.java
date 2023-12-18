import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];

    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }

    if (Arrays.asList(s).contains("Y")) {
      System.out.println("Four");
    } else {
      System.out.println("Three");
    }
  }

}
