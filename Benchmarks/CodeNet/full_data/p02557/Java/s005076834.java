import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
			solve();
	}
	public static void solve() { 
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		HashMap<Integer, Integer> mapa = new HashMap<>();
		HashMap<Integer, Integer> mapb = new HashMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			mapa.put(a[i], mapa.getOrDefault(a[i], 0) + 1);
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			mapb.put(b[i], mapb.getOrDefault(b[i], 0) + 1);
		}
		boolean ans = true;
		for (int num : mapa.keySet()) {
			if (mapa.get(num) >= (n + 1) / 2) {
				ans = false;
				break;
			}
		}
		if (!ans) {
			System.out.println("No");
			return;
		}

		for (int num : mapb.keySet()) {
			if (mapb.get(num) >= (n + 1) / 2) {
				ans = false;
				break;
			}
		}
		if (!ans) {
			System.out.println("No");
			return;
		}

		System.out.println("Yes");
		for (int i=n-1; i>=0; i--)
			System.out.print(a[i] + " ");
		System.out.println();
	
	}
}