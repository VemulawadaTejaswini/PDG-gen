import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = sc.next();

    char[] c = s.toCharArray();

    for (int i = 0; i < a; i++) {
      if (c[i] == '-') {
        System.out.println("No");
        return;
      }
    }

    if (c[a] != '-') {
      System.out.println("No");
      return;
    }

    for (int i = a+1; i < b; i++) {
      if (c[i] == '-') {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");

  }

}
