import java.util.Scanner;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int T = sc.nextInt();
    int minCost = 0;

    for (int i = 0; i < N; i++) {

      int c1 = sc.nextInt();
      int t1 = sc.nextInt();

      if (t1 <= T) {
        if (minCost == 0 || c1 < minCost) {
          minCost = c1;
        }
      }
    }
    
    System.out.println(minCost == 0 ? "TLE" : minCost);
  }
}