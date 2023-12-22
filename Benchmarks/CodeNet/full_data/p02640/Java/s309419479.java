import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int ySum = 0;
    int sum = 0;
    boolean check = false;
    for (int i = 0; i < x; i++) {
      for (int j = 1; j+i <= x; j++) {
        ySum += 2;
        if (j+i == x) {
          sum += ySum;
          if (sum == y) {
            check = true;
          } else {
            sum -= ySum;
            ySum = 0;
          }
        }
      }
      sum += 4;
    }
    if (sum == y) {
      check = true;
    }
    System.out.println(check ? "Yes" : "No");
  }
}
