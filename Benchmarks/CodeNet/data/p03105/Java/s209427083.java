import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int price = sc.nextInt();
    int total = sc.nextInt();
    int maxCount = sc.nextInt();

    if (price * maxCount <= total) {
      System.out.println(maxCount);
    } else {

      int count = 0;
      for (int i = 1; i <  maxCount; i++ ) {
        if (price * i <= total) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
