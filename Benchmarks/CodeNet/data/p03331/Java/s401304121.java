import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int min = Integer.MAX_VALUE;
    for (int i = 1; i < N; i++) {
      int s = count(i) + count(N - i);
      min = Math.min(min, s);
    }
    System.out.println(min);
  }

  static int count(int v) {
    int ret = 0;
    while (v > 0) {
      ret += v % 10;
      v /= 10;
    }
    return ret;
  }

}
