import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    if (n < 10) {
      System.out.println(n);
      return;
    }

    String s = Long.toString(n);
    long tmp = (long) Math.pow(10, s.length()) - 1;
    long miner = (long) Math.pow(10, s.length() - 1);

    while (true) {
      if (tmp <= n) {
        String o = Long.toString(tmp);
        int a = 0;
        for (int i = 0; i < o.length(); i++) {
          a += Character.getNumericValue(o.charAt(i));
        }
        System.out.println(a);
        return;
      }

      tmp -= miner;
    }

  }
}