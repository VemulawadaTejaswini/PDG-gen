import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		sC();
	}
	
	void sC() {
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		boolean all = true;
		int mod = a[0];
		int idx = 0;
		while(all) {
			for(int i = 0; i < n; i++) {
				if(idx == i)continue;
				if(a[i] != 0) {
					a[i] %= mod;
					if(mod < a[i] || a[i] == 0) continue;
					mod = a[i];
					idx = i;
					break;
				}
				if(i == n - 1)all = false;
			}
		}
		for(int i = 0; i < n; i++) {
			if(a[i] != 0) {
				System.out.println(a[i]);
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
