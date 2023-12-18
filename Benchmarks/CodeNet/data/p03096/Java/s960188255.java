import java.util.*;

public class Main {
	int N;
	int[] C;
	Map<Integer, List<Integer>> indexes;
	static final long DIV = 1000000007;
	long result;

	Main() {
		Scanner in = new Scanner(System.in);
		N = Integer.parseInt(in.nextLine());
		C = new int[N];
		for (int i = 0; i < N; ++i) {
			C[i] = Integer.parseInt(in.nextLine());
		}
		in.close();

		this.indexes = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (!this.indexes.containsKey(C[i])) {
				this.indexes.put(C[i], new ArrayList<Integer>());
			}
			this.indexes.get(C[i]).add(i);
		}

		this.result = 0;
		for (Integer key : this.indexes.keySet()) {
			this.result += this.count(this.indexes.get(key));
		}
		this.result--;

	}

	long count(List<Integer> indexes) {
		long result = 1;
		int lastIndex = indexes.get(0);
		for (int i = 1; i < indexes.size(); ++i) {
			if (lastIndex + 1 != indexes.get(i)) {
				result *= 2;
				result %= DIV;
			}
			lastIndex = indexes.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		System.out.println(ins.result);
	}
}