import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = 0;
      while (sc.hasNext()) {
        String h = sc.next();
        if (h.equals("-")) {
          a = 0;
          break;
        }
        int n = sc.nextInt();
        while (sc.hasNextInt()) {
          int m = sc.nextInt();
          String latter = h.substring(m);
          String former = h.substring(0,m);
          h = latter + former;
          a = 1;
        }
        if (a == 1) System.out.println(h);
      }

    }
}
