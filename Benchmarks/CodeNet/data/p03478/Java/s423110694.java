import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int result = 0;
    for (int i = 1; i <= N; i++) {
      int tmp = digitSum(i);
      if (tmp >= A && tmp <= B) {
        result += i;
      }
    }
    System.out.println(result);
  }

  public static int digitSum(int number) {
    int sum = 0;
    while (number > 0) {
      sum += (number % 10);
      number /= 10;
    }
    return sum;
  }
}