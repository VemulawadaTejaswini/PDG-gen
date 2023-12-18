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
      long ans = 2*(A[i] - 1);
      long score = A[i]*B[i];
      for (long j=A[i]+1;j<B[i];j++) {
        long k = score/j;
        if (k*j == score) {
          k--;
        }
        if (j>k) {
          break;
        } else if (j==k) {
          ans++;
          break;
        }
        ans += 2;
      }
      ans++; // B[i]-1, A[i]
      System.out.println(ans);
    }
  }
}