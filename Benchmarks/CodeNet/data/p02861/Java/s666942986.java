import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int x[] = new int[n];
		int y[] = new int[n];

		Integer list[] = new Integer[n];

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");

			x[i] = Integer.parseInt(str[0]);
			y[i] = Integer.parseInt(str[1]);

			list[i] = i;
		}

		double sum = 0;
		int count = 0;

		Permutation<Integer> p = new Permutation<>(list);
		do {
			Integer[] a = p.getTarget();

			for (int i = 0; i < n - 1; i++) {
				int x1 = x[a[i]];
				int y1 = y[a[i]];
				int x2 = x[a[i + 1]];
				int y2 = y[a[i + 1]];

				double dist = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
				sum += dist;
			}
			count++;
		} while (p.next());

		System.out.println(sum / count);

	}
}

class Permutation<T extends Serializable> {

	private int baseIndex;
	private int index;
	private T[] objs;

	private Permutation<T> subPermutation;

	public Permutation(T[] objs) {
		this(0, 0, objs.clone());
	}

	private Permutation(int baseIndex, int index, T[] objs) {
		if (objs == null || objs.length == 0) {
			throw new IllegalArgumentException();
		}

		this.baseIndex = baseIndex;
		this.index = index;
		this.objs = objs;

		if (this.index < this.objs.length - 1) {
			this.subPermutation = new Permutation<T>(this.baseIndex + 1, this.index + 1, this.objs);
		}
	}

	public T[] getTarget() {
		return this.objs;
	}

	public boolean next() {
		if (this.subPermutation == null) {
			return false;
		}

		boolean result = this.subPermutation.next();
		if (result == true) {
			return true;
		}

		this.swap(this.baseIndex, this.index);

		++this.index;
		if (this.objs.length <= this.index) {
			this.index = this.baseIndex;
			return false;
		}

		this.swap(this.index, this.baseIndex);
		return true;
	}

	private void swap(int index1, int index2) {
		T tmp = this.objs[index1];
		this.objs[index1] = this.objs[index2];
		this.objs[index2] = tmp;
	}
}
