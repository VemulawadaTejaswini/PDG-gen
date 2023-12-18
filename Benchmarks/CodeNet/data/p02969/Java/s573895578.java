import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc;

  private void run() {
    sc = new Scanner(System.in);
    int r = Integer.parseInt(sc.next());
    System.out.println(3 * Math.pow(r, 2));
  }
}
