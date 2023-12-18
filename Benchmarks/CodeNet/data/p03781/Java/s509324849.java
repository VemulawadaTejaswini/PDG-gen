import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    long sum = 0;
    for (int i = 1; ; i++) {
      sum += i;
      if (sum >= N) {
        System.out.println(i);
        return;
      }
    }

  }

}
