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
    double noudo = 0;
    int g = gcd(c, d);
    int c0 = c / g;
    int d0 = d / g;
    int[] mod = new int[d0];
    for(int i = 0; i < d0; i++) {
      mod[(c0 * i) % d0] = c0 * i;
    }
    for(int i = 0; i <= 30; i++) {
      for(int j = 0; j <= 30; j++) {
        for(int k = 1; k <= f; k++) {
          if(100 * a * i + 100 * b * j <= k) {
            int amari = k - 100 * a * i - 100 * b * j;
            if(amari % g == 0) {
              int s = amari / g;
              if(s <= mod[s % d0]) {
                double temp = (double)(100 * amari) / (double)(k);
                if(100 * amari <= e * k) {
                  if(temp >= noudo) {
                    noudo = temp;
                    sum = k;
                    satou = amari;
                  }
                }
              }
            }
          }
        }
      }
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