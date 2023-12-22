import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      long m = scanner.nextLong();
      long n = scanner.nextLong();
      long orgm = m;
      long orgn = n;
      long gcd = 0;
      if (n > m) {
        long temp = m;
        m = n;
        n = temp;
      }
      while (n != 0) {
        long temp = n;
        n = m % n;
        m = temp;
      }
      gcd = m;
      out += gcd + " " + (orgm * orgn) / gcd + "\n";
    }
    System.out.print(out);
  }
}