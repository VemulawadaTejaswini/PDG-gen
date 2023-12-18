import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Q = sc.nextInt();
    long A[] = new long[Q];
    long B[] = new long[Q];
    for (int i=0; i<Q; i++) {
      long j = sc.nextLong();
      long k = sc.nextLong();
      if (j > k) {
        A[i] = k;
        B[i] = j;
      } else {
        A[i] = j;
        B[i] = k;
      }
    }

    for (int i=0; i<Q; i++) {
      if (A[i] == B[i]) {
        System.out.println(2*(A[i]-1));
        continue;
      }
      if (B[i] - A[i] == 1) {
        System.out.println(2*(A[i]-1));
        continue;
      }
      // (A[i]-i) * (B[i]+i) are always lower than the score.
      // (B[i]+i) * (A[i]-i) are always lower than the score. 
      long score = A[i]*B[i];
      double tmp = Math.sqrt((double)score);
      long C = Math.round(tmp) + 1;
      while (C*C >= score) {
        C--;
      }
      long ans;
      if (C*(C+1) >= score) {
        ans = 2*C - 2;
      } else {
        ans = 2*C - 1;
      }
      System.out.println(ans);
    }
  }
}