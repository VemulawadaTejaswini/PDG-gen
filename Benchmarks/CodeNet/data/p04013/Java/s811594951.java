import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a = sc.nextInt();

    int[] x = new int[n];
    for (int i = 0; i < n; i++)
      x[i] = sc.nextInt();

    int r = (int)Math.pow(2, n);
    int sum = 0;
    int avg = 0;
    int cnt = 0;
    for (int i = 0; i < r; i++) {
      sum = 0;
      avg = 0;
      for (int j = 0; j < n; j++) {
        if ((1 & i >> j) == 1) {
          sum += x[j];
          avg += a;
        }
      }
      if (avg == sum && avg != 0) cnt++;
    }
    
    System.out.println(cnt);
  }
}