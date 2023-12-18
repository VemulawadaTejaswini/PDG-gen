import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;

	final Integer[] nf = {-1};
	void doIt() {
		int m = sc.nextInt();
		int k = sc.nextInt();
		Integer a[] = solve(m, k);
		for(int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}


	Integer[] solve(int m, int k){
		if((1 << m) <= k) {
			return this.nf;
		}
		if(m == 1) {
			if(k == 1) return this.nf;
			else {
				Integer a[] = {0, 0, 1, 1};
				return a;
			}
		}
		return makeArray(m, k);
	}
	Integer[] makeArray(int m, int k){
		ArrayList<Integer> a = new ArrayList<>();
		a.add(k);
		for(int i = 0; i < (1 << m); i--) {
			if(i == k) continue;
			a.add(i);
		}
		a.add(k);
		for(int i = (1 << m) - 1; i >= 0; i--) {
			if(i == k) continue;
			a.add(i);
		}

		Integer[] ar = a.toArray(new Integer[a.size()]);
		return ar;
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
