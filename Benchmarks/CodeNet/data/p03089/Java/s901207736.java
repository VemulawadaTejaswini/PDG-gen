import java.util.*;

public class Main {
	static class Sub {
		List<Integer> vals = new ArrayList<>();

		List<Integer> getInputs() {
			Collections.sort(vals);
			return vals;
		}
	}

	int N;
	int[] b;
	boolean isEnable = false;
	Deque<Sub> subs = new ArrayDeque<>();

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		b = new int[N];
		for (int i = 0; i < N; ++i) {
			b[i] = in.nextInt();
		}
		in.close();
	}

	void isEnable() {
		this.isEnable = true;
		for (int i = 0; i < N; ++i) {
			if (b[i] > i + 1) {
				this.isEnable = false;
				break;
			}
		}
	}

	void calc() {
		// bを分割する
		for (int i = 0; i < N; ++i) {
			if (b[i] == 1) {
				// 新しいsubを追加
				Sub sub = new Sub();
				sub.vals.add(b[i]);
				this.subs.addLast(sub);
			} else {
				// 最後の要素の末尾に追加
				this.subs.getLast().vals.add(b[i]);
			}
		}
	}

	void show() {
		List<Integer> inputs = new ArrayList<>();
		while (!this.subs.isEmpty()) {
			Sub sub = this.subs.pollLast();
			inputs.addAll(sub.getInputs());
		}
		for (int i = 0; i < inputs.size(); ++i) {
			System.out.println(inputs.get(i));
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.isEnable();
		if (!ins.isEnable) {
			System.out.println("-1");
		} else {
			ins.calc();
			ins.show();
		}

	}

}