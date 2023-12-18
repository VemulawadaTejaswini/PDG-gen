import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		int[] t = new int[n];
		long sum = T;
		t[0] = Integer.parseInt(sc.next());
		for (int i = 1; i < n; i++) {
			t[i] = Integer.parseInt(sc.next());
			if (t[i] <= t[i - 1] + T) {
				sum += t[i] - t[i - 1];
			}
			else {
				sum += T;
			}
		}
		System.out.println(sum);
	}
}