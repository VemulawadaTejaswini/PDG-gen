import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int max = 0;
    int min = 100;
    int[] X = new int[N];
    for (int i = 0; i < N; i++) {
      X[i] = sc.nextInt();
      if (X[i] > max) {
        max = X[i];
      }
      if (X[i] < min) {
        min = X[i];
      }
    }
    int[] sum = new int[max-min];
    for (int i = 0; i < N; i++) {
      for (int P = 0; P <= max-min+1; P++) {
        sum[P] += ((P+min) - X[i]) * ((P+min) - X[i]);
      }
    }
    Arrays.sort(sum);
    System.out.println(sum[0]);

  }
}