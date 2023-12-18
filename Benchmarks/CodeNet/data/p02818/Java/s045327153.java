import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    long a = Long.parseLong(stdIn.next());
    long b = Long.parseLong(stdIn.next());
    long k = Long.parseLong(stdIn.next());

    long ansA = 0;
    long ansB = 0;
    if (a <= k) {
      ansA = 0;
      ansB = b - (k - a);
      if (ansB < 0) ansB = 0;
    } else {
      ansA = a - k;
      ansB = b;
    }

    System.out.println(ansA + " " + ansB);
  }
}
