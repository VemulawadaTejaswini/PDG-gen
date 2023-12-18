import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    int ab = 0;
    int bc = 0;
    int ca = 0;

    for (int i = 0; i < n; i++) {
      if (a.charAt(i) != b.charAt(i)) {
        ab++;
      }
    }

    for (int i = 0; i < n; i++) {
      if (b.charAt(i) != c.charAt(i)) {
        bc++;
      }
    }

    for (int i = 0; i < n; i++) {
      if (c.charAt(i) != a.charAt(i)) {
        ca++;
      }
    }

    System.out.println((ab + bc + ca) - Math.max(Math.max(ab, bc), ca));

  }
}