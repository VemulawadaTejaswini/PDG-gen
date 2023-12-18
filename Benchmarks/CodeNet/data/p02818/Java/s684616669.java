import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long tCookie = sc.nextLong();
    long aCookie = sc.nextLong();
    long count = sc.nextLong();

    if (tCookie + aCookie == count) {
      System.out.println(0 + " " + 0);
    } else {
      for (int i = 0; i < count; i++) {
        if (tCookie > 0) {
          tCookie--;
        } else if (aCookie > 0) {
          aCookie--;
        } else if (tCookie == 0 && aCookie == 0) {
          break;
        }
      }
    }
  }
}
