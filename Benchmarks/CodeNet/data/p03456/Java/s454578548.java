import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    String str = a + b;
    int c = Integer.parseInt(str);

    for (int i = 1; i <= 1000 ; i++ ) {
      if ((i * i) == c) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
