import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    long X = Integer.parseInt(sc.next());

    int x[] = new int[N];
    long sumx = 0;
    for (int i = 0; i < N; i++) {
      x[i] = Integer.parseInt(sc.next());
      sumx += x[i];
    }

    long ans = X * N + 5 * sumx + X;
    if (N <= 2) {
      System.out.println(ans);
      return;
    }
    long tmp = ans;
    int i = N - 3;
    while (i >= 0) {
      long cost = 0;
      long sum = 0;
      while (i >= 0) {
        sum += x[i] * 2;
        cost += sum;
        if (cost <= X) {
          tmp += sum;
          i--;
        } else {
          tmp += X;
          break;
        }
      }
      i = i - 2;
    }

    i = 2;
    while (i < N) {
      long cost = 0;
      long sum = 0;
      while (i < N) {
        sum += x[i - 2] * 2;
        cost += sum;
        if (cost <= X) {
          ans += sum;
          i++;
        } else {
          ans += X;
          break;
        }
      }
      i = i + 2;
    }
    ans = Math.min(ans, tmp);
    System.out.println(ans);
  }
}