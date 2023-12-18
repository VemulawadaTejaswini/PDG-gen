import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
        
      int[] leftSum = new int[n];
      leftSum[0] = arr[0];
      for(int i = 1; i < n; i++)
        leftSum[i] = leftSum[i-1] + arr[i];

      int[] rightSum = new int[n];
      rightSum[n-1] = arr[n-1];
      for(int i = n-2; i >= 0; i--) {
        rightSum[i] += rightSum[i+1] + arr[i];
      }
      int min = Integer.MAX_VALUE;
      for(int i = 0; i < n - 1; i++)
        min = Math.min(min, Math.abs(leftSum[i] - rightSum[i+1]));
      System.out.println(min);
  }
}