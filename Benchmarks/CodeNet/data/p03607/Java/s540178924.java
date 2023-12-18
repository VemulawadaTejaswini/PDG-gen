import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] a = new int[1000000001];
		Arrays.fill(a, -1);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			a[t] = a[t]*(-1);
		}

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) count++;
		}
		System.out.println(count);


	}
}
