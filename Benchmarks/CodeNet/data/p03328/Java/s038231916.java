import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 0;

    for (int i = 1; i < 999; i++) {
      sum += i;
      if (a <= sum) {
        System.out.println(sum-a);
        break;
      }
    }
  }

}
