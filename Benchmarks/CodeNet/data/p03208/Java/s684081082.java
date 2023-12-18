import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] trees = new int[n];
		for( int i = 0; i < n; i++ ) {
			trees[i] = in.nextInt();
		}
		Arrays.sort(trees);
		int minDiff = Integer.MAX_VALUE;
		for( int i = 0; i < n-2; i++ ) {
			minDiff = Math.min(minDiff,trees[i+2]-trees[i]);
		}
		System.out.println(minDiff);
	}
}