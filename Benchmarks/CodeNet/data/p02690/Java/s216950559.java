import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    long x = scan.nextLong();

    int h = (int) Math.pow(x, 0.2);

    for (int i = -h + 1; i < h; i++) {
      double a = Math.pow(Math.pow(i, 5) + x, 0.2);
      String s = Double.toString(a);
      int len = s.length();
      int dot = s.indexOf('.');
      int j = dot + 1;
      while (true) {
        if (s.charAt(j) != '0') {
          break;
        }
        if ((j == len - 1) || (j == dot + 13)) {
          System.out.println((int) a + " " + i);
          return;
        }
        j++;
      }
    }

  }

}