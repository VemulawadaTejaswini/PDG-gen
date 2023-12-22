import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );
		int n = Integer.parseInt( br.readLine() );

		String[] str = br.readLine().split(" ");
		Bag[] W = new Bag[n]; // ??´????????????????????? w_i ?????\????????????
		Bag[] orderedW = new Bag[n]; // ??´??????????????????????????\????????????
		for (int i=0; i < n; i++) {
			W[i] = new Bag( Integer.parseInt(str[i]), i );
			orderedW[i] = W[i];
		}

		Arrays.sort(orderedW);
//		for (int i=0; i < w.length; i++)
//			System.out.print(w[i] + " ");

		for (int i=0; i < n; i++) {
			orderedW[i].posti = i;
		}

		/*
		 * 5, 4, 1, 3, 2, : W
		 *
		 *                  W[0] = 5
		 *  , 4, 1, 3, 2, : bag = 5, nextbag = 2,
		 *             5,
		 *
		 *  , 4, 1, 3, 5, : bag = 2, nextbag = 4,
		 *    2,
		 *
		 *  , 2, 1, 3, 5, : bag = 4, nextbag = 3,
		 *          4,
		 *
		 *  , 2, 1, 4, 5, : bag = 3, nextbag = 1,
		 *       3,
		 *
		 *  , 2, 3, 4, 5, : bag = 1, nextbag = 5,
		 * 1,
		 *                  bag = 5,
		 *                  bag.prei = 0
		 *
		 * 1, 2, 3, 4, 5, : orderedW
		 */

		Bag bag, nextbag;
		int mini;
		int count;
		int ans = 0;

		for (int i=0; i < n; i++) {
			bag = W[i];
			if (bag.label == true) continue;
			if (bag.prei == bag.posti) continue;

			bag.label = true;
			count = 0;
			mini = bag.wei;
			while (true) {
				nextbag = W[bag.posti]; // nextbag.prei == bag.posti
				nextbag.label = true;
				count++;
				ans += bag.wei;
				if (nextbag.wei < mini) mini = nextbag.wei;
				bag = nextbag;
				if (bag.prei == i) break;
			}
			ans += mini * (count-2);
		}

		System.out.println(ans);
	}

	static class Bag implements Comparable<Bag> {
		int wei; // weight

		int prei; // pre index ??´?????????????????????????????????

		int posti; // post index ??´??????????????¨?????????????????????

		boolean label = false;

		Bag(int w, int i) {
			this.wei= w;
			this.prei = i;
		}

		@Override
		public int compareTo(Bag b) {
			return this.wei - b.wei;
		}

		@Override
		public String toString() {
			return "" + wei;
		}
	}
}