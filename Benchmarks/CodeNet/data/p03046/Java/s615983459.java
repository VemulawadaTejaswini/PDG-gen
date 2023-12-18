import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;

	final int[] nf = {-1};
	void doIt() {
		int m = sc.nextInt();
		int k = sc.nextInt();
		int a[] = solve(m, k);
		for(int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}


	int[] solve(int m, int k){
		if((1 << m) <= k) {
			return this.nf;
		}
		if(m == 1) {
			if(k == 1) return this.nf;
			else {
				int a[] = {0, 0, 1, 1};
				return a;
			}
		}
		return makeArray(m, k);
	}
	int[] makeArray(int m, int k){
		int a[] = new int[(1 << (m + 1))];
		for(int i = 0; i < (1 << m); i++) {
			a[i] = i;
			a[(1 << m + 1) - i - 1] = i;
		}
		int i = k;
		while(i > 0) {
			a[i] = a[i - 1];
			i--;
		}
		a[0] = k;
		i = (1 << (m + 1)) - k - 1;
		while(i > a.length / 2 + 1) {
			a[i] = a[i - 1];
			i--;
		}
		a[a.length / 2 + 1] = k;
		System.out.println(a.length);
		return a;
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
