import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int y = in.nextInt();
     
    int d = x / y;
    int r = x % y;
    double f = 1.0 * x / y;
    String s = new java.text.DecimalFormat("####0.0#############################").format(d);
    System.out.println(d + " "+ r + " " + s);
  }
}