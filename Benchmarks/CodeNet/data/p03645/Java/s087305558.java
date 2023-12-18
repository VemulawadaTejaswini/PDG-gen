import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		int[] arrayA = new int[m];
		int[] arrayB = new int[m];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 1) {
//				if (listB.contains(b)) {
//					System.out.println("POSSIBLE");
//					return;
//				}
				Arrays.fill(arrayA, b);
			} else if (a == n) {
				Arrays.fill(arrayB, b);
			}
			if (b == 1) {
//				if (listA.contains(a)) {
//					System.out.println("POSSIBLE");
//					return;
//				}
				Arrays.fill(arrayA, a);
			} else if (b == n) {
				Arrays.fill(arrayB, a);
			}
			sc.nextLine();
		}
		sc.close();
		String result = "IMPOSSIBLE";
		for (int i : arrayA) {
			if (Arrays.binarySearch(arrayB, i) >= 0) {
				result = "POSSIBLE";
				break;
			}
		}
		System.out.println(result);
	}
}