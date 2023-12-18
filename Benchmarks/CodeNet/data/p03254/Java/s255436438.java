import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int A[] = new int[N];
    int count = 0;
    
    for(int i=0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    
    for(int j=0; j<N; j++) {
      if(A[j] <= x) {
        x -= A[j];
        count++;
      } else {
        break;
      }
    }
    System.out.println(count);
  }
}