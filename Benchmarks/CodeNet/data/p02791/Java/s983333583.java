import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int cnt = 1;
    for (int i = 0; i < N - 1; i++) {
      int B = A;
      A = sc.nextInt();
      if (A <= B) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
