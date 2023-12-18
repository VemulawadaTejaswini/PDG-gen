import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int T = Integer.parseInt(sc.next());
    int[] t = new int[N];

    for (int i = 0; i < N; i++) {
      t[i] = Integer.parseInt(sc.next());
    }

    int cnt = 0;
    int tmp = 0;
    for (int i = 0; i < N; i++) {
      if (t[i] < tmp) {
        cnt += t[i] - t[i - 1];
        tmp = t[i] + T;
      } else {
        cnt += T;
        tmp = t[i] + T;
      }
    }

    System.out.println(cnt);
    sc.close();
  }
}