import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int nNot2and4 = 0;
    int n2 = 0;
    int n4 = 0;
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      if (a % 4 == 0) {
        n4++;
      } else if (a % 2 == 0) {
        n2++;
      } else {
        nNot2and4++;
      }
    }

    System.out.println(n4 >= nNot2and4 + (n2 % 2) - 1 ? "Yes" : "No");
  }
}