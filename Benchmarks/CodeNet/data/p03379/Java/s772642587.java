import java.util.*;

public class Main {
	int N;
	List<Integer> X = new ArrayList<>();
	List<Integer> results = new ArrayList<>();

	private Main(Scanner in) {
		N = Integer.parseInt(in.nextLine());
		for (String token : in.nextLine().split(" ")) {
			X.add(Integer.parseInt(token));
		}
	}

	private void calc() {
		// Xをソートしたリストを作る
		List<Integer> vals = new ArrayList<>(X.size());
		vals.addAll(X);
		Collections.sort(vals);

		// 中央付近の2つの値をとる
		int littleMedium = vals.get(vals.size() / 2 - 1);
		int largeMedium = vals.get(vals.size() / 2);
		for (int i = 0; i < X.size(); ++i) {
			if (X.get(i) <= littleMedium) {
				results.add(largeMedium);
			} else {
				results.add(littleMedium);
			}
		}
	}

	private void show() {
		for (Integer result : results) {
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Main ins = new Main(in);
		in.close();
		ins.calc();
		ins.show();
	}

}