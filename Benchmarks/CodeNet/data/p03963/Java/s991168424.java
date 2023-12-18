import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    sc.close();

    long count = 1;

    for (int i = 0; i < N; i++) {
      if (i == 0) {
        count *= K;
      } else {
        count *= (K - 1);
      }
    }

    System.out.println(count);

  }

}