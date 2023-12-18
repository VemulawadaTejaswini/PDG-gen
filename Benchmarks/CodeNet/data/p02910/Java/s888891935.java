import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int check =0;
    for (int i=0; i<=S.length()/2; i++) {
      if (S.charAt(2 * i) == 'L') {
        check++;
        break;
      }
      if (S.charAt(2 * i + 1) == 'R') {
        check++;
        break;
      }
    }
    if (check != 0) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}