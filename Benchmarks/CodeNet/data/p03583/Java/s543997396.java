// 4/N = 1/h + 1/n + 1/w
// 4hnw = N(nw + hw + hn)
// 120_000_000_000
// 4hnw-Nnw-Nhw = Nhn
// w(4hn-Nn-Nh) = Nhn

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int h = 1; h <= 3500; h++) {
      for (int n = 1; n <= 3500; n++) {
        long a = (long)N*h*n;
        long b = (long)4*h*n-(long)N*n-(long)N*h;
        if (b != 0 && a%b == 0
            && 1 <= a/b && a/b <= 3500) {
          System.out.println(h+" "+n+" "+a/b);
          return;
        }
      }
    }
  }
}