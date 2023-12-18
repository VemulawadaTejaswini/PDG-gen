import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N, M, C;
    N = sc.nextInt();
    M = sc.nextInt();
    C = sc.nextInt();
    
    int B[] = new int[M];
    for (int i=0; i<M; i++) {
      B[i] = sc.nextInt();
    }
    
    int count = 0;
    for (int i=0; i<N; i++) {
      int sum = 0;
      for (int j=0; j<M; j++) {
        sum += B[j]*sc.nextInt();
      }
      if (sum+C > 0)
        count++;
    }

    System.out.println(count);
  }
}
