import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 1;
    long max = 1000000000000000000L;

    for (int i = 0; i < n; i++) {
      long a = sc.nextLong();
      if (a== 0) {
        sum = 0;
        break;
      }
      sum *= a;
    }
    if (sum > max) {
      sum = -1;
    }
    System.out.println(sum);
  }
}