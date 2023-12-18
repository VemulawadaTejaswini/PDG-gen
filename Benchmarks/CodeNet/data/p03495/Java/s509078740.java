
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[200010];
		Arrays.fill(b, 0);
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[a[i]]++;
		}

		ArrayList<Integer> c = new ArrayList<>();
		for (int i = 0; i < 200010; i++) {
			if (b[i] != 0) 	c.add(b[i]);
		}

		long ans = 0;
		for (int i = k; i < c.size(); i++) {
			ans += c.get(i);
		}

		System.out.println(ans);
	}
}
