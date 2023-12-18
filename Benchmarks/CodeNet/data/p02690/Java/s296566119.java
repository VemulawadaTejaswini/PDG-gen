import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    long x = scan.nextLong();

    int h = (int) Math.pow(x, 0.2);

    for (int i = -h + 1; i < h; i++) {
      double a = Math.pow(Math.pow(i, 5) + x, 0.2);
      String s = Double.toString(a);
      s = s.substring(0, 12);
      a = Double.parseDouble(s);
      if (a == Math.floor(a)) {
        System.out.println((int) a + " " + i);
        return;
      }
    }

  }

}