
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		int count = 1;
		while (true) {
			String line = reader.readLine();
			if (line.equals("0")) {
				break;
			}
			int w = Integer.parseInt(line);
			int n = Integer.parseInt(reader.readLine());
			int[] v = new int[n];
			int[] k = new int[n];
			for (int i = 0; i < n; i++) {
				StringTokenizer tokenizer = new StringTokenizer(
						reader.readLine(),",");
				v[i] = Integer.parseInt(tokenizer.nextToken());
				k[i] = Integer.parseInt(tokenizer.nextToken());
			}
			int max = 0;
			Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
			memo.put(0, 0);
			for (int i = 0; i < n; i++) {
				Map<Integer, Integer> memotmp = new HashMap<Integer, Integer>();
				memotmp.putAll(memo);
				for (Entry<Integer, Integer> entry : memo.entrySet()) {
					int newK = entry.getKey() + k[i];
					int newV = entry.getValue() + v[i];

					if (memotmp.get(newK) == null) {
						memotmp.put(newK, newV);
					} else {
						int oldV = memotmp.get(newK);
						if (oldV < newV) {
							memotmp.put(newK, newV);
						}
					}
					if (newK <= w) {
						if (memotmp.get(max) < newV) {
							max = newK;
						} else if (memotmp.get(max) == newV) {
							if (max > newK) {
								max = newK;
							}
						}
					}
				}
				memo = memotmp;
			}
			System.out.println(String.format("Case %d:", count));
			System.out.println(memo.get(max));
			System.out.println(max);
			count++;

		}
	}
}