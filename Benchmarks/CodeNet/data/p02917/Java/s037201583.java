import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] b = new int[n - 1];
		for(int i = 0; i < n - 1; i++) b[i] = scan.nextInt();
		int sum = b[0] + b[n - 2];
		for(int i = 0; i < n - 2; i++) {
			sum += Math.min(b[i], b[i + 1]);
		}
		System.out.println(sum);
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
