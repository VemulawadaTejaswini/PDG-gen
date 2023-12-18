import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    sc.close();

    int gcd = gcd(A[0], A[1]);

    for (int i = 2; i < N-1; i++) {
      gcd = gcd(gcd, A[i]);
    }

    System.out.println(gcd);

  }

  public static int gcd(int x, int y){

    if (b == 0) {
      return a;
    }

    return gcd(b, a % b);

  }

}