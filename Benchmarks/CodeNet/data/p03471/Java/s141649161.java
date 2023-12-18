import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int y = sc.nextInt();

    int s1 = -1;
    int s2 = -1;
    int s3 = -1;
    
    LABEL: for (int i = 0; i <= n; i++) {
      int x1 = n - i;
      for (int j = 0; j <= x1; j++) {
        int x2 = x1 - j;
        for (int k = 0; k <= x2; k++) {
          int sum = 10000 * i + 5000 * j + 1000 * k;
          if (sum == y) {
            s1 = i;
            s2 = j;
            s3 = k;
            break LABEL;
          }
        }
      }
    }
    
    System.out.println(s1 + " " + s2 + " " + s3);
  }
}