import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();
    int A[] = new int[N];
    int sum = X;
    D -= 1;
    
    for(int i=0; i<N; i++) {
      A[i] = sc.nextInt();
      sum = sum + 1 + D / A[i];
    }
    System.out.println(sum);
  }
}