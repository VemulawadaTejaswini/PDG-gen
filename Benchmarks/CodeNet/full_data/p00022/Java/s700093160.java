import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      final int n = sc.nextInt();

      if(n == 0) break;

      int[] as = new int[n];
      for(int i = 0; i < n; i++) as[i] = sc.nextInt();

      long max = -100000;
      long sum = 0;

      for(int i = 0; i < n; i++) {
        sum += as[i];

        if(max < sum) max = sum;
        if(sum <= 0) sum = 0;
      }

      System.out.println(max);
    }
  }

  private final Scanner sc = new Scanner(System.in);
}