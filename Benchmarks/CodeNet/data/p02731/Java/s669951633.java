import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    int n = sc.nextInt();
    int res = 0;
    for(int i = 1; i <= n; ++i) {
      for(int j = i; j <= n - i; ++j) {
        int k = n - i - j;
        res = Math.max(res, i * k * j);
      }
    }
    System.out.println(Math.pow((double)n / 3, 3) );
  }
}