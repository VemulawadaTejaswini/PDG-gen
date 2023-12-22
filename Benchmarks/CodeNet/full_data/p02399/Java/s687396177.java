import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt(), y = in.nextInt();
    
    int d = x / y;
    int r = x % y;
    double f = (double)x/y;
    
    System.out.println(d + " "+ r + " " + f);
  }
}