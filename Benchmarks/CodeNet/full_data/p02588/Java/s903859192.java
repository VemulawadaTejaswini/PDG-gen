import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[][] ko = new long[19][19];
    long t = 0;
    for(int i = 0; i < n; i++) {
      double A = sc.nextDouble();
      A = (double)Math.pow(10, 9) * A;
      long c = (long)(A + 0.00001);
      int x = 0;
      int y = 0;
      while((c % 2) == 0) {
        x++;
        c /= (long)2; 
      }
      while((c % 5) == 0) {
        y++;
        c /= (long)5; 
      }
      if(x > 18) x = 18;
      if(y > 18) y = 18;
      ko[x][y]++;
      if(((2 * x) >= 18) && ((2 * y) >= 18)) t++;
    }
    long ans = 0;
    for(int i = 0; i < 19; i++) {
      for(int j = 0; j < 19; j++) {
        for(int a = 18 - i; a < 19; a++) {
          for(int b = 18 - j; b < 19; b++) {
            ans += (ko[i][j] * ko[a][b]);
          }
        }
      }
    }
    ans -= t;
    ans /= (long)2;
    ans += t;
    System.out.println(ans);
  }
}
