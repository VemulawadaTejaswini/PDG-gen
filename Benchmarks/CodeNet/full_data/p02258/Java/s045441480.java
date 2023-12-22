import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int R[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			R[i]  = scan.nextInt();
		}

		int ans = Integer.MIN_VALUE;

		int sortedR[] = R.clone();
		Arrays.sort(sortedR);

		int maxIndex = n - 1;
		
		for (int i = 0; i < n - 1; i++) {
			while (R[i] == sortedR[maxIndex]) {
				maxIndex = maxIndex > 0 ? maxIndex-1 : 0;
			}
			ans = Math.max(ans, sortedR[maxIndex] - R[i]);
		}

		System.out.println(ans);
		scan.close();
	}

}