import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N+2];
    A[N+1] = 0; A[0] = 0;
    int count =0;
    for (int i =1; i<N+1; i++) {
      A[i] = sc.nextInt();
    }
    for (int i =0; i<N; i++) {
      for (int j =0; j<N+1; j++) {
        if (j == i) { 
          continue;
        } else if (j == i+1) {
          count += Math.abs(A[j+1] - A[j-1]);
        } else {
          count += Math.abs(A[j+1] - A[j]);
        } 
      }
      System.out.println(count);
      count =0;
    }
  }
}    