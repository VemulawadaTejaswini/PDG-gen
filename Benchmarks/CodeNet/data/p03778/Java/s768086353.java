import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a + W < b) {
      System.out.println(b - a - W);
    }
    if (a > b + W) {
      System.out.println(a - b - W);
    }
    if (a <= b && a + W >= b) {
      System.out.println(0);
    }
    if (a >= b && b + W >= a) {
      System.out.println(0);
    }
  }
}
