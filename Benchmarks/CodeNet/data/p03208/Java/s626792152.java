import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int[] heights = new int[n];

		for(int i = 0; i < n; i++) {
			heights[i] = scan.nextInt();
		}

		scan.close();

		Arrays.sort(heights);

		int minDiff = Integer.MAX_VALUE;
		for(int i = 0; i < k; i++) {
			int max = heights[i+k -1];
			int min = heights[i];
			int diff = max - min;
			if(minDiff > diff) minDiff = diff;
		}
		System.out.println(minDiff);
	}

}