import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = scan.nextInt();
		int[] s = new int[n];
		int[] f = new int[n];
		int out = 0;
		for(int i = 0; i < n; i++) {
			s[i] = scan.nextInt();
			f[i] = scan.nextInt();
			if(a < f[i] && b > s[i]) out = 1;
		}
		System.out.println(out);
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}

