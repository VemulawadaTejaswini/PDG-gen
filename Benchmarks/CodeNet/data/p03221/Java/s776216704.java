import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int M = Integer.parseInt(scan.next());
		int[] P = new int[M];
		int[] Y = new int[M];
		Map<Integer, List<Integer>> map = new HashMap<>();
		List<Integer> value = new ArrayList<>();
		int key;

		for (int i = 0; i < M; i++) {
			key = Integer.parseInt(scan.next());
			P[i] = key;
			value = map.get(key);
			if(value == null) {
				value = new ArrayList<>();
				map.put(key, value);
			}
			Y[i] = Integer.parseInt(scan.next());
			value.add(Y[i]);
		}


		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			Collections.sort(entry.getValue());
		}

		Map<Integer,Map<Integer,Integer>> index_map = new HashMap<Integer,Map<Integer,Integer>>();
		Map<Integer,Integer> index = new HashMap<>();
		int num;
		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			num =1;
			index = new HashMap<Integer, Integer>();
			for(int year:entry.getValue()) {
				index.put(year, num);
				num++;
			}
			index_map.put(entry.getKey(), index);
		}

		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < M; i++) {
			out.print(String.format("%06d", P[i]));
			out.println(String.format("%06d", index_map.get(P[i]).get(Y[i])));
		}
		out.flush();

	}

	private static int getNumber(int value, List<Integer> value_list) {
		int num = 1;
		for (int v : value_list) {
			if (value == v) {
				return num;
			}
			num++;
		}
		return num;
	}
}
