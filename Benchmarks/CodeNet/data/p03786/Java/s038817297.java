import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] arr = new long[n];
      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      long[] prefixSum = new long[n];
      prefixSum[0] = arr[0];
      for(int i = 1; i < n; i++) {
        prefixSum[i] = prefixSum[i-1] + arr[i];
      }
      boolean[] can = new boolean[n];
      can[n-1] = true;
      for(int i = n - 2; i >= 0; i--) {
        long num = prefixSum[i] * 2;
        int idx = lowerUpper(i+1, arr, num);
        if(can[idx]) can[i] = true;
      }
      int cnt = 0;
      for(int i = 0; i < can.length; i++)
        if(can[i]) cnt++;
      System.out.println(cnt);
  }

  private static int lowerUpper(int left, long[] arr, long target) {
    int right = arr.length - 1;
    while(left <= right) {
      int mid = left + (right - left) / 2;
      if(arr[mid] <= target)
        left = mid + 1;
      else right = mid - 1;
    }
    return right;
  }
}