import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean merged[] = new boolean[n + 1];
		Set<Integer> set = new HashSet<>();
		Arrays.fill(merged, false);
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if(merged[y] && !set.contains(x)) merged[x] = true;
			else {
				set.add(x);
				merged[y] = true;
			}
		}
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			if(!merged[i]) cnt++;
		}
		System.out.println(cnt);
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
