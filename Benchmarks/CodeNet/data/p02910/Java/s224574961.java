import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s[] = sc.next().split("");

    int a = 0;
    int b = 0;
    for (int i = 0; i < s.length; i++) {
      if (i % 2 == 0) {
        if (!(s[i].equals("R")) && !(s[i].equals("U")) && !(s[i].equals("D"))) a = 1;
      } else {
        if (!(s[i].equals("L")) && !(s[i].equals("U")) && !(s[i].equals("D"))) b = 1;
      }
    }

    if (a == 1 || b == 1) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }

  }
}
