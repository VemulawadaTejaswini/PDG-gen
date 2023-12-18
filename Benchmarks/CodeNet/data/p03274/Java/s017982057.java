import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] x = new int[N];

    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
    }

    sc.close();

    long min = Long.MAX_VALUE;

    for (int i = 0; i < N - K; i++) {
      long distance = Math.abs(x[i] - x[i + K-1]);
      if (x[i] < 0 && x[i + K-1] < 0) {
        distance += Math.abs(x[i + K-1]);
      } else if (0 < x[i] && 0 < x[i + K-1]) {
        distance += Math.abs(x[i]);
      } else {
        if (Math.abs(x[i]) < Math.abs(x[i + K-1])) {
          distance += Math.abs(x[i]);
        } else {
          distance += Math.abs(x[i + K-1]);
        }
      }

      min = Math.min(min, distance);
    }

    if (min == Long.MAX_VALUE) {
      min = 0;
    }
    
    System.out.println(min);

  }

}