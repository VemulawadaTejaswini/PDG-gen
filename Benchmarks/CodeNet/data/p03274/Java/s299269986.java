import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] nums = new int[N];
	for (int i = 0; i < N; i++) {
      nums[i] = sc.nextInt();
    }
    int[] totalAbs = new int[N - K + 1];
    int[] totalAbsSort = new int[N - K + 1];
	for (int i = N - 1; i > N - K; i--) {
      for (int j = i - (N - K + 1); j <= i; j++) {
        totalAbs[i - (N - K + 1)] += (int) Math.abs(nums[j]);
        totalAbsSort[i - (N - K + 1)] += (int) Math.abs(nums[j]);
      }
    }
    Arrays.sort(totalAbsSort);
    int min = 0;
	for (int i = 0; i < N - K + 1; i++) {
      if (totalAbs[i] == totalAbsSort[0]) {
        min = i;
      }
    }
    if (nums[min] * nums[min + (K - 1)] < 0) {
      System.out.println((int)
                         Math.min(Math.abs(nums[min]), Math.abs(nums[min + (K - 1)])) * 2 + (int) Math.max(Math.abs(nums[min]), Math.abs(nums[min + (K - 1)])));
    } else {
      System.out.println((int) Math.max(Math.abs(nums[min]), Math.abs(nums[min + (K - 1)])));
                                                 
    }
  }
}