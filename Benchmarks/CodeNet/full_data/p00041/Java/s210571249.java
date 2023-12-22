import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int NUM = 4;
	static int[][] numPatterns = new int[24][NUM];
	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {
			line = line.trim();
			if (line.equals("0 0 0 0"))
				break;

			String[] splited = line.trim().split(" ");

			int[] num = new int[NUM];
			for (int i = 0; i < NUM; i++) {
				num[i] = Integer.parseInt(splited[i]);
			}

			// 数値の組み合わせ
			numCombination(num, 0);
			// 演算子の組み合わせ
			String result = null;
			for (int i = 0; i < 24; i++) {
				result = opeCombination(numPatterns[i]);
				if(result != null) break;
			}
			if(result == null) result = "0";
			System.out.println(result);
			count = 0;
		}
	}
	/*
	 * 数の組み合わせ一覧を作成する
	 * 処理はキューで行い発見したら終了
	 * @param is　組み合わせる数値配列
	 * 
	 */
	private static String opeCombination(int[] is) {

		Queue<DataSet> que = new LinkedList<DataSet>();
		ArrayList<DataSet> queIndex1 = new ArrayList<DataSet>();
		for (int i = 0; i < is.length; i++) {
			DataSet p = new DataSet(is[i], 0, 1 << i, Integer.toString(is[i]));
			que.offer(p);
		}

		while (!que.isEmpty()) {
			DataSet pf = que.poll();
			if (pf.sumCount == 1) {
				queIndex1.add(pf);
			}
			if (pf.sumCount == NUM - 1 && pf.sum == 10) {
				return pf.ope;
			}

			for (int i = 0; i < is.length; i++) {
				if (((pf.index >> i) & 1) != 1) {
					for (int j = 0; j < 3; j++) {
						DataSet pa = new DataSet();
						switch (j) {
						case 0:
							pa.sum = pf.sum + is[i];
							pa.ope = "(" + pf.ope + "+" + is[i] + ")";
							break;
						case 1:
							pa.sum = pf.sum - is[i];
							pa.ope = "(" + pf.ope + "-" + is[i] + ")";
							break;
						case 2:
							pa.sum = pf.sum * is[i];
							pa.ope = pf.ope + "*" + is[i];
							break;
						}

						pa.sumCount = pf.sumCount + 1;
						pa.index = pf.index + (1 << i);
						if ((pa.sumCount == 2 && pa.sum < 0)
								|| (pa.sumCount == 2 && pa.sum > 20)) 
							continue;
						que.offer(pa);
					}
				}
			}
		}
		// (a ope b) ope (c ope d)
		for (int i = 0; i < queIndex1.size() - 1; i++) {
			for (int j = 0; j < queIndex1.size(); j++) {
				if ((queIndex1.get(i).index + queIndex1.get(j).index) == 0xf) {
					int sum = 0;
					String ope = null;
					for (int k = 0; k < 3; k++) {
						switch (k) {
						case 0:
							sum = queIndex1.get(i).sum
									+ queIndex1.get(j).sum;
							ope = queIndex1.get(i).ope + "+"
									+ queIndex1.get(j).ope;
							break;
						case 1:
							sum = queIndex1.get(i).sum
									- queIndex1.get(j).sum;
							ope = queIndex1.get(i).ope + "-"
									+ queIndex1.get(j).ope;
							break;
						case 2:
							sum = queIndex1.get(i).sum
									* queIndex1.get(j).sum;
							ope = queIndex1.get(i).ope + "*"
									+ queIndex1.get(j).ope;
							break;
						}
						if (sum == 10)
							return ope;
					}
				}
			}
		}
		return null;
	}

	/*
	 * 数の組み合わせ一覧を作成する
	 * @param num2 組み合わせる数値
	 * @param length 組み合わせる箇所
	 */
	private static void numCombination(int[] num2, int length) {
		int[] copy = num2.clone();
		if (length + 1 == NUM) {
			numPatterns[count] = copy;
			count++;
			return;
		}
		for (int i = length; i < NUM; i++) {
			if (i != length) {
				copy[length] ^= copy[i];
				copy[i] ^= copy[length];
				copy[length] ^= copy[i];
			}
			if (length + 1 < NUM)
				numCombination(copy, length + 1);
		}
	}
}

class DataSet {
	int sum; 		//演算結果
	int sumCount;	//演算回数
	int index;		//使用した数値の添字（ビットで管理）
	String ope = null; //演算式

	DataSet(int _sum, int _sumCount, int _index, String _ope) {
		sum = _sum;
		sumCount = _sumCount;
		index = _index;
		ope = _ope;
	}

	public DataSet() {
	}
}