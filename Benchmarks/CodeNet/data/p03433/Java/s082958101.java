import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int A = Integer.parseInt(sc.nextLine());
    int y =0;
    for (int i = 0;i<N; i++) {
      for (int j = 0; j <= A; j++) {
        y = 500 * i + j;
        if (y == N) {
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}