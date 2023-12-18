import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char[] c = str.toCharArray();

    for (int i = 0 ; i < str.length() ; i++) {
      c[i] = 'x';
    }

    for (int i  = 0 ; i < str.length() ; i++ ) {
      System.out.print(c[i]);
    }
  }
}
