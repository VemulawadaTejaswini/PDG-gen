import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int r = in.nextInt();
    System.out.printf("%.6f %.6f\n", (double)r * r * Math.PI , (double)2 * r * Math.PI);
  }
}