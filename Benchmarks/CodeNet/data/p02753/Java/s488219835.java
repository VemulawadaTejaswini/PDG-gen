import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private Scanner sc = new Scanner(System.in);

  private void run() {
    String S = sc.next();
    if (S.contains("A") && S.contains("B")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
