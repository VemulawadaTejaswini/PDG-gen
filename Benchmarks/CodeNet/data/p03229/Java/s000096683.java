import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++)
            A[i]  = sc.nextInt();
        Arrays.sort(A);
        sc.close();

        long sum1 = 0;
        long sum2 = 0;
        if (N % 2 == 0) {
            for (int i=0; i<N; i++) {
              if (i < N / 2 - 1) {
                sum1 -= 2 * A[i];
              } else if (i == N / 2 - 1) {
                sum1 -= A[i];
              } else if (i == N / 2) {
                sum1 += A[i];
              } else {
                sum1 += 2 * A[i];
              }
            }
            sum2 = sum1;
          } else {
            for (int i=0; i<N; i++) {
              if (i < N / 2) {
                sum1 -= 2 * A[i];
              } else if (i == N / 2 || i == N / 2 + 1) {
                sum1 += A[i];
              } else {
                sum1 += 2 * A[i];
              }
            }
            for (int i=0; i<N; i++) {
              if (i < N / 2 - 1) {
                sum2 -= 2 * A[i];
              } else if (i == N / 2 - 1 || i == N / 2) {
                sum2 -= A[i];
              } else {
                sum2 += 2 * A[i];
              }
            }
          }

        System.out.println(Math.max(sum1, sum2));
    }
}