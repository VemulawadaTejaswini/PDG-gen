import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = "";
    s += sc.next();
    s += sc.next();
    s += sc.next();

    int a = Integer.parseInt(s);

    if ((a % 4) == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}