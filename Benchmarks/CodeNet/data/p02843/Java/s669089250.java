import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    for (int i = 0; i < x; i++) {
      int high = i * 105;
      int low = i * 100;
      if (low <= x && x <= high) {
        System.out.println(1);
        return;
      }
    }

    System.out.println(0);

  }

}
