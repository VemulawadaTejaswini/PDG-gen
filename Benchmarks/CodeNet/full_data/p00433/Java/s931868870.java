import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0; i < 4; i++) {
      int score = sc.nextInt();
      sum1 += score;
    }
    for (int i = 0; i < 4; i++) {
      int score = sc.nextInt();
      sum2 += score;
    }
    if (sum1 >= sum2) {
      System.out.println(sum1);
    } else {
      System.out.println(sum2);
    }
  }
}
