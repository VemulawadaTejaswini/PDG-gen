import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long ans = 0;
    for (int b = 1; b <= N; b++) {
      if (K < b) {
        int plus;
        if ((N + 1) % b > K) {
          plus = (b - K) * ((N + 1) / b) + ((N + 1) % b) - K;
        } else {
          plus = (b - K) * ((N + 1) / b);
        }
        // System.out.println(String.format("b = %d, plus = %d", b, plus));
        ans += plus;
        if (K == 0) ans--;
      }
    }
    System.out.println(ans);
  }

  //指定した値以上の先頭のインデックスを返す
  private static final int lowerBound(final int[] arr, final int value) {
    int low = 0;
    int high = arr.length;
    int mid;
    while (low < high) {
      mid = ((high - low) >>> 1) + low;   //(low+high)/2のオーバーフロー対策
      if (arr[mid] < value) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
 
  //指定した値より大きい先頭のインデックスを返す
  private static final int upperBound(final int[] arr, final int value) {
    int low = 0;
    int high = arr.length;
    int mid;
    while (low < high) {
      mid = ((high - low) >>> 1) + low;   //(low+high)/2のオーバーフロー対策
      if (arr[mid] <= value) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
}