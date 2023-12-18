import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc = new Scanner(System.in);

  private void run() {
    String s = sc.next();
    System.out.println(s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1));
  }
}
