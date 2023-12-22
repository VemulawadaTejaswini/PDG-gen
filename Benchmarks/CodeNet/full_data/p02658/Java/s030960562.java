import java.util.Scanner;
import java.util.Arrays;
  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long cnt = 1;
        long max = (long)Math.pow(10, 18);

          for(int i=N-1; i>=0; i--){
          A[i] = sc.nextLong();
            if(A[i]*cnt > max){
              System.out.println(-1);
              return;
            }
          }
          Arrays.sort(A);
          for(int i=0; i<N; i++){
            if(max<A[i]*cnt){
              System.out.println(-1);
              return;
            } else {
            cnt *= A[i];
            }
          }
            System.out.println(cnt);
    }