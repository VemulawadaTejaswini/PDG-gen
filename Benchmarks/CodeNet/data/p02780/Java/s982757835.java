import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] P = new int[N];
    for (int i = 0; i < N; i++) {
      P[i] =sc.nextInt();
    }
    
    int sum = 0;
    for (int i = 0; i < K; i++) {
      sum += P[i];
    }
    int max = sum;
    if (N > K) {
      for (int i = 0; i < N-K; i++) {
        sum = sum - P[i] + P[i + K];
        if (sum > max) {
          max = sum;
        }
      }
    }
    double expVal = (max + K) / 2.0;
    
    System.out.println(expVal);
  }
}