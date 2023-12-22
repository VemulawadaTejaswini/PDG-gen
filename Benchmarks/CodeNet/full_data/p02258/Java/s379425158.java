import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		int ans = -1000000000;
		int min = stdIn.nextInt();

		for (int i=1; i<n; i++) {
			int r = stdIn.nextInt();
			ans = Math.max(ans,r-min);
			min = Math.min(min,r);
		}

		System.out.println(ans);
	}
}