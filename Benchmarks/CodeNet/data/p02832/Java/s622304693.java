import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		Arrays.setAll(a, i -> sc.nextInt());

		int k = 0;
		int num = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				k++;
				num++;
			}
		}
		int ans = k != 0 ? n - k : -1;
		System.out.println(ans);
		sc.close();
	}
}
