import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    if (a < b && b < c) {
      System.out.println(a + " " + b + " " + c);
    } else if (a < c && c < b) {
      System.out.println(a + " " + c + " " + b);
    } else if (b < a && a < c) {
      System.out.println(b + " " + a + " " + c);
    } else if (b < c && c < a) {
      System.out.println(b + " " + c + " " + a);
    } else if (c < a && a < b) {
      System.out.println(c + " " + a + " " + b);
    } else if (c < b && b < a) {
      System.out.println(c + " " + b + " " + a);
    } else if (a == b && b < c) {
      System.out.println(a + " " + b + " " + c);
    } else if (a == b && b > c) {
      System.out.println(c + " " + b + " " + a);
    } else if (a == c && b < c) {
      System.out.println(b + " " + a + " " + c);
    } else if (a == c && b > c) {
      System.out.println(a + " " + c + " " + b);
    } else if (c == b && a < c) {
      System.out.println(a + " " + b + " " + c);
    } else if (c == b && a > c) {
      System.out.println(c + " " + b + " " + a);
    }
  }
}