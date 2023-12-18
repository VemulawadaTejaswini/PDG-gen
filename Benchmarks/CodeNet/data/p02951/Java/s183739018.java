import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = a - (b + c);
    if (x <= 0) {
      System.out.println(Math.abs(x));
    } else {
      System.out.println(0);
    }
  }
}