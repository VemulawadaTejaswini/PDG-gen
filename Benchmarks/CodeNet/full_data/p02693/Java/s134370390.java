import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = 0; i < 1000; i++) {
      if (a <= i*k && i*k <= b) {
        System.out.println("OK");
        return;
      }
    }

    System.out.println("NG");

  }

}
