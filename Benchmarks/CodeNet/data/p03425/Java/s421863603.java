import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int m = 0;
    int a = 0;
    int r = 0;
    int c = 0;
    int h = 0;
    for (int i = 0; i < N; i++) {
      String s = sc.next();
      if (s.charAt(0) == 'M') m++;
      if (s.charAt(0) == 'A') a++;
      if (s.charAt(0) == 'R') r++;
      if (s.charAt(0) == 'C') c++;
      if (s.charAt(0) == 'H') h++; 
    }
    long ans = 0;
    if (m > 0) {
      ans += (m * a * r) + (m * a * c) + (m * a * h) + (m * r * c) + (m * r * h) + (m * c * h);
    }
    if (a > 0) {
      ans += (a * r * c) + (a * r * h) + (a * c * h);
    }
    if (r > 0) {
      ans += (r * c * h);
    }
    System.out.println(ans);
  }
}