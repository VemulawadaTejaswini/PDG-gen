import java.util.*;

public class Main {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    long A[] = new long[N];
    long B = 1;
    long C = (long)1000000000 * (long)1000000000;
    
    for(int i=0; i<N; i++) {
      A[i] = sc.nextLong();
    }
    Arrays.sort(A);
    
    for(int i=0; i<N; i++) {
      B *= A[i];
      if(B>C) {
        B = -1;
        break;
      }
    }
    System.out.println(B);
  }
}