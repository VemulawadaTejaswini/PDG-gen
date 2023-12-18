import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    
    int s = 0;
    for (int i = 0; i < N; i++) {
      s += i%2 == 0 ? A[i] : -A[i];
    }

    int[] x = new int[N];
    x[0] = s/2;
    for (int i = 1; i < N; i++) {
      x[i] = A[i-1]-x[i-1];
    }
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < N; i++) {
      ans.append(2*x[i]).append(" ");
    }
    
    System.out.println(ans.toString());
  }
}