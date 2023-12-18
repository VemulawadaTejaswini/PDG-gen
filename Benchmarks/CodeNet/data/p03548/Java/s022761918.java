import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc = new Scanner(System.in);

  private void run() {
    int X = Integer.parseInt(sc.next());
    int Y = Integer.parseInt(sc.next());
    int Z = Integer.parseInt(sc.next());

    int man = X / Y;

    while (true) {
      if (man * Y + Z * (man + 1) > X) {
        man--;
      } else {
        break;
      }
    }
    System.out.println(man);
  }
}
