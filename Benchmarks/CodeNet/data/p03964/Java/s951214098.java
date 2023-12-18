import java.util.*;
 
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[][] x = new long[N][2];
    boolean hantei = true;

    for (int i = 0; i < N ; i++) {
      x[i][0] = sc.nextInt();
      x[i][1] = sc.nextInt();

      long a = 0;
      long b = 0;
      long c = 0;

        if( i > 0 && (x[i][0] < x[i - 1][0] || x[i][1] < x[i - 1][1])){
          a = (x[i-1][0] % x[i][0] != 0) ? (x[i-1][0] / x[i][0]) + 1:(x[i-1][0] / x[i][0]);
          b = (x[i-1][1] % x[i][1] != 0) ? (x[i-1][1] / x[i][1]) + 1:(x[i-1][1] / x[i][0]);

          c = Math.max(a,b);

          x[i][0] = c * x[i][0];
          x[i][1] = c * x[i][1];
        }
    }

    System.out.println(x[N-1][0] + x[N-1][1]);
  }
}
