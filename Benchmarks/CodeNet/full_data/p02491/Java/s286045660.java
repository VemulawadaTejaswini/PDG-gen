import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    long a = in.nextLong();
    long b = in.nextLong();
    System.out.printf("%d %d %f\n", a / b, a % b, (float)a / b);
  }
}