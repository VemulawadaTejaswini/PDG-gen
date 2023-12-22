import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static final Integer ZERO = Integer.valueOf(0);

	public static void main(String[] args) {
		Map<Integer, Integer> vpmap = new HashMap<Integer, Integer>();
		int[] vlist = { 200, 300, 500, 1000, 1200, 1500 };
		int[] plist = { 380, 550, 850, (int) (380 * 5 * 0.8),
				(int) (550 * 4 * 0.85), (int) (850 * 3 * 0.88) };
		vpmap.put(ZERO, ZERO);
		for (int i = 0; i < 6; i++) {
			for (int vol = 0; vol + vlist[i] < 5000; vol += 100) {
				final int setVol = vol + vlist[i];
				if (vpmap.containsKey(vol)) {
					int prePrice = (vpmap.containsKey(setVol)) ? vpmap
							.get(setVol) : Integer.MAX_VALUE;
					vpmap.put(setVol,
							Math.min(vpmap.get(vol) + plist[i], prePrice));
				}

			}
		}
		Scanner in = new Scanner(System.in);
		int need = 0;
		while ((need = in.nextInt()) != 0) {
			System.out.println(vpmap.get(need));
		}

	}
}