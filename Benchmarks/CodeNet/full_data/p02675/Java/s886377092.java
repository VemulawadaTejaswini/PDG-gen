import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc;

  private void run() {
    sc = new Scanner(System.in);
    String N = sc.next();
    char c = N.charAt(N.length() - 1);
    if (c == '2' || c == '4' || c == '5' || c == '7' || c == '9') {
      System.out.println("hon");
    } else if (c == '0' || c == '1' || c == '6' || c == '8') {
      System.out.println("pon");
    } else {
      System.out.println("bon");
    }
  }
}
