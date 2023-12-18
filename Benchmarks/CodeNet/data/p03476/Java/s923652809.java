import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int Q = Integer.parseInt(sc.next());
    
    int l[] = new int[Q];
    int r[] = new int[Q];
    for (int i = 0; i < Q; i++) {
      l[i] = Integer.parseInt(sc.next());
      r[i] = Integer.parseInt(sc.next());
    }
    final int max = 100000;
    boolean p[] = new boolean[max + 1];
    p[0] = false;
    p[1] = false;
    p[2] = true;
    for (int i = 3; i < max + 1; i++) {
      p[i] = true;
      for (int j = 2; j * j <= i; j++) {
        if (i % j == 0) {
          p[i] = false;
          break;
        }
      }
    }
    int sum[] = new int[max / 2 + 1];
    sum[0] = 0;
    for (int i = 1; i < max / 2; i++) {
      int N = 2 * i - 1;
      if (p[N] && p[i]) {
        sum[i] = sum[i - 1] + 1;
      } else {
        sum[i] = sum[i - 1];
      }
    }
    
    for (int i = 0; i < Q; i++) {
      System.out.println(sum[(r[i] + 1) / 2] - sum[(l[i] - 1) / 2]);
    }
  }
}