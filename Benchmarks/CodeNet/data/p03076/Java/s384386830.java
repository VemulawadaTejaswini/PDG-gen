import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = 5;
    int[] list = new int[count];
    for (int i = 0; i < count ; i++ ) {
      list[i] = sc.nextInt();
    }

    int loss = 0;
    int maxLoss = 0;
    int result = 0;

    for (int i = 0; i < count; i++ ) {
      int order = list[i];

      if (order % 10 == 0) {
        loss = 0;
      } else {
        loss = 10 - (order % 10);
        maxLoss = Math.max(loss, maxLoss);
      }

      result += order + loss;
    }
    System.out.println(result - maxLoss);
  }
}
