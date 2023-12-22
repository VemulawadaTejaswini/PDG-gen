import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] l = new int[n];
		for(int i = 0; i < n; i++) l[i] = scan.nextInt();
		int out = 0;
		for(int i = 0; i < n - 2; i++) {
			for(int j = i; j < n - 1; j++) {
				for(int k = j; k < n; k++) {
				if(i != j && j != k && k != i && l[i] != l[j] && l[j] != l[k] && l[k] != l[i] && l[i] < l[j] + l[k] && l[j] < l[i] + l[k] && l[k] < l[j] + l[i]) {
						out++;
					}
				}
			}
		}
		System.out.println(out);
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
