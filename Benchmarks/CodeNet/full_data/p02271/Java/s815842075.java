import java.util.Scanner;

public class Main {
	private static int n, m;
	private static int[] a, b;
	
	public static void main(String[] args) {
		inputData();
		solve();
	}
	
	private static void inputData() {
		try (Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
			a = new int[n];
			for(int i=0; i<n; i++) a[i] = scan.nextInt();
			m = scan.nextInt();
			b = new int[m];
			for(int i=0; i<m; i++) b[i] = scan.nextInt();
		}
	}
	
	private static void solve() {
		for(int i=0; i<m; i++) {
			if(serchNumber(0, b[i])) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
	
	private static boolean serchNumber(int i, int m) {
		if(i == n) return false;
		if(m < 0) return false;
		if(m == 0) return true;
		if(serchNumber(i+1, m)) return true;
		if(serchNumber(i+1, m-a[i])) return true;
		return false;
	}
}

