import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private Scanner sc;

  private void run() {
    sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] array = new int[N];

    int left = 0;
    int right = 0;

    int sum = 0;
    for (int i = 0; i < N; i++) {
      array[i] = Integer.parseInt(sc.next());
      sum += array[i];
    }

    left = 0;
    right = sum;

    int ans = Integer.MAX_VALUE;

    for (int i = 0; i < N; i++) {
      left += array[i];
      right -= array[i];

      if (Math.abs(left - right) < ans) {
        ans = Math.abs(left - right);
      }
    }

    System.out.println(ans);
  }
}
