import java.util.*;

public class Main {

  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int k = scan.nextInt();
  int x = scan.nextInt();
  int y = scan.nextInt();
  System.out.println(k * x + (n - k) * y);
  }
}
