import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		m.solve();
	}
	public void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] S = new int[(int)Math.pow(2, N)];
		HashMap<Integer, Integer> hash = new HashMap<>();
		for ( int i = 0 ; i < (int)Math.pow(2, N) ; i++ ) {
			S[i] = sc.nextInt();
			if ( hash.containsKey(S[i]) ) {
				int cnt = hash.get(S[i]);
				hash.put(S[i], cnt + 1);
			} else {
				hash.put(S[i], 1);
			}
		}
		sc.close();

		TreeSet<Value> tree = new TreeSet<>();
		for (int key : hash.keySet()) {
			Value v = new Value();
			v.val = key;
			v.count = hash.get(key);
			tree.add(v);
		}

		String ans = "Yes";
		int[] slime = new int[(int)Math.pow(2, N)];
		Value v = tree.last();
		slime[0] = v.val;
		if ( v.count <= 1 ) {
			tree.remove(v);
		} else {
			v.count = v.count - 1;
		}

		for ( int n = 1 ; n <= N ; n++ ) {
			int last = (int)Math.pow(2, n - 1);
			for ( int i = 0 ; i < last ; i++ ) {
				Value val = tree.last();
				if ( val.val >= slime[i] ) {
					ans = "No";
					break;
				} else {
					slime[last + i] = val.val;
					if ( val.count <= 1 ) {
						tree.remove(val);
					} else {
						val.count = val.count - 1;
					}
				}
			}
		}
		System.out.println(ans);
	}

	class Value implements Comparable<Value> {
		int val = 0;
		int count = 0;
		@Override
		public int compareTo(Value o) {
			return this.val - o.val;
		}
		@Override
		public boolean equals(Object o) {
			return ((Value)o).val == this.val;
		}
	}
}
