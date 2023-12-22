import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int payment = sc.nextInt();
    if (payment % 1000 == 0) {
      System.out.println(0);
    } else {
      int charge = 1000 - (payment % 1000);
      System.out.println(charge);
    }
  }
}
