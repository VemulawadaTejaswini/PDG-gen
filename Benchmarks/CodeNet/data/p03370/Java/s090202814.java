import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), X = sc.nextInt(), no = N, i = 0, t = 0;
		int[] a = new int[N];
		while (no-->0) {
			a[i++] = sc.nextInt();
			t+=a[i-1];
		}
		Arrays.sort(a);
		System.out.println(((X-t)/a[0])+N);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}