import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    long x = scan.nextLong();

    int h = (int) Math.pow(x, 0.2);
    h++;

    for (int i = -h; i <= h; i++) {
      double a = Math.pow(Math.pow(i, 5) + x, 0.2);
      if (a == Math.floor(a)) {
        System.out.println((int) a + " " + i);
        return;
      }
    }

  }

}