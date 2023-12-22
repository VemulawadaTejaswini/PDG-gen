import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(maxprof(arr));
	}
	
	public static int maxprof(int[] arr) {
		int maxDiff = arr[1] - arr[0];
		int maxValueSeen = arr[arr.length - 1];
		
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > maxValueSeen) {
				maxValueSeen = arr[i];
				continue;
			} else {
				maxDiff = Math.max(maxDiff, maxValueSeen - arr[i]);
			}
		}
		
		return maxDiff;
	}
}

