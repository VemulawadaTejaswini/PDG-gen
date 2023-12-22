import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double r = Integer.parseInt(sc.next());
      System.out.println(r * r * Math.PI + " " + 2.0 * Math.PI * r);
  }
}