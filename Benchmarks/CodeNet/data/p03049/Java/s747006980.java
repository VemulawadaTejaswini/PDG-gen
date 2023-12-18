import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int startB = 0;
		int endA = 0;
		int matchCount = 0;
		int abCount = 0;
		for (int i = 0; i < n; i++) {
			char[] arr = sc.next().toCharArray();
			if (arr[0] == 'B' && arr[arr.length - 1] == 'A') {
				startB++;
				endA++;
				matchCount++;
			} else if (arr[0] == 'B') {
				startB++;
				matchCount++;
			} else if (arr[arr.length - 1] == 'A') {
				endA++;
				matchCount++;
			}
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] == 'A' && arr[j + 1] == 'B') {
					abCount++;
				}
			}
		}
		abCount += Math.min(Math.min(startB, endA), Math.max(matchCount - 1, 0));
		System.out.println(abCount);
	}
}
