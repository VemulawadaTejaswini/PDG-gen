import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		int k = scan.nextInt() - 1;

		int ans = 0;
		int oneIndex = 0;
		for(int i = 0; i < n; i++) {
			if(scan.nextInt() == 1) oneIndex = i;
		}
		
		ans = solve(n, k, oneIndex);
		for(int i = 1; i < k - 2; i++) {
			ans = Math.max(ans, solve(n, k, oneIndex - i));
			ans = Math.max(ans, solve(n, k, oneIndex + i));
		}
		

		System.out.println(ans);
	}
	
	static int solve(int n, int k, int oneIndex) {
		if(oneIndex < 0 || oneIndex >= n) return 0;
		int ans = 0;
		ans += oneIndex / k;
		if(oneIndex % k != 0) ans++;
		ans += (n - 1 - oneIndex) / k;
		if((n - 1 - oneIndex) % k != 0) ans++;
		return ans;
	}

}
