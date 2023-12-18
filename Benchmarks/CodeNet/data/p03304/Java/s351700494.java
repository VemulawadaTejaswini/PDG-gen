import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int d = sc.nextInt();
    // n=6, d=2
    // 6,5,4,3,2,1
    // 1,1,2,2,1,1 8
    // max(n-d,0)*2
    // n=3,d=2
    // 3,2,1
    // 1,0,1
    float ans = d == 0
      ? (float)(m-1)/n
      : (float)((long)(m-1)*(n-d)*2)/((long)n*n);
    
    System.out.println(ans);
  }
}