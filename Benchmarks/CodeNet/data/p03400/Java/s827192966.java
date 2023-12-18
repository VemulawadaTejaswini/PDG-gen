import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();
    int[] A = new int[N];
    for (int i=0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    int total =0;
    for (int i=0; i<N; i++) {
      total += (D-1) /A[i] +1;
    }
    total += X;
    System.out.println(total); 
  }
}