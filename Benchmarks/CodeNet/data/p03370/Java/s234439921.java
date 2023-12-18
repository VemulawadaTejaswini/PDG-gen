import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());

    int m[] = new int[N];
    int sum = 0;
    int min = 1000;

    for (int i = 0; i < N; i++) {
      m[i] = Integer.parseInt(sc.next());
      sum += m[i];
      if (min > m[i]) {
        min = m[i];
      }
    }

    int rX = X - sum;
    int count = N + rX / min;

    System.out.println(count);

  }

}