import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		int ans = -1;
		int min = 200000;

		for (int i=0; i<n; i++) {
			int r = stdIn.nextInt();
			min = Math.min(min,r);
			ans = Math.max(ans,r-min);
		}

		System.out.println(ans);
	}
}