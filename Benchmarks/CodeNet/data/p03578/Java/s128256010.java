import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> d = new ArrayList<>();
		for(int i = 0; i < n; i++) d.add(scan.nextInt());
		int m = scan.nextInt();
		int[] t = new int[m];
		for(int i = 0; i < m; i++) t[i] = scan.nextInt();
		if(n < m) {
			System.out.println("NO");
			return;
		}
		for(int i = 0; i < m; i++) {
			boolean isFound = false;
			for(int j = 0; j < d.size(); j++) {
				if(d.get(j) == t[i]) {
					isFound = true;
					d.remove(j);
					break;
				}
			}
			if(!isFound) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
