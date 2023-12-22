import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		ArrayList<Integer> r = new ArrayList<Integer>();

		for(int i = 1; i <= n; i++) {
			r.add(Integer.parseInt(sc.next()));
		}

		/**
		 * ループ処理
		 * t=1→N-1で探索
		 * Rの最小値を保持し、それを用いてRの差分の最大値を求める
		 */
		int minr = r.get(0);
		int maxdr = r.get(1) - r.get(0);
		for(int i = 2; i < n; i++) {
			if(r.get(i-1) < minr) {
				minr = r.get(i-1);
			}
			if(r.get(i) - minr > maxdr) {
				maxdr = r.get(i) - minr;
			}
		}

		System.out.println(maxdr);

	}

}

