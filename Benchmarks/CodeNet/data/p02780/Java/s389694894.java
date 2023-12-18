import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    List<Integer> p = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      p.add(sc.nextInt());
    }

    List<Double> d = p.stream()
                      .map(x -> (double)((1 + x) / 2.0))
                      .collect(Collectors.toList());

    double max = 0;

    for (int i = 0; i <= N - K; i++) {
      double s = d.stream()
                  .skip(i)
                  .limit(K)
                  .reduce(0.0, Double::sum);

      if (s > max) max = s;
    }


    System.out.println(max);

    sc.close();
  }
}