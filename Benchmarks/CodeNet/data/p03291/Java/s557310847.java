import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    int length = str.length();
    long div = 1000000007;

    long A = 0;
    long AB = 0;
    long ABC = 0;
    long Qcount = 0;

    for (int i = 0; i < length; i++) {
      String currentStr = String.valueOf(str.charAt(i));

      if (currentStr.equals("A")) {
        A = (A + (long)Math.pow(3, Qcount)) % div;
      } else if (currentStr.equals("B")) {
        AB = (AB + A) % div;
      } else if (currentStr.equals("C")) {
        ABC =  (ABC +AB) % div;
      } else if (currentStr.equals("?")) {
        ABC = (ABC * 3 + AB) % div;
        AB = (AB * 3 + A) % div;
        A = (A * 3 + (long)Math.pow(3, Qcount)) % div;
        Qcount++;
      }
    }

    System.out.println(ABC);
  }
}
