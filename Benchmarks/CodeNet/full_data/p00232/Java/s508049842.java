
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = scanner.nextInt();
			if ((x | y | z) == 0)
				break;
			int[] v = new int[x];
			for (int i = 0; i < x; i++) {
				v[i] = scanner.nextInt();
			}
			int[][] ev = new int[y + 1][2];
			for (int i = 0; i < z; i++) {
				int b = scanner.nextInt();
				ev[b][0] = scanner.nextInt();
				ev[b][1] = scanner.nextInt();
			}
			Map<Integer, double[]> memo = new HashMap<Integer, double[]>();
			double[] a = new double[y + 1];
			a[0] = 1.0;
			memo.put(0, a);
			for (int i = 0; i < y; i++) {
				Map<Integer, double[]> tmpMap= new HashMap<Integer, double[]>();
				tmpMap.putAll(memo);
				for (Iterator<Entry<Integer, double[]>> iterator = memo
						.entrySet().iterator(); iterator.hasNext();) {
					Entry<Integer, double[]> entry = iterator.next();
					
					if (entry.getValue()[i] == 0)
						continue;
					for (int j = 0; j < x; j++) {
						int key = entry.getKey();
						double[] val = entry.getValue();
						int nm = Math.min(y, i + v[j]);
						if (ev[nm][0] == 1)
							nm = Math.min(y, nm + ev[nm][1]);
						else if (ev[nm][0] == 2)
							key += ev[nm][1];
						else if (ev[nm][0] == 3)
							key = Math.max(0, key - ev[nm][1]);
						if (!memo.containsKey(key)) {
							double[] d = new double[y + 1];
							d[nm] = val[i] / x;
							memo.put(key, d);
						} else {
							double[] d = memo.get(key);
							d[nm] += val[i] / x;
						}
					}
				}

			}
			double ans = 0;
			for (Entry<Integer, double[]> entry : memo.entrySet()) {
				ans += entry.getKey() * entry.getValue()[y];
			}
			System.out.println((int) ans);
		}
	}
}