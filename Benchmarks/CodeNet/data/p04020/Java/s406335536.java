import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int p = 0;
    int ki = 0;
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      sum += a;
      if(a % 2 == 1) ki++;
      if((a == 0) || (i == n - 1)) {
        if(ki % 2 == 1) p++;
        ki = 0;
      }
    }
    System.out.println((sum - p) / 2);
  }
}