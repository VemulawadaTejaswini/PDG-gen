import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    boolean flag = false;
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if (a % 2 == 0) {
        if (a % 3 == 0 || a % 5 == 0) {
          flag = true;
        } else {
          System.out.println("DENIED");
          return;
        }
      }
    }

    if (!flag) {
      System.out.println("DENIED");
    } else {
      System.out.println("APPROVED");
    }
  }
}
