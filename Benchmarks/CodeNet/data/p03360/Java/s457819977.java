import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int max = Math.max(a, b);
		max = Math.max(max, c);
		int ans = a + b + c - max;
		for (int i = 1; i <= k; i++) {
			max *= 2;
		}
		System.out.println(ans + max);
		sc.close();
	}
}