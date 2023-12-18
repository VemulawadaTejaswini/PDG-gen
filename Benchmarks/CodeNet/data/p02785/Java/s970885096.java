import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] H = new int[N];
    long sum = 0;
    long sum1 = 0;

    for (int i = 0; i < N; i++) {
      H[i] = sc.nextInt();
      sum = sum + H[i];
    }

    Arrays.sort(H);

      if (K < N && K != 0) {
        for(int i=0;i<N-K;i++) {
          sum1 = sum1 + H[i];
        }
        System.out.println(sum1);
      } else if (K == 0) {
        System.out.println(sum);
      } else if (K >= N) {
        System.out.println("0");
      }
    }
  }