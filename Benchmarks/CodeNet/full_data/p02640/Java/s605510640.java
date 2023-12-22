import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    b();
  }

  public static void b() {
    try (Scanner sc = new Scanner(System.in)) {
      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());
      int kame = 4;
      int tsuru = 2;
      int kamegoukei = 0;
      int tsurugoukei = 0;
      String hantei = "No";

      for (int a = 0; a <= x; a++) {
        kamegoukei = a * kame;
        tsurugoukei = (x - a) * tsuru;
        if (kamegoukei + tsurugoukei == y) {
          hantei = "Yes";
        }
      }
      System.out.println(hantei);

    } catch (Exception E) {
      System.out.println("エラー");
    }
  }
}