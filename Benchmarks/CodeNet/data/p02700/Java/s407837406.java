import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    boolean t = true;

    while(a > 0 && c > 0) {
      c = c - b ;
      a = a - d ;

      if (a <= 0) {
        t = false;
        break;
      }

      if (c <= 0) {
        t = true;
        break;
      }
      
    }


    if (t = true) {
      System.out.println("Yes");
    }
    if (t = false) {
      System.out.println("No");
    }
  }
}
