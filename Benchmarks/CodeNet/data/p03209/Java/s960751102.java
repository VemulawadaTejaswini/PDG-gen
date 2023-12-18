import java.util.*;

public class Main {
	public static class Burger {
		int level;
		long meatNum = 1; // level0の初期値
		long breadNum = 0; // level0の初期値
		long layerNum = 1; // level0の初期値

		public Burger(int level) {
			this.level = level;
		}
	}

	int N;
	long X;
	List<Burger> burgers;
	long result;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		X = in.nextLong();
		in.close();

		this.burgers = new ArrayList<>(N + 1);
		for (int i = 0; i <= N; ++i) {
			this.burgers.add(new Burger(i));
		}

		// 各層のmeat, breadの枚数を記入する
		for (int i = 1; i <= N; ++i) {
			Burger prev = this.burgers.get(i - 1);
			// meatの値セット
			this.burgers.get(i).meatNum = prev.meatNum * 2L + 1L;
			// breadの値セット
			this.burgers.get(i).breadNum = prev.breadNum * 2L + 2L;
			// 総layerの値セット
			this.burgers.get(i).layerNum = prev.layerNum * 2L + 3L;
		}
	}

	void calc() {
		result = calcMeatNum(X, N);
	}

	long calcMeatNum(long remainLayerNum, int level) {

		Burger current = burgers.get(level);
		if (remainLayerNum == current.layerNum) {
			// 一致 -> そのまま返す
			return current.meatNum;
		} else if (remainLayerNum == 0L) {
			// 何も食べない
			return 0L;
		} else if (remainLayerNum <= (current.layerNum - 1) / 2) {
			// currentの下半分の中で食べる範囲は収まる
			return calcMeatNum(remainLayerNum - 1, level - 1);
		} else if (remainLayerNum == (current.layerNum + 1) / 2) {
			// ちょうど半分まで
			return burgers.get(level - 1).meatNum + 1;
		} else {
			// 上半分まで食べる
			long result = 1; // 真ん中
			result += burgers.get(level - 1).meatNum; // 下半分
			result += calcMeatNum(remainLayerNum - (current.layerNum + 1) / 2, level - 1);
			return result;
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}

}