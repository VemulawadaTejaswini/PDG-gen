import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    
    int[] height = new int[N];
    int heightSum = 0;
    for (int i = 0; i < N-1; i++) {
      if (A[i+1] >= A[i]) {
        height[i+1] = 0;
      } else {
        height[i+1] = A[i] - A[i+1];
        A[i+1] = A[i];
      }
      heightSum += height[i];
    }
    
    System.out.println(heightSum);
  }
}