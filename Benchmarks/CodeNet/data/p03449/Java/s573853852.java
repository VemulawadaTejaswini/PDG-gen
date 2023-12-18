import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private static int n;

	public static void main(String[] args) {

		Main main = new Main();
		Set<Integer> set = new HashSet<>(5);
		int[][] arr = main.scan();
		int candies = 0;
		int f = 0;
		for (int i = 0; i < n; i++) {
			f += arr[0][i];
			for (int j = i; j < n; j++) {
				candies += arr[1][j];
			}
			set.add(f + candies);
			candies = 0;
		}
		System.out.println(Collections.max(set));
	}

	private int[][] scan() {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[][] arr = new int[2][n];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return arr;
	}
}