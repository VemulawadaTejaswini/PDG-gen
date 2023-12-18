import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int[] ans = new int[N];
    for (int i = 1; i <= N; i++) {
      int a = sc.nextInt();
      if (N%2 == 0) {
        if (i%2 == 0) {
          ans[N/2-1-(i-1)/2] = a;
        } else {
          ans[N/2+i/2] = a;
        }
      } else {
        if (i%2 == 1) {
          ans[N/2-i/2] = a;
        } else {
          ans[N/2+i/2] = a;
        }
      }
    }
    
    for (int i = 0; i < N; i++) {
      System.out.print(ans[i] + " ");
    }
    System.out.println();
  }
}