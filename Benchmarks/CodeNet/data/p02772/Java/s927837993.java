import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean result = true;
		int n = sc.nextInt();
		int array[] = new int[n];

		for (int i = 0; i < n  ; i++) {
			if (array[i] % 2) {
				if (array[i] % 3 != 0 || array[i] % 5 != 0) {
					result = false;
				}
			}
		}
		// 結果出力
		System.out.println(result ? "APPROVED" : "DENIED");
	}
}