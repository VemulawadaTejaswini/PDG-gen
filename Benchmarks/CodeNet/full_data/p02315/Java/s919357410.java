
import java.util.Scanner;

/*
 * 着席位置：黒板向かって右から２列目の真ん中
 *
 * https://onlinejudge.u-aizu.ac.jp/#/problems/DPL_1_B
 */

class Main {

	private static int value[];
	private static int weight[];
	private static int maxWeight;

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		//入力１行目
		value = new int[Integer.parseInt(scanner.next())];
		weight = new int[value.length];
		maxWeight = Integer.parseInt(scanner.next());
		//全品物の入力
		for(int i=0; i<value.length; i++) {
			value[i] = Integer.parseInt(scanner.next());
			weight[i] = Integer.parseInt(scanner.next());
		}
		scanner.close();

		boolean controler[] = new boolean[value.length];

		System.out.println(loopBack(controler));

	}

	private static int loopBack(boolean controler[]) {
		int ret = calSum(controler);
		for(int i=0; i<controler.length; i++) {
			if(controler[i]) continue;//無限に呼び出されるの防止
			//controlerのコピーを作って
			boolean b[] = new boolean[controler.length];
			for(int j=0; j<controler.length; j++) {
				b[j] = controler[j];
			}
			b[i] = true;//i番目だけtrueにして
			int ai = loopBack(b);//もう一周
			if(ai > ret) ret = ai;
		}
		return ret;
	}

	//isPickedのtrueの所だけの合計を計算・ただし容量を越えると-1
	private static int calSum(boolean isPicked[]) {
		int v = 0;
		int w = 0;
		for(int i=0; i<isPicked.length; i++) {
			if(isPicked[i]) {
				v += value[i];
				w += weight[i];
			}
		}
		if(w > maxWeight) v = -1;
		return v;
	}

}

