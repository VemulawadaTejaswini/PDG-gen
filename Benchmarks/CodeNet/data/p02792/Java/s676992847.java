import java.util.*;
import java.math.*;

public class Main{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] count = new int[10][10];
    for(int i = 1; i < n; ++i) {
      int cur = i;
      int j = i % 10;
      if(j == 0) continue;
      while(cur >= 10) {
        cur /= 10;
      }
      int k = cur % 10;
      if(k == 0) continue;
      ++count[j][k];
    }
    int res = 0;
    for(int i = 1; i < 10; ++i) {
      for(int j = 1; j < 10; ++j) {
        res += count[i][j] * count[j][i];
      }
    }
    System.out.println(res);
  }
}