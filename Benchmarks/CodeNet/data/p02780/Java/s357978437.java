import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] p = new int[N];

    for (int i = 0; i < N; i++) {
      p[i] = sc.nextInt();
    }

    double[] d = Arrays.stream(p)
                       .mapToDouble(x -> (double)((1 + x) / 2.0))
                       .toArray();

    double max = 0;

    for (int i = 0; i <= N - K; i++) {
      double s = Arrays.stream(d)
                       .skip(i)
                       .limit(K)
                       .reduce(0.0, Double::sum);

      if (s > max) max = s;
    }


    System.out.println(max);

    sc.close();
  }
}