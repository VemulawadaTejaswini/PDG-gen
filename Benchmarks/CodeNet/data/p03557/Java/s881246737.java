import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int N = in.nextInt();
      int A[] = new int[N+1];
      int B[] = new int[N+1];
      int C[] = new int[N+1];

      int ans = 0;

      for(int cnt = 0; cnt < N; cnt++) {
          A[cnt] = in.nextInt();
      }
      for(int cnt = 0; cnt < N; cnt++) {
          B[cnt] = in.nextInt();
      }
      for(int cnt = 0; cnt < N; cnt++) {
          C[cnt] = in.nextInt();
      }

      for(int cnt = 0; cnt < N; cnt++) {
          for(int cnt2 = 0; cnt2 < N; cnt2++) {
              for(int cnt3 = 0; cnt3 < N; cnt3++) {
                  if((A[cnt] < B[cnt2])&&(B[cnt2] < C[cnt3])) {
                      ans++;
                  }
              }
          }
      }
      System.out.println(ans);

    }
}