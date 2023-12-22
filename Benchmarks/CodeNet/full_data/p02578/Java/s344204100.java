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
    for (int i = 1; i < N; i++) {
      if (A[i] >= A[i-1]) {
        height[i] = 0;
      } else {
        height[i] = A[i-1] - A[i];
        A[i] = A[i-1];
      }
      heightSum += height[i];
    }
    
    System.out.println(heightSum);
  }
}