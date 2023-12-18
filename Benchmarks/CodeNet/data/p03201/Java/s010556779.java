import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static int n, a[];
	static boolean known[];
	
	public static long solve() {
		long ans = 0;
		
		for(int i = n - 1; i >= 0; --i) {
			int key = (int)(Math.log(a[i]) / Math.log(2)) + 1;
			key = (int)Math.pow(2,  key) - a[i];
			known[i] = true;
			int tmp = Arrays.binarySearch(a, key);
			if(tmp >= 0 && tmp != i && known[tmp] != true && a[i] != a[tmp]) {
				ans++;
				known[tmp] = true;
			}
		}
		
		return ans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		a = new int[n];
		known = new boolean[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(a);
		
		long ans = solve();
		System.out.println(ans);
	}

}
