import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), K=sc.nextInt(), sum=0;
    int A[] = new int[N];
    for(int i=0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    for(int j=0; j<K; j++) {
      sum += A[j];
    }
    System.out.println(sum);
  }
}