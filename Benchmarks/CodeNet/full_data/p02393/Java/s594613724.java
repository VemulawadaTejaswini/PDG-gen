import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    if (a > b) {
      int t = a;
      a = b;
      b = t;
    }
    if (b > c) {
      int t = b;
      b = c;
      c = t;
    }
    if (a > b) {
      int t = a;
      a = b;
      b = t;
    }
    System.out.println(a +" " +  b + " " + c);
  }
}