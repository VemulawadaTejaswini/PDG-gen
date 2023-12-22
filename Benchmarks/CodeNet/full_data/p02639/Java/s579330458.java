import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc;

  private void run() {
    sc = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      int num = Integer.parseInt(sc.next());
      if (num == 0) {
        System.out.println(i + 1);
        break;
      }
    }
  }
}
