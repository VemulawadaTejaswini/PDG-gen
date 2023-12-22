import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    if (b == 0) {
      return;
    }
    System.out.printf("%d %d %f%n", a / b, a % b, a / (float)b);
  }
}