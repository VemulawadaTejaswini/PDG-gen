import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc = new Scanner(System.in);

  private void run() {
    long N = Long.parseLong(sc.next());
    long base = 0;
    while (true) {
      long nextBase = base + 1;
      if (nextBase * nextBase > N) {
        break;
      }
      base++;
    }
    System.out.println(base * base);
  }
}
