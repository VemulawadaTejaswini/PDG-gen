import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	    java.util.Scanner scanner = new java.util.Scanner(System.in);
	    int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		int count1 = 1;
		int count2 = 0;
		int count3 = 0;
		int maxcount = 1;
		// 1 1 2 2 3 3
		for (int i = 0; i < n - 1; i++) {
			maxcount = Math.max(maxcount, count1+count2+count3);
			int diff = a[i+1] - a[i];
			if (diff == 0) {
				count1++;
			} else if (diff == 1) {
				count3 = count2;
				count2 = count1;
				count1 = 1;
			} else {
				count3 = 0;
				count2 = 0;
				count1 = 1;
				// reset
			}
		}
		if (n > 1) {
			int lastdiff = a[n - 1] - a[n - 2];
			if (lastdiff == 0) {
				count1++;
			} else if (lastdiff == 1) {
				count3 = count2;
				count2 = count1;
				count1 = 1;
			} else {
				count3 = 0;
				count2 = 0;
				count1 = 1;
			}
			maxcount = Math.max(maxcount, count1+count2+count3);
		}
		System.out.println(maxcount);
	}
}
