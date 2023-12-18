import java.util.*;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] C = new int[N];
    int[] S = new int[N];
    int[] F = new int[N];
    int[] wait = new int[N];
    int[] ans = new int[N];
    for (int i =0; i<N-1; i++) {
      C[i] = sc.nextInt();
      S[i] = sc.nextInt();
      F[i] = sc.nextInt();
    }
    ans[N-1] = 0;
    if (N>=2) ans[N-2] = C[N-2] + S[N-2];
    wait[N-2] = S[N-2];
    
    for (int i =N-3; i>=0; i--) {
      ans[i] = ans[i+1];
      wait[i] = wait[i+1];
      int CS = C[i] + S[i];
      wait[i] -= CS;
      if (wait[i]>=0) {
        continue;
      } else {
        ans[i] += CS - S[i+1];
        while ((CS - S[i+1]) % F[i+1] != 0) {
          CS++;
        }
      }
    }
    for (int i =0; i<=N-1; i++) {
      System.out.println(ans[i]);
    }
  }
}