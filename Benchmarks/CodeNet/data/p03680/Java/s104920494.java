import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] a = new int[N + 1];

    for (int i =1; i < N+1; i++) {
      a[i] = sc.nextInt();
    }

    boolean b = true;
    int sq = 0;
    int cr = 1;

    while (b) {
      sq++;
      cr = a[cr];

      if (cr == 2) b = false;
      if (sq == N) {
        sq = 0;
        b = false;
      }
    }

    System.out.println(sq == 0 ? -1 : sq);

  }

}
