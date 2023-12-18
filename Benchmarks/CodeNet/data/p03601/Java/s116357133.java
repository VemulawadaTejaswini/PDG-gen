import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();
    int sum = 0;
    int satou = 0;
    int g = gcd(c, d);
    int c0 = c / g;
    int d0 = d / g;
    int[] mod = new int[d0];
    for(int i = 0; i < d0; i++) {
      mod[(c0 * i) % d0] = c0 * i;
    }
    int g1 = gcd(a, b);
    int a0 = a / g1;
    int b0 = b / g1;
    int[] mod1 = new int[b0];
    for(int i = 0; i < b0; i++) {
      mod1[(a0 * i) % b0] = a0 * i;
    }
    for(int i = 1; i <= (f / 100); i++) {
      if(((i % g1) == 0) && (i >= mod1[i % b0])) {
        int amari = f - (100 * i);
        for(int j = amari; j >= 0; j--) {
          if(((j % g) == 0) && (j >= mod[j % d0])) {
            int s = 100 * i + j;
            if(j <= e * i) {
            if(s * satou <= j * sum) {
              satou = j;
              sum = s;
              break;
            }
            }
          }
        }
      }
    }
    if(sum == 0) {
      sum = 100 * a;
    }
    System.out.print(sum);
    System.out.print(" ");
    System.out.println(satou);
  }
  public static int gcd(int a, int b) {
    if(b == 0) return a;
    return gcd(b, a % b);
  }
}