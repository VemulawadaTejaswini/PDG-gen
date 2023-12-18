import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] arr = new int[n][d];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (isSqrt(getDistance(arr[i], arr[j]))) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	static int getDistance(int[] arr1, int[] arr2) {
		int ans = 0;
		for (int i = 0; i < arr1.length; i++) {
			ans += (arr1[i] - arr2[i]) * (arr1[i] - arr2[i]);
		}
		return ans;
	}
	
	static boolean isSqrt(int  x) {
		for (int i = 0; i * i <= x; i++) {
			if (i * i == x) {
				return true;
			}
		}
		return false;
	}
}
