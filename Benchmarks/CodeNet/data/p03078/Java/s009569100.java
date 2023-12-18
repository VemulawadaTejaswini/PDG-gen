import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] firstLine = br.readLine().split(" ", 4);
		int x = Integer.parseInt(firstLine[0]);
		int y = Integer.parseInt(firstLine[1]);
		int z = Integer.parseInt(firstLine[2]);
		int k = Integer.parseInt(firstLine[3]);
		long[] xs = new long[x];
		String[] secondLine = br.readLine().split(" ", x);
		for (int i = 0; i < x; i++) {
			xs[i] = Long.parseLong(secondLine[i]);
		}
		
		long[] ys = new long[y];
		String[] thirdLine = br.readLine().split(" ", y);
		for (int i = 0; i < y; i++) {
			ys[i] = Long.parseLong(thirdLine[i]);
		}
		long[] zs = new long[z];
		String[] fourthLine = br.readLine().split(" ", z);
		for (int i = 0; i < z; i++) {
			zs[i] = Long.parseLong(fourthLine[i]);
		}
		Arrays.sort(xs);
		Arrays.sort(ys);
		Arrays.sort(zs);
		ArrayList<Long> list = new ArrayList<>();
		for (int i = 0; i < Math.min(k + 1, x); i++) {
			for (int j = 0; j < y && (i + 1) * (j + 1) <= k; j++) {
				for (int l = 0; l < z && (i + 1) * (j + 1) * (l + 1) <= k; l++) {
					list.add(xs[x - 1 - i] + ys[y - 1 - j] + zs[z - 1 - l]);
				}
			}
		}
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append(list.get(list.size() - 1 - i)).append("\n");
		}
		System.out.print(sb);
	}
}
