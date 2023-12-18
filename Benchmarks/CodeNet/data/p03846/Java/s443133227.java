import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean check = true; int total =0; int[] A = new int[N];
    for (int i =0; i<N; i++) {
      int b = sc.nextInt();
      A[b]++; total += b;
    }
    if (N % 2 == 1 && A[0] != 1) check = false;
    for (int i=N-1; i>0; i -=2) {
      if (A[i] != 2) check = false;
    }
    if (total != N * N / 2) check = false;
    if (check) {
      long ans =1;
      for (int i =1; i<= N/2; i++) {
        ans *= 2; ans %= 1000000007;
      }
      System.out.println(ans);
    } else {
      System.out.println(0);
    }
  } 
}