import java.util.*;
import java.lang.Math;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int A[] = new int[N];
    
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    
    for (int i = 0; i < N - 1; i ++) {
      for (int j = i + 1; j <= N - 1; j++) {
        if (A[i] == A[j]) {
          System.out.println("NO");
          return;
        }
      }
    }
    System.out.println("YES");
  }
}