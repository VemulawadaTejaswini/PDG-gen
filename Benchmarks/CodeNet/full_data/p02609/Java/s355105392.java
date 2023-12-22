import java.util.*;

public class Main {

  private static void solve(int N, int X) {
    for (int i = N - 1; i >= 0; i--) {
      int Xi = X ^ (1 << i);
      System.out.println(getNumberOfSteps(Xi));
    }
  }

  private static int getNumberOfSteps(int i) {
    int steps = 0;
    while (i != 0) {
      int bitCnt = Integer.bitCount(i);
      i = i % bitCnt;
      steps++;
    }
    return steps;
  }

  public static void main(String[] args) {
    int N = scanner.nextInt();
    int X = Integer.parseInt(scanner.next(), 2);
    solve(N, X);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
