import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = 0;
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] A = new long[N];
    long[] B = new long[N*(N-1)/2];
    for(int i = 0;i < N;i++){
      A[i] = sc.nextLong();
    }
      for(int i = 0;i < N;i++){
        for(int j = i + 1;j < N;j++){
          B[k] = A[i]*A[j];
          k++;
        }
      }
    Arrays.sort(B);
    System.out.println(B[K-1]);
  }
}
