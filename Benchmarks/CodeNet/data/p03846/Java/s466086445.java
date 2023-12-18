import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N= sc.nextInt();
    int check =0, total =0;
    int[] A = new int[N];
    for (int i =0; i<N; i++) {
      int b = sc.nextInt();
      if (b * N % 2 != 0 || b >= N) {
        check++;
        break;
      }
      A[b]++;
      total += b;
    }
    if (total != N * N / 2) check++;
    for (int i=N-1; i>0; i -=2) {
      if (A[i] != 2) check++;
    }
    if (check != 0) {
      System.out.println(0);
    } else {
      long ans =1;
      for (int i =1; i<= N/2; i++) {
        ans *= 2;
        ans %= 1000000007;
      }
      System.out.println(ans);
    }
  } 
}