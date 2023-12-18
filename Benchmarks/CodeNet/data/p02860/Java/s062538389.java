import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    boolean t = true;

    if (n%2 != 0) {
      t = false;
    }


      for (int i = 0 ; i < n/2 ; i++ ) {
        if (c[i] != c[i+n/2]) {
          t = false;
        }
      }


    if (t) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
